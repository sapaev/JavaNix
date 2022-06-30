package Lesson4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class HomeTask4 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[5];
        int[] array1 = new int[5];
        Random rn = new Random();
        int sum=0;
        int sum1=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(0, 5);
            sum=sum+array[i];
            array1[i] = rn.nextInt(0, 5);
            sum1=sum+array1[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(sum);
        System.out.println(sum1);
        int avg=sum/5;
        int avg1=sum1/5;

        if(avg>avg1){
            System.out.println("Спеднее арифметическое первого массива больше среднего арифметического второго массива");
        }else if (avg1>avg){
            System.out.println("Спеднее арифметическое первого массива больше среднего арифметического второго массива");
        }else{
            System.out.println("Средние арифметические двух массивов равны");
        }




    }
}