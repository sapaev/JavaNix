package Lesson4;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;



class HomeTask5Test {

    private static int input;
    private static int input1;



    @Test
    void test() {
        Random rn = new Random();
        input = 4;
                int[] array = new int[input];
                int[] array1 = new int[input / 2];
                int j = 0;
                for (int i = 0; i < array.length; i++) {
                    array[i] = rn.nextInt(0, input);
                    if (i % 2 == 0) {
                        array1[j] = array[i];
                        j++;
                    }
                }
                System.out.println(Arrays.toString(array));
                System.out.println(Arrays.toString(array1));
                assertTrue(array[2] == array1[1] && array[0] == array1[0]);
    }

           @Test
            static void test2(){
                Random rn = new Random();
                 input1 = 4;
                    int[] array = new int[input1];
                    int[] array1 = new int[(input1 + 1) / 2];
                    int j = 0;
                    for (int i = 0; i < array.length; i++) {
                        array[i] = rn.nextInt(0, input1);
                        if (i % 2 == 0) {
                            array1[j] = array[i];
                            j++;
                        }
                    }
                    System.out.println(Arrays.toString(array));
                    System.out.println(Arrays.toString(array1));
               assertTrue(array[2] == array1[1] && array[0] == array1[0]);

            }



        }


