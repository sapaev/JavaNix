package Lesson4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class HomeTask3 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[4];
        Random rn = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(array));
        if(array[3]>array[2]&&array[2]>array[1]&&array[1]>array[0]){
            System.out.println("Данный массив c возростающей последовательностью.");
        }else {
            System.out.println("Данный массив не является массивом с возростающей последовательностью");
        }
    }
}