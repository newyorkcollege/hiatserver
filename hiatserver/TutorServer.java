/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gprok
 */
public class TutorServer implements Runnable {
    
    /** Thread to execute current run method */
    private Thread th;

    
    /**
     * Thread code. 
     * Listens for incoming connections and starts an individual thread 
     * per connection.
     */
    @Override
    public void run() {
        try {
            Properties prop = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("hiatserver/tutor.properties");
            prop.load(inputStream);
            
            int port = Integer.parseInt(prop.getProperty("server_port"));
            
            ServerSocket listener = new ServerSocket(port);
            System.out.println("Server started. Waiting for connections");
            try {
                while (true) {
                    Socket socket = listener.accept();
    
                        
                    System.out.println("Connection received");

                    TutorThread t = new TutorThread(socket);
                    t.start();
                        
                }
            }
            finally {
                listener.close();
            }
        }
        catch (IOException ex) {
            Logger.getLogger(TutorServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Starts the thread
     */
    public void start ()
    {
        if (th == null)
        {
           th = new Thread(this);
           th.start ();
        }
   }
    
}
