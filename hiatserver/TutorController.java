/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

/**
 *
 * @author gprok
 */
public class TutorController {
    
    /** Server thread reference */
    private TutorServer server;
    
    /**
     * Starts the server thread 
     */
    public TutorController() {
        server = new TutorServer();
        server.start();
    }
    
}
