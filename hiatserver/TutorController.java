/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiatserver;

/**
 *
 * @author gprok
 */
public class TutorController {
    
    private TutorServer server;
    
    public TutorController() {
        server = new TutorServer();
        server.start();
        
    }
    
}
