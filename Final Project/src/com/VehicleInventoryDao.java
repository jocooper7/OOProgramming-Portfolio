package src.com;

import java.util.List;

/** setting up the interface of the program's Dao */
public interface VehicleInventoryDao {

    List<Vehicle> getAllVehicles();
    
    void addVehicle(Vehicle vehicle);

    Vehicle getVehicle(int id);

    boolean removeVehicle(Vehicle vehicle);
}