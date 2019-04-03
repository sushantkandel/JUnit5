package com.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ChangingTestInstanceBehavior {
    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
        System.out.println("test");
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
//        System.out.println(mathUtils);
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide by zero must be thrown");
    }

    @BeforeAll
    void beforeAll() {
        System.out.println("Before All is executed");
    }


}
