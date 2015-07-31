/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiatserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gprok
 */
public class TutorServer implements Runnable {
    
    private Thread th;

    @Override
    public void run() {
        try {
            ServerSocket listener = new ServerSocket(9090);
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
    
    public void start ()
    {
        if (th == null)
        {
           th = new Thread(this);
           th.start ();
        }
   }
    
}
