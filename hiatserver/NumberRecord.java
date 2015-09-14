/*
 * This software is open source and it is provided as-is without and warranty.
 * Licence file to be added soon.
 */
package hiatserver;

/**
 * Represents a record of a I (interesting) or U (understanding) value
 * @author gprok
 */
public class NumberRecord {
    
    /** ID of the client who sent this value */
    private int id;
    /** Value sent by the client */
    private int value;

    public NumberRecord(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
}
