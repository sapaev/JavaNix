package Lesson4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class HomeTask1 {
    public static void main(String[] args) throws IOException {
        int[] array=new int[12];
        Random rn=new Random();
        for (int i=0; i< array.length; i++){
            array[i]= rn.nextInt(-15, 15);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,14));
    }

}
