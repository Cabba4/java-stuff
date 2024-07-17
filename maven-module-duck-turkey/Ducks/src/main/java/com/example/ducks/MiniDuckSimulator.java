package com.example.ducks;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new Mallard();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
    }
    
}
