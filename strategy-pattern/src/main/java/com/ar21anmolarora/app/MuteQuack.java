package com.ar21anmolarora.app;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack(){
        System.out.println("No Quack from this one");
    }
}
