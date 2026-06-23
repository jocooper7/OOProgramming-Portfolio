package src.com;

public class Main {
    public static void main(String[] args) {

        VehicleInventoryUI ui = new VehicleInventoryUIImpl();
        VehicleInventoryView view = new VehicleInventoryView(ui);
        VehicleInventoryDao dao = new VehicleInventoryDaoImpl();
        VehicleInventoryController controller = new VehicleInventoryController(view, dao);

        controller.start();
    }
}