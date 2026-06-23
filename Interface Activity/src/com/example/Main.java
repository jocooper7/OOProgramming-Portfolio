package com.example;

public class Main {

    public static void main(String[] args) {
        // creation of objects
        Shape triangle = new Triangle();
        Shape octagon = new Octagon();
        
        // calling methods to create outputs
        ShapeController controller = new ShapeController(triangle, octagon);
        controller.start();   
    }
    
}
