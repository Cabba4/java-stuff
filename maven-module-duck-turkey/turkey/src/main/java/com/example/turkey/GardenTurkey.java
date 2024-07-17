package com.example.turkey;

public class GardenTurkey extends Turkey {
    @Override 
    public void display(){
        System.out.println("This turkey is decorational");
    }

    @Override
    public void swim(){
        System.out.println("This turkey can float but not swim");
    }
}
