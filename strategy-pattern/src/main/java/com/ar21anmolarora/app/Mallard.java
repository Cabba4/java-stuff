package com.ar21anmolarora.app;

public class Mallard extends Duck {

    public Mallard(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display(){
        System.out.println("This is a Mallard");
    }
    
}
