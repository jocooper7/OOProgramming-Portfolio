package com.example;

public class Main {
   
    public static void main(String[] args) {             
          
        EmployeeDao dao = new EmployeeDaoImpl();
        EmployeeController controller = new EmployeeController(dao);
        controller.start();        
    }    
}
