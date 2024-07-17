package com.example.turkey;

public class CookedTurkey extends Turkey {
    @Override
    public void display(){
        System.out.println("This tukey is good for thanksgiving");
    }

    @Override
    public void swim(){
        System.out.println("This turkey can no longer swim");
    }
}
