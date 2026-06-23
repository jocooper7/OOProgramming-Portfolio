package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeController {
    
    private final EmployeeDao employeeDao;

    public EmployeeController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    
    public void start(){
        /** implemenation of program driver/menu */
        
        boolean running = true;
        
        while(running){
            System.out.println("");
            displayMenu();
            Scanner scnr = new Scanner(System.in);
            System.out.print("Enter choice: ");
            String choice = scnr.nextLine();
            
            switch(choice){
                case "1":
                    System.out.println("Income Calculator");
                    calculateIncome(scnr);
                    break;
                case "2":
                    System.out.println("Team Divison");
                    calculateTeamDivision(scnr);
                    break;
                case "3":
                    System.out.println("View Employee");
                    viewEmployee();
                    break;
                case "0":
                    System.out.println("End!");
                    scnr.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;              
            }            
        }    
    }
    
    public void displayMenu(){    
        System.out.println("LYNX Software Systems");
        System.out.println("Enter 1: (Income calculator), 2: (Team division), 3: (View Employee), 0: (Exit)");
    }
    
    public void calculateIncome(Scanner scnr){     
        /** calculates total pay given hours worked and wage.
         *  implementation catches exception when user inputs wrong data type.*/
        System.out.print("Hours worked: ");
        try {
            String hours = scnr.next();
            int intHours = Integer.parseInt(hours);
            System.out.print("Hourly pay: ");
            double pay = scnr.nextDouble();
            double result = intHours * pay;
            System.out.println("Total: $" + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Hours worked must be a number!");
        }
        catch (InputMismatchException e) {
            System.out.println("Hourly pay must be a number!");
        }
    }
    
    public void calculateTeamDivision(Scanner scnr){   
        /** divides total employees into group totals via integer division. 
         *  exceptions caught prevent crash on divisor of 0 and letter input.*/     
        System.out.print("Enter number of groups for 100 employes: ");
        try {
            int groups = scnr.nextInt();
            int result = 100 / groups;
            System.out.println(result + " people per group!");
        }    
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
        catch (InputMismatchException e) {
            System.out.println("Group must be a number!");
        }
    }
    
    public void viewEmployee(){   
        /** base program implements this method as null
         *  further implementation will be required for
         *  more functionality */ 
        Employee employee = null;
        try {
            employee.getName();
        }
        catch (NullPointerException e) {
            System.out.println("Please contact customer support for this error!");
        }
    }
    
}
