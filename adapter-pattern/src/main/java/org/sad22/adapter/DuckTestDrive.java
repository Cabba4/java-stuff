package org.sad22.adapter;

public class DuckTestDrive {
    public static void main(String[] args){
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(duck);

        System.out.println("\nThe turkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
