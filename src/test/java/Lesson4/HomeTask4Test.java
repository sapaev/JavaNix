package Lesson4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class HomeTask4Test {
    private static int[] array;
    private static int[] array1;
    private static int sum;
    private static int sum1;
    @BeforeAll
    static void  createMass(){
         array = new int[5];
         array1 = new int[5];
        Random rn = new Random();
        sum=0;
        sum1=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(0, 5);
            sum=sum+array[i];
            array1[i] = rn.nextInt(0, 5);
            sum1=sum+array1[i];
        }
    }

    @Test
    void test(){
        int avg=sum/5;
        int avg1=sum1/5;
        if(avg>avg1){
            String actual="Спеднее арифметическое первого массива больше среднего арифметического второго массива";
            String expeceted="Спеднее арифметическое первого массива больше среднего арифметического второго массива";
            System.out.println(actual);
            assertEquals(expeceted,actual);
        }else if (avg1>avg){
            String actual="Среднее арифметическое второго массива больше среднего арифметического первого массива";
            String expeceted="Среднее арифметическое второго массива больше среднего арифметического первого массива";
            System.out.println(actual);
            assertEquals(expeceted,actual);
            System.out.println("Среднее арифметическое второго массива больше среднего арифметического первого массива");
        }else{
            String actual="Средние арифметические двух массивов равны";
            String expeceted="Средние арифметические двух массивов равны";
            System.out.println(actual);
            assertEquals(expeceted,actual);
            System.out.println("Средние арифметические двух массивов равны");
        }
    }

}