package src.com;


import java.util.List;

public class VehicleInventoryView {

    private final VehicleInventoryUI ui;

    public VehicleInventoryView(VehicleInventoryUI ui) {
        this.ui = ui;
    } 

    // menu display to be called by controller
    public void displayMainMenu(){
        displayMessage("");
        displayMessage("Main Menu");
        displayMessage("1: Display All Vehicles.");
        displayMessage("2: Add Vehicle.");
        displayMessage("3: View Vehicle.");
        displayMessage("4: Remove Vehicle.");
        displayMessage("5: Exit.");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    // display with loop of all vehicle base attributes
    public void displayAllVehicles(List<Vehicle> vehicles) {
        displayMessage("");
        displayMessage("Display Vehicles Menu");
        String format = "%-5s %-10s %15s %10s %n";
        System.out.printf(format, "ID", "|Name", "|Price","|In Stock");
        for (Vehicle vehi : vehicles) {
            System.out.printf(format, vehi.getId(), vehi.getName(), vehi.getPrice(), vehi.isInStock());
        }
        displayMessage("");
    }

    // display of individual vehicle based on ID along w/ class specific attributes 
    public void displayVehicleInfo(Vehicle vehicle) {
        displayMessage("Vehicle found!");
        displayMessage("ID: " + vehicle.getId());
        displayMessage("Name: " + vehicle.getName());
        displayMessage("Price: " + vehicle.getPrice());
        displayMessage("In Stock: " + vehicle.isInStock());
        switch (vehicle){
            case Boat boat -> displayMessage("Hull Size: " + boat.getHullSize());
            case Car car -> displayMessage("All Wheel Drive: " + car.getawd());
            case Plane plane -> displayMessage("Twin Engine: " + plane.isTwinEngine());
            default -> displayMessage("");
        } 
    }

    // input is validated in Controller
    public int enterMenuChoice(String prompt) {
        return ui.inputInt(prompt);
    }

    
    // creation of new vehicle method
    // vehicle type has already been validated via enterVehicleType() method
    public Vehicle enterNewVehicleData(String vehicleType) {
        int id = enterVehicleId("Enter id: ");
        String name = ui.inputString("Enter name: ");
        double price = ui.inputDouble("Enter price: ");
        boolean inStock = ui.inputBoolean("In stock? (Enter true or false): ");

        if (vehicleType.equalsIgnoreCase("car")) {
            boolean awd = ui.inputBoolean("All Wheel Drive? (Enter true or false): ");
            Vehicle currVehicle = new Car(id, name, price, inStock, awd);
            return currVehicle;
        }
        else if (vehicleType.equalsIgnoreCase("plane")) {
            boolean twinEngine = ui.inputBoolean("Twin Engine? (Enter true or false): ");
            Vehicle currVehicle = new Plane(id, name, price, inStock, twinEngine);
            return currVehicle;
        }
        else if (vehicleType.equalsIgnoreCase("boat")) {
            double hullSize = ui.inputDouble("Enter hull size: ");
            Vehicle currVehicle = new Boat(id, name, price, inStock, hullSize);
            return currVehicle;
        }
        // dummy return null for compilation
        else {
            return null;
        }     
    }

    // input validation for Vehicle Type
    public String enterVehicleType(String prompt) {
        boolean loop = true;
        while (loop) {
            String value = ui.inputString(prompt);
            if (value.equalsIgnoreCase("boat") || value.equalsIgnoreCase("car") || value.equalsIgnoreCase("plane")) {
                return value;
            }
            else {
                displayMessage("Invalid choice!");
            }
        }
        // method loops until valid input. dummy return null for compilation
        return null;
    }

    public int enterVehicleId(String prompt) {
        int value = ui.inputInt(prompt); 
        return value;
    }
}