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
    
    private NumberRecord nRecord;
   
    
    private DataStore data;
    
    private TutorView tutorFrame;
    
    
    // Create Data Store ref
    
    /**
     * Starts the server thread 
     */
    public TutorController() {
        server = new TutorServer();
        server.setStudentMessageListener(this);
        data = new DataStore();
        tutorFrame = new TutorView();
        
        server.start();
    }
    
    

    @Override
    public void messageReceived(int id, String type, String value) {
        System.out.println("MSG : " + value);
        
        // Create new number record
        // ask Data Store to add Number record
        // Now, display average
        
        int integerValue = Integer.parseInt(value);
        
        nRecord = new NumberRecord(id,integerValue);
        
        nRecord.setId(id);
        nRecord.setValue(integerValue);
        
        data.addNumber(nRecord, type);
        
        
        tutorFrame.setInterest(data.getAverageInteresting());
        tutorFrame.setUnderstand(data.getAverageUnterstanding());
        tutorFrame.setID(data.getSize());
        
  }
    
 
    
}
