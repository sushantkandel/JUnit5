package com.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTestAssertAll {
    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Test
    @DisplayName("Add two value")
    void testAdd() {

        int expected = 5;
        int actual = mathUtils.sum(2, 3);
        assertEquals(expected, actual, "this method do summing");
        //fail("This system fails");
        //System.out.println("This test run");
    }

    @Test
    @DisplayName("Divide two value")
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero must be thrown");
    }

    @Test
    @DisplayName("Multiply two value")
    void testMultiply() {
        //assertEquals(6,mathUtils.multiply(2,3),"provide the product");
        assertAll(() -> assertEquals(6, mathUtils.multiply(2, 3)),
                () -> assertEquals(10, mathUtils.multiply(5, 2)),
                () -> assertEquals(-25, mathUtils.multiply(-5, 5))
        );

    }


}
