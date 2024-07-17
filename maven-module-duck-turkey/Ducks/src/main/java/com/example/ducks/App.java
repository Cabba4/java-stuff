package com.example.ducks;
import com.example.turkey.CookedTurkey;
import com.example.turkey.Turkey;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Ducks!" );

        Turkey newTurkey = new CookedTurkey();
        DuckAdapter importedTurkey = new TurkeyAdapter(newTurkey);

        System.out.println("\nThe turkeyAdapter says...");
        importedTurkey.quack();
        importedTurkey.fly();


        System.out.println("\nThe Duck Strategy Pattern says...");
        Duck mallard = new Mallard();
        //mallard.display();
        Duck rubber = new RubberDuck();
        interfaceTest(mallard);
        interfaceTest(rubber);
        rubber.setFlyBehaviour(new FlyRocketPowered());
        interfaceTest(rubber);
        // INTERFACE VS ABSTRACT CLASS!!!!
    }

    private static void interfaceTest(Duck duck){
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
