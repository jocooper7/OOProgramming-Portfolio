package com.example;

import java.util.List;
import java.util.Scanner;

/** Program controller of dog object creation and control over the list */

public class DogController {
    
    Scanner scnr = new Scanner(System.in);
    
    private final DogDao dao;

    public DogController(DogDao dao) {
        this.dao = dao;
    }
    
    public void start(){
      
        int choice = -1;
        
        while(choice != 0){
            displayMenu();
            choice = enterChoice();
            
            switch(choice){
                case 1:
                    listDogs();
                    break;
                case 2:
                    insertDog();
                    break;
                case 3:
                    findDog();
                    break;
                case 4:
                    editDog();
                    break;
                case 5:
                   removeDog();
                    break;
                case 0:
                    System.out.println("End!");                    
                    break;
                default:
                    System.out.println("Incorrect input!");
            }

        }
        System.exit(0);
        
    }
    
    public void displayMenu(){
        System.out.println();
        System.out.println("Malibu Kennels ");
        System.out.println("---------------- ");
    }
    
    public int enterChoice(){
    
        System.out.println("Enter a choice of 1(List all dogs), 2(Create dog entry), 3(Retrieve ID info),");
        System.out.println("                  4(Update entry), 5(Delete entry), or 0(Exit program)!");
        System.out.print("Enter choice: ");
        int choice = scnr.nextInt();
        return choice;
    }
    
    //
    public void listDogs(){        
        List<Dog> dogList = DogDaoImpl.dogs;
        for (Dog currDog : dogList) {
            System.out.println(currDog.toString());
        }        
    }
    
    //
    public void insertDog(){

        List<Dog> dogList = DogDaoImpl.dogs;
        System.out.print("Enter id: ");
        int id = scnr.nextInt();
        scnr.nextLine(); // clears keyboard buffer before nextLine()
        System.out.print("Enter breed: ");
        String breed = scnr.nextLine();
        // checking to see if dog ID is already being used
        boolean exists = false;
        for(Dog dog : dogList) {
            if(dog.getId() == id) {
                exists = true;
            }
        }
        if (!exists) {
            Dog currDog = new Dog(id, breed); 
            dogList.add(currDog);
            System.out.println("Dog added!");
        }  
        else {
            System.out.println("Dog ID already exists.");
        }
    }
    
    public void findDog(){

        List<Dog> dogList = DogDaoImpl.dogs;
        System.out.print("Enter id: ");
        int id = scnr.nextInt();
        boolean found = false;
        Dog foundDog = null;      
        for(Dog dog : dogList){           
            if(dog.getId() == id){
                foundDog = dog;
                found = true;
                break;
            }        
        }
        if (found) {
            System.out.println("Dog found!");
            System.out.println(foundDog.toString());
        }
        else {
            System.out.println("Dog not found!");
        }
    }
    
    public void editDog(){
        
        List<Dog> dogList = DogDaoImpl.dogs;
        System.out.print("Enter id: ");
        int id = scnr.nextInt();
        scnr.nextLine(); // clears keyboard buffer before nextLine()      
        Dog foundDog = null;        
        for(Dog dog : dogList){           
            if(dog.getId() == id){
                foundDog = dog;
            }             
        }      
        if(foundDog != null){   
            System.out.print("Edit breed: ");
            String breed = scnr.nextLine();        
            foundDog.setBreed(breed);
            System.out.println("Dog updated!");
        }
        else{
            System.out.println("Dog not found!");
        }
    }
    
    public void removeDog(){

        List<Dog> dogList = DogDaoImpl.dogs;
        System.out.print("Enter id: ");
        int id = scnr.nextInt();
        boolean found = false;
        Dog foundDog = null;      
        for(Dog dog : dogList){           
            if(dog.getId() == id){
                foundDog = dog;
                found = true;
                break;
            }             
        }     
        if(found){
            dogList.remove(foundDog);
            System.out.println("Entry has been removed.");
        }
        else{
            System.out.println("Dog not found!");
        }        
    }    
}
