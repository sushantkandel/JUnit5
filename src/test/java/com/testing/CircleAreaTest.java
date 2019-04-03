package com.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleAreaTest {
    @Test
    void testArea() {
        CircleArea circleArea = new CircleArea();
        double expected = 12.56;
        double actual = circleArea.circleAreaCalc(2);
        assertEquals(expected, actual, "This must gives the area of circle");

    }

    @Test
    void testPerimeter() {
        CircleArea circleArea = new CircleArea();
        double expected = 18.84;
        assertEquals(expected, circleArea.circlePerimeterCalc(3), "This must give exact perimeter of circle");
    }

}
