package Lesson4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class HomeTask1 {
    public static void main(String[] args) throws IOException {
        int[] randomArray=generateRandomArray(15);
        System.out.println(Arrays.toString(randomArray));
        int maxValue=Calc.getMaxValue(randomArray);
        System.out.println(maxValue);
        int index=Calc.getIndexOfMaxValue(randomArray);
        System.out.println(index);

    }

       public static int[] generateRandomArray(int n){
           int[] array=new int[n];
           Random rn=new Random();
           for (int i=0; i< array.length; i++){
               array[i]= rn.nextInt(-15, 15);
           }
           return array;
    }

}
