/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

/**
 *
 * @author gprok
 */
public interface StudentMessageListener {
    
    public void messageReceived(int id, String type, String value);
    
}
