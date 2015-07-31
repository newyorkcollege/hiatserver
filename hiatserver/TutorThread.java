/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiatserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gprok
 */
public class TutorThread implements Runnable {
    
    private Thread th;
    private Socket socket;
    private BufferedReader input;
    private boolean alive;
    
    public TutorThread(Socket s) {
        socket = s;
        alive = true;
    }

    @Override
    public void run() {
        try {
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
    
    
    public void start ()
    {
        if (th == null)
        {
           th = new Thread(this);
           th.start ();
        }
   }
}
