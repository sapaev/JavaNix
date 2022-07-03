package Lesson4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTask1Test {

    @Test
    void generateRandomArray() {
        int[] array2=HomeTask1.generateRandomArray(5);
        assertEquals(5, array2.length);


    }
}