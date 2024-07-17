package org.sad22.adapter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleClassTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testConstructor () {
        assertEquals(99, constructorTest("MACHINE"));
        assertEquals(7, constructorTest("ORGAN"));
        assertEquals(-1, constructorTest(""));
    }

    Integer constructorTest (String param) {
        ExampleClass class1;
        if ("".equals(param)) {
            class1 = new ExampleClass();
        } else {
            class1 = new ExampleClass(param);
        }
        Integer resultValue = class1.getPrivateAttribute();
        System.out.println("Generate class " + class1.getClass() + " with parameter " + param + " will result to attribute value " + resultValue);

        return resultValue;
    }




    @AfterEach
    void tearDown() {
    }
}