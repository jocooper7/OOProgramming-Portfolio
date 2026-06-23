package src.com;

import java.util.List;

/** controls the program, with looping menu and methods to access other class methods */
public class VehicleInventoryController {
    private final VehicleInventoryView view;
    private final VehicleInventoryDao dao;


    public VehicleInventoryController(VehicleInventoryView view, VehicleInventoryDao dao) {
        this.view = view;
        this.dao = dao;
    }

    // looping menu for user interaction 
    public void start() {
        boolean loop = true;
        
        while (loop) { 
            view.displayMainMenu();
            try {
                int choice = view.enterMenuChoice("Enter a choice: ");

                switch (choice) {
                    case 1:
                        listAllVehicles();
                        break;
                    case 2:
                        createVehicle();
                        break;
                    case 3:
                        findVehicle();
                        break;
                    case 4:
                        deleteVehicle();
                        break;
                    case 5:
                        shutDown("Good Bye!\n\nProcess finished with exit code 0");

                    // default case for if number is not in menu selections
                    default:
                        System.out.println("");
                        System.out.println("Invalid choice!");
                }
            }
            // catches exception of non-integer input
            catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("Invalid choice!");
            }
        }
    }

    public void listAllVehicles() {
        List<Vehicle> vehicles = dao.getAllVehicles();
        view.displayAllVehicles(vehicles);
    }

    // creation of new vehicle method w/ input validation for unused ID number
    // and NumberFormatException for if invalid types are input for ID, price, and hull
    public void createVehicle() {
        System.err.println("");
        System.out.println("Add Vehicle Menu:");
        try {
            String vehiType = view.enterVehicleType("Enter vehicle type (boat, car, or plane): ");
            Vehicle currVehi = view.enterNewVehicleData(vehiType);
            List<Vehicle> vehicles = dao.getAllVehicles();
            boolean exists = false;
            for (Vehicle vehi : vehicles) {
                if (vehi.getId() == currVehi.getId()) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                dao.addVehicle(currVehi);
            }
            else {
                System.out.println("");
                System.out.println("Vehicle ID already exists! Please try again!");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Input of wrong data type");
        }
    }

    // search Dao list by input ID and displays vehicle w/ null if ID is not found
    // catches NumberFormatException for invalid data type input
    public void findVehicle() {
        System.out.println("");
        System.out.println("Vehicle View Menu: ");
        try {
            int inputId = view.enterVehicleId("Enter Vehicle ID: ");
            Vehicle vehi = dao.getVehicle(inputId);
            if (vehi == null) {
                System.out.println("Vehicle not found!");
            }
            else {
                view.displayVehicleInfo(vehi);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Input of wrong data type");
        }
    }

    // search Dao list by input ID and removes matching ID vehicle if exists
    // catches NumberFormatException for invalid data type input
    public void deleteVehicle() {
        System.out.println("");
        System.out.println("Remove Vehicle Menu: ");
        try {
            int inputId = view.enterVehicleId("Enter Vehicle ID: ");
            Vehicle vehi = dao.getVehicle(inputId);
            if (vehi == null) {
                System.out.println("Vehicle not found!");
            }
            else {
                dao.removeVehicle(vehi);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Input of wrong data type");
        }
    }

    public void shutDown(String message) {
        System.out.printf(message);
        System.exit(0);
    }
}