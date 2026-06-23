package com.example;

public class Employee {
    
    private int id;
    private String name;
    private int hours;
    private double pay;

    public Employee(int id, String name, int hours, double pay) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.pay = pay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    
    
}
