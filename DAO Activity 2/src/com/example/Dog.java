package com.example;

/** Implementation of dog class to be used for list creation */

public class Dog {
    private int id;
    private String breed;

    public Dog(int id, String breed) {
        this.id = id;
        this.breed = breed;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "id=" + id + ", breed=" + breed + '}';
    }
    
    
        
}
