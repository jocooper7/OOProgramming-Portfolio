package src.com;

public class Car extends Vehicle {
    private boolean awd = false;

    public Car(int id, String name, double price, boolean inStock, boolean awd) {
        super(id, name, price, inStock);
        this.awd = awd;
    }

    public void setawd(boolean awd) {
        this.awd = awd;
    }

    public boolean getawd() {
        return this.awd;
    }
}