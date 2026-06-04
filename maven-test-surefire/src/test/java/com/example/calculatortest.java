package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatortest {

    @Test
    public void testAdd() {

        calculator Calculator = new calculator();

        assertEquals(5,
                Calculator.add(2,3));
    }
}