package Lesson4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class HomeTask3Test {
    @Test
    void test(){
        int[] array = new int[4];
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(array));

        if(array[3]>array[2]&&array[2]>array[1]&&array[1]>array[0]){
            String a="Данный массив c возростающей последовательностью.";
            System.out.println(a);
            String expected="Данный массив c возростающей последовательностью.";
            assertEquals(a,expected);
        }else {
            String a="Данный массив не является массивом с возростающей последовательностью";
            System.out.println(a);
            String expected="Данный массив не является массивом с возростающей последовательностью";
            assertEquals(a,expected);

        }
    }

}