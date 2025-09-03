package com.example.javamavenjunithelloworld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UtilityTest {

    @Test
    public void testAreaOfCircle() {
        double result = Utility.areaOfCircle(2.0);
        assertEquals(12.566370614359172, result, 0.0001);
    }

    @Test
    public void testAddNumbers() {
        int result = Utility.addNumbers(5, 10);
        assertEquals(15, result);
    }
}
