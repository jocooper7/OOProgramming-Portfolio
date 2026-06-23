package src.com; 

import java.util.ArrayList;
import java.util.List;

/** object implementation of Dao interface with creation of methods */
public class VehicleInventoryDaoImpl implements VehicleInventoryDao{
    private final static List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle); 
    }

    @Override
    public Vehicle getVehicle(int id) {
        for (Vehicle vehi : vehicles) {
            if (vehi.getId() == id) {
                return vehi;
            }
        }
        return null;
    }

    @Override
    public boolean removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        boolean removed = true;
        return removed;
    }
}