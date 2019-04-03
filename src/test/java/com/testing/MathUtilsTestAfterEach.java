package com.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTestAfterEach {
    MathUtils mathUtils;

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all it is executed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all it is executed");
    }

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleaning up");
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
