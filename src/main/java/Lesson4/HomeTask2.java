package Lesson4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class HomeTask2 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[8];
        Random rn = new Random();
        for (int i=0; i< array.length; i++){
            array[i]= rn.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(array));
        for (int j=0; j< array.length; j++){
            if(j%2!=0){
                array[j]=0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
