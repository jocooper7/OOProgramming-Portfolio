package src.com;

public class Boat extends Vehicle {
    private double hullSize = -1.0;

    public Boat(int id, String name, double price, boolean inStock, double hullSize) {
        super(id, name, price, inStock);
        this.hullSize = hullSize;
    }

    public void setHullSize(double hullSize) {
        this.hullSize = hullSize;
    }

    public double getHullSize() {
        return this.hullSize;
    }
}