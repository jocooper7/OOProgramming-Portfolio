package com.example;

public class Main {
   
    public static void main(String[] args) {
        
        // creation of basic list items
        Dog dog1 = new Dog(1, "Poodle");
        Dog dog2 = new Dog(2, "Labrador");
        Dog dog3 = new Dog(3, "Husky"); 
        
        DogDao dao = new DogDaoImpl();
        
        DogDaoImpl.dogs.add(dog1);
        DogDaoImpl.dogs.add(dog2);
        DogDaoImpl.dogs.add(dog3);  
        
        DogController controller = new DogController(dao);
        
        controller.start();     
        
    }
}
