package com.example;

import java.util.ArrayList;
import java.util.List;

public class DogDaoImpl implements DogDao {
    
    public static List<Dog> dogs = new ArrayList<>();

    @Override
    public List<Dog> selectDogs() {
        
        return null;
    }

    @Override
    public void createDog(Dog dog) {
       
    }

    @Override
    public void updateDog(Dog dog) {
        
    }

    @Override
    public Dog readDog(int id) {
        
        return null;
    }

    @Override
    public boolean deleteDog(Dog dog) {
        return false;
    }
}
