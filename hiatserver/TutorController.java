/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

/**
 *
 * @author gprok
 */
public class TutorController implements StudentMessageListener {
    
    /** Server thread reference */
    private TutorServer server;
    
    /**
     * Starts the server thread 
     */
    public TutorController() {
        server = new TutorServer();
        server.setStudentMessageListener(this);
        server.start();
    }

    @Override
    public void messageReceived(int id, String type, String value) {
        System.out.println("MSG : " + value);
    }
    
}
