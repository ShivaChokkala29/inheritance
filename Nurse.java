
// Nurse.java
public class Nurse extends HospitalEmployee {
    private int numOfPatients;
    
    public Nurse(String name, int number, int numOfPatients) {
        super(name, number);
        this.numOfPatients = numOfPatients;
    }
    
    public int getNumOfPatients() {
        return numOfPatients;
    }
    
    public void setNumOfPatients(int numOfPatients) {
        this.numOfPatients = numOfPatients;
    }
    
    public String toString() {
        return super.toString() + " has " + numOfPatients + " patients.";
    }
    
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " + super.getName() + " is a nurse with " + numOfPatients + " patients.");
    }
}