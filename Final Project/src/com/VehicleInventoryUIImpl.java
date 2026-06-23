package src.com;

import java.util.Scanner;

/** object implementation of UI interface with creation of methods */
public class VehicleInventoryUIImpl implements VehicleInventoryUI {
    private final Scanner keyboard = new Scanner(System.in);

    @Override
    public void output(String message) {
        System.out.println(message);
    }

    @Override
    public int inputInt(String prompt){
        System.out.print(prompt);
        String input = keyboard.next();
        int num = Integer.parseInt(input);
        return num;
    }

    @Override
    public String inputString(String prompt) {
        System.out.print(prompt);
        String input = keyboard.next();
        return input;
    }

    @Override
    public double inputDouble(String prompt) {
        System.out.print(prompt);
        String input = keyboard.next();
        double num = Double.parseDouble(input);
        return num;
    }

    @Override
    public boolean inputBoolean(String prompt) {
        System.out.print(prompt);
        while (!keyboard.hasNextBoolean()) {
            System.out.println("Invalid Input");
            keyboard.next();
            System.out.print("Try again: ");
        }
        boolean val = keyboard.nextBoolean();
        return val;
    }
}