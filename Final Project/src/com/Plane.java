package src.com; 

public class Plane extends Vehicle {
    private boolean twinEngine = false;

    public Plane (int id, String name, double price, boolean inStock, boolean twinEngine) {
        super(id, name, price, inStock);
        this.twinEngine = twinEngine;
    }

    public void setTwinEngine(boolean twinEngine) {
        this.twinEngine = twinEngine;
    }

    public boolean isTwinEngine() {
        return this.twinEngine;
    }
}