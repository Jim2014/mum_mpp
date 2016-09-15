package edu.mum.cs.cs401.entity;

/**
 * Created by 985333 on 9/13/2016.
 */
public class CopyBook {
    int copyNumber;
    boolean availablity;

    public int getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(int copyNumber) {
        this.copyNumber = copyNumber;
    }

    public boolean isAvailablity() {
        return availablity;
    }

    public void setAvailablity(boolean availablity) {
        this.availablity = availablity;
    }

    @Override
    public String toString() {
        return "CopyBook{" +
                "copyNumber=" + copyNumber +
                ", availablity=" + availablity +
                '}';
    }
}
