package Lesson4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTask5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Введите число количества элементов:");
        int input = sc.nextInt();
        if (input > 3) {
            if (input % 2 == 0) {
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
            } else if (input % 2 != 0) {
                int[] array = new int[input];
                int[] array1 = new int[(input + 1) / 2];
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
            }


        } else {
            while (input <= 3) {
                System.out.println("Введенное число должно быть больше 3. Попробуйте снова");
                input = sc.nextInt();
                if(input>3){if (input % 2 == 0) {
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
                } else if (input % 2 != 0) {
                    int[] array = new int[input];
                    int[] array1 = new int[(input + 1) / 2];
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
                }

                }
            }

        }
    }
}
