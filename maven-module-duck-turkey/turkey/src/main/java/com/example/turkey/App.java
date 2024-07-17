package com.example.turkey;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Turkey myTurkey = new Turkey();
        myTurkey.display();
        myTurkey.swim();

        Turkey gardenTurkey = new GardenTurkey();
        gardenTurkey.display();
        gardenTurkey.swim();
    }
}
