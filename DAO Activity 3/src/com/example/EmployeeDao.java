package com.example;

import java.util.List;

public interface EmployeeDao {
    
    List<Employee> readEmployees();
    void createEmployee(Employee employee);
}
