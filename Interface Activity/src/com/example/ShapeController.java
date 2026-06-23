package com.example;

// controls objects created in main to run displayInfo() commands properly
public class ShapeController {    
    private final Shape shape1;
    private final Shape shape2;

    public ShapeController(Shape shape1, Shape shape2) {
        this.shape1 = shape1;
        this.shape2 = shape2;
    }  
    
    public void start(){
      displayShapeInfo(shape1);
      displayShapeInfo(shape2);
    }
    
    public void displayShapeInfo(Shape shape){
      shape.displayInfo();
    }
    
}
