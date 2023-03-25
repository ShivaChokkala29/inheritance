// Doctor.java
public class Doctor extends HospitalEmployee {
    private String specialty;
    
    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }
    
    public String getSpecialty() {
        return specialty;
    }
    
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    public String toString() {
        return super.toString() + " " + specialty;
    }
    
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " + super.getName() + " is a(n) " + specialty + " doctor.");
    }
}

