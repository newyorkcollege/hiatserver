/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

/**
 * Provides the student listener behavior
 * To be implemented by any class which wants to respond to 
 * message events coming from a student (client)
 * @author gprok
 */
public interface StudentMessageListener {
    
    public void messageReceived(int id, String type, String value);
    
    
}
