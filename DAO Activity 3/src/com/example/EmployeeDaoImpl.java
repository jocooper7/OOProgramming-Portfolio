package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    
    public static List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> readEmployees() {        
        return employees;
    }

    @Override
    public void createEmployee(Employee employee) {
        employees.add(employee);
    }
    
}
