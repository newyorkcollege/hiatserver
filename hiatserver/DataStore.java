/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

import java.util.ArrayList;

/**
 *
 * @author gprok
 */
public class DataStore {
    
    private ArrayList<NumberRecord> IList;
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
