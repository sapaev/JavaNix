package Lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void getMaxValue() {
        int[] intArray = new int[]{ 12, 1,2,5,2,5,-8 };
        assertEquals(12,Calc.getMaxValue(intArray));


    }

    @Test
    void getIndexOfMaxValue() {
        int[] intArray = new int[]{ 12, 1,2,5,2,5,-8 };
        assertEquals(0, Calc.getIndexOfMaxValue(intArray));

    }
}