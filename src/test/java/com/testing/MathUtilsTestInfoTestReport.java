package com.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTestInfoTestReport {
    MathUtils mathUtils;
    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        mathUtils = new MathUtils();
        testReporter.publishEntry("Running " + testInfo.getDisplayName());
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
    @RepeatedTest(3)
    @DisplayName("Multiply two value")
    void testMultiply() {
        //assertEquals(6,mathUtils.multiply(2,3),"provide the product");
        assertAll(() -> assertEquals(6, mathUtils.multiply(2, 3)),
                () -> assertEquals(10, mathUtils.multiply(5, 2)),
                () -> assertEquals(-25, mathUtils.multiply(-5, 5))
        );
        // testReporter.publishEntry("Running"+testInfo.getDisplayName());

    }

    @Nested
    public class Subtraction {
        @Test
        @DisplayName("Two Number are Negative")
        void testNegativeSubtraction() {
            assertAll(() -> assertEquals(0, mathUtils.subtract(-5, -5)),
                    () -> assertEquals(1, mathUtils.subtract(-1, -2)),
                    () -> assertEquals(-5, mathUtils.subtract(-15, -10)));
        }

        @Test
        @DisplayName("Two Number are positive")
        void testPositiveSubtraction() {
            assertAll(() -> assertEquals(10, mathUtils.subtract(15, 5)),
                    () -> assertEquals(20, mathUtils.subtract(30, 10)),
                    () -> assertEquals(15, mathUtils.subtract(30, 15)),
                    () -> assertEquals(25, mathUtils.subtract(30, 5))

            );
        }

        @Test
        @DisplayName("Two unsigned number")
        void testDiffSignedNumber() {
            assertAll(() -> assertEquals(20, mathUtils.subtract(15, -5)),
                    () -> assertEquals(40, mathUtils.subtract(30, -10)),
                    () -> assertEquals(-45, mathUtils.subtract(-30, 15)),
                    () -> assertEquals(-35, mathUtils.subtract(-30, 5))

            );

        }


    }


}
