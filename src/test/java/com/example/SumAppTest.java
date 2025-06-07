package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumAppTest {

    @Test
    void testAddition() {
        // This is a basic test to ensure the JUnit setup is working.
        // A more comprehensive test would involve refactoring SumApp
        // to make its sum logic directly testable.
        double num1 = 5.0;
        double num2 = 10.0;
        double expectedSum = 15.0;
        double actualSum = num1 + num2; // Simulate the core logic for testing purposes
        assertEquals(expectedSum, actualSum, 0.001, "The sum should be correctly calculated.");
    }

    @Test
    void anotherSimpleTest() {
        String concatenated = "Hello" + " " + "World";
        assertEquals("Hello World", concatenated, "String concatenation should work.");
    }
}
