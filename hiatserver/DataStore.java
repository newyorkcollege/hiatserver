/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Maintains the appropriate Data Structures to hold data sent by the clients.
 * There are 3 Array Lists, one for Interesting records, one for Understanding
 * records, and one for the Message records
 *
 * @author gprok
 */
public class DataStore {

    /**
     * List of the received Interesting values
     */
    private ArrayList<NumberRecord> iList;
    /**
     * List of the received Understanding values
     */
    private ArrayList<NumberRecord> uList;
    
    

    Iterator<NumberRecord> iter_IList;
    Iterator<NumberRecord> iter_UList;

    

    public DataStore() {
        iList = new ArrayList<NumberRecord>();
        uList = new ArrayList<NumberRecord>();
        
    }

    public void addNumber(NumberRecord n, String type) {
        // Check type
        // Search respective list for n->id
        // if found replace value
        // else add record to the list
        iter_IList = iList.iterator();
        iter_UList = uList.iterator();

        int theID = n.getId();
        int theValue = n.getValue();

        if (type.equals("I")) {
            boolean found = false;

            while (iter_IList.hasNext()) {

                NumberRecord tmp = iter_IList.next();

                if (tmp.getId() == theID) {
                    // Record exists
                    tmp.setValue(theValue);
                    found = true;
                    break;
                }

            }

            if (!found) {
                iList.add(n);
            }
        }

        if (type.equals("U")) {
            boolean found = false;

            while (iter_UList.hasNext()) {

                NumberRecord tmp = iter_UList.next();

                if (tmp.getId() == theID) {
                    // Record exists
                    tmp.setValue(theValue);
                    found = true;
                    break;
                }

            }

            if (!found) {
                uList.add(n);
            }
        }

    }
    
    

    public double getAverage(ArrayList<NumberRecord> list) {
        int total = 0;
        for (NumberRecord r : list) {
            int tmp = r.getValue();
            total = total + tmp;
    }
        return (double) total / list.size();
    }

    public double getAverageInteresting() {
        return getAverage(iList);
    }

    public double getAverageUnterstanding() {
        return getAverage(uList);
    }

    public int getSize(){
        int interest = iList.size();
        int understand = uList.size();
        
        if(interest>=understand){
            return interest;
        }
        else{
            return understand;
        }
    }


}
