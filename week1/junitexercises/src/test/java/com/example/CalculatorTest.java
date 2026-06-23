package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    @After
    public void tearDown() {
        calculator = null;
    }
    @Test
    public void testAdd() {
      
        int a = 2;
        int b = 3;
        int result = calculator.add(a, b);
        assertTrue(result == 5);
    }
    @Test
    public void testSubtract() {
     
        int a = 5;
        int b = 3;
        int result = calculator.subtract(a, b);
        assertTrue(result == 2);
    }
    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);
        assertTrue(5 > 3);
        assertFalse(5 < 3);
        assertNull(null);
        assertNotNull(new Object());
    }
    @Test
    public void testAddWithAAA() {
        int x = 10;
        int y = 20;
        int sum = calculator.add(x, y);
        assertEquals(30, sum);
    }
}