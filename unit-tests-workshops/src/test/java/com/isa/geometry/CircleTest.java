package com.isa.geometry;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void testIfCircumferenceCalculatedProperlyForValidInput() {
        Circle circle = new Circle(2.0);

        Assertions.assertThat(circle.calculateCircumference())
                .isNotNaN()
                .isEqualTo(12.566370614359172);
    }


    @Test
    public void testIfCircumferenceCalculatedProperlyForInvalidInput() {
        Circle circle = new Circle();

        Assertions.assertThatThrownBy(() -> circle.calculateCircumference())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Radius is mandatory!");
    }

    @Test
    @DisplayName("Check if area is calculated properly when correct input provided")
    public void testIfAreaCalculatedProperlyForValidInput() {
        Circle circle = new Circle(3.0);

        Assertions.assertThat(circle.calculateArea())
                .isNotNaN()
                .isPositive();
    }

    @Test
    @DisplayName("Negative value of radius")
    public void isRadiusNegative() {
        Circle circle = new Circle();

        Assertions.assertThat(circle.calculateArea())
                .isNegative();
    }


}
