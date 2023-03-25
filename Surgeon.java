

// Surgeon.java
public class Surgeon extends Doctor {
    private boolean operating;
    
    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }
    
    public boolean isOperating() {
        return operating;
    }
    
    public void setOperating(boolean operating) {
        this.operating = operating;
    }
    
    public String toString() {
        return super.toString() + " Operating: " + operating;
    }
    
    public void work() {
        System.out.println(super.getName() + " works for the hospital. " + super.getName() + " is " + (operating ? "operating now." : "not operating."));
    }
}
