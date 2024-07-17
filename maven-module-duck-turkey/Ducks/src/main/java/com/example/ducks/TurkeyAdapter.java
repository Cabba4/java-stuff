package com.example.ducks;
import com.example.turkey.Turkey;

public class TurkeyAdapter implements DuckAdapter {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    public void quack() {
        turkey.display();
    }

    public void fly() {
        System.out.println("For turkeys we check swim and not fly");
        turkey.swim();
    }
    
}
