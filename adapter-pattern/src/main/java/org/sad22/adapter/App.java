package org.sad22.adapter;

public class App {

    public static void main(String[] args) {
        System.out.println("This is Adapter DP starter project - 17.9.2022");

        ExampleClass class1 = new ExampleClass("ORGAN");
        System.out.println("Class 1 type is " + class1.getPrivateAttribute());

        ExampleClass class2 = new ExampleClass("MACHINE");
        System.out.println("Class 2 type is " + class2.getPrivateAttribute());

        ExampleClass class3 = new ExampleClass();
        System.out.println("Class 3 type is " + class3.getPrivateAttribute());
    }
}
