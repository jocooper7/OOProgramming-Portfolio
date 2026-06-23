package com.example;

import java.util.List;

public interface DogDao {
    
    List<Dog> selectDogs();
    void createDog(Dog dog);
    Dog readDog(int id);
    void updateDog(Dog dog);    
    boolean deleteDog(Dog dog);    
}
