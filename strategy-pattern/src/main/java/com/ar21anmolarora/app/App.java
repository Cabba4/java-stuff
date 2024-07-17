package com.ar21anmolarora.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Ducks!" );

        Duck mallard = new Mallard();
        //mallard.display();
        Duck redHead = new RedHeadDuck();
        //redHead.display();
        Duck rubber = new RubberDuck();
        testDuck(redHead);
        testDuck(mallard);
        testDuck(rubber);
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
    private static void testDuck (Duck duck){
         //duck.display();
         //duck.swim();
         //duck.quack();
         //duck.fly();
    }
}
