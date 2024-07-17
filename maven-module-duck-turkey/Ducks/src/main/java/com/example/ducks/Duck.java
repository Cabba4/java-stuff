package com.example.ducks;

public abstract class Duck {

    // Since all ducks cant fly we create an attribute which is an interface (like an abstract class )
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    
    public void swim(){
        System.out.println("Ducks Swim");
    }

    public abstract void display();
    
    // Add actual action method:
    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        // now  we can set behavioud dynamically for flying
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        // same for quack!
        quackBehaviour = qb;
    }

}
