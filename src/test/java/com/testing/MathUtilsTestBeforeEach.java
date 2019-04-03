package com.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTestBeforeEach {
    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {

        int expected = 5;
        int actual = mathUtils.sum(2, 3);
        assertEquals(expected, actual, "this method do summing");
        //fail("This system fails");
        //System.out.println("This test run");
    }

    @Test
    void testDivide() {

        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero must be thrown");
    }


}
