package src.com;

/** setting up the interface of the program's user input methods */
public interface VehicleInventoryUI {

    void output(String message);

    int inputInt(String prompt);

    String inputString(String prompt);

    double inputDouble(String prompt);

    boolean inputBoolean(String prompt);
}