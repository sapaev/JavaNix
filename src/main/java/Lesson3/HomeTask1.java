package Lesson3;

import java.util.Scanner;


public class HomeTask1 {
    private static Integer calculateSumFromString(String str) {
        // delete non-digits.
        String processedStr = str.replaceAll("\\D+","");
        int sum = 0;
        // convert string to `char[]` array
        char[] chars = processedStr.toCharArray();
        // iterate over `char[]` array using enhanced for-loop
        for (char ch: chars) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calculateSumFromString(input));
    }
}