package com.ar21anmolarora.app;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display(){
        System.out.println("This is a Rubber Duck");
    }

}
