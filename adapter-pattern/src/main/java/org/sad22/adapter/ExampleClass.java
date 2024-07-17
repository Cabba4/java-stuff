package org.sad22.adapter;

public class ExampleClass {

    public ExampleClass(String classType) {
        if ("ORGAN".equals(classType)) {
            privateAttribute = 7;
        } else {
            privateAttribute = 99;
        }
    }

    private int privateAttribute = -1; // This is error

    public ExampleClass() {
    }

    public int getPrivateAttribute() {
        return privateAttribute;
    }

    public void setPrivateAttribute(int privateAttribute) {
        this.privateAttribute = privateAttribute;
    }
}
