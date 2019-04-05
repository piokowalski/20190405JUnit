package com.isa.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PointTest {

    @BeforeAll
    public static void a(){
    }

    @Test
    public void testIfPointCreated() {

        Point point = new Point(3.5, 6.8);
    }

    @Test
    public void testIfDistanceIsCorrect() {
        Point point = new Point(2.0, 5.0);
        Assertions.assertEquals(4.123105625617661,
                point.distance(new Point(6.0, 4.0)));
    }
}
