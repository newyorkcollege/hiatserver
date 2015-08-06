/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gprok
 */
public class TutorThread implements Runnable {
    
    /** Thread which executes run */
    private Thread th;
    /** Socket which connects with the incoming client */
    private Socket socket;
    /** Defines if the thread should stay alive or stop */
    private boolean alive;
    /** ID of this client */
    private int id;
    
    
    /**
     * COnstructor.
     * Initializes vars
     * @param s Socket which connected with the incoming client
     */
    public TutorThread(Socket s, int counter) {
        socket = s;
        alive = true;
        id = counter;
    }

    
    /**
     * Runs the thread.
     * Creates a reader and keeps reading values sent from the client
     */
    @Override
    public void run() {
        try {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            
            out.println(Integer.toString(id));
            
            BufferedReader input =
                            new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(alive) {
                String answer = "";
                while((answer = input.readLine()) != null) {
                    System.out.println(answer);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TutorThread.class.getName()).log(Level.SEVERE, null, ex);
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
