/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

import java.util.ArrayList;

/**
 * Maintains the appropriate Data Structures to hold data sent by the clients.
 * There are 3 Array Lists, one for Interesting records, one for Understanding
 * records, and one for the Message records 
 * @author gprok
 */
public class DataStore {
    
    /** List of the received Interesting values */
    private ArrayList<NumberRecord> IList;
    /** List of the received Understanding values */
    private ArrayList<NumberRecord> UList;
    
    public DataStore() {
        IList = new ArrayList<NumberRecord>();
        UList = new ArrayList<NumberRecord>();
    }
    
    public void addNumber(NumberRecord n, String type) {
        // Check type
        
        // Search respective list for n->id
        
        // if found replace value
        
        // else add record to the list
    }
    
}
