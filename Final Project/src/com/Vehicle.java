package src.com;

/** Base vehicle class to be extended 
 *  includes set and get methods of base attributes */
public abstract class Vehicle {
    private int id = -1;
    private String name = "";
    private double price = -1.0;
    private boolean inStock = false;

    public Vehicle(int id, String name, double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock (boolean inStock) {
        this.inStock = inStock;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isInStock() {
        return this.inStock;
    }
    
}