package Lesson3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class HomeTask2{
    private static Long calculateLetterCount(String str, char value) {
        return str.chars().filter(ch -> ch == value).count();
    }
    private static String removeDuplicates(String str) {
        char[] chars = str.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString();
    }
    // remove everything but letters
    private static String filterString(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);
            if (Character.isLetter(value)) {
                result += ("" + value);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String filteredStr = HomeTask2.filterString(input);
        // string with unique letters
        String uniqStr = HomeTask2.removeDuplicates(filteredStr);
        for (int i = 0; i < uniqStr.length(); i++) {
            char symbol = uniqStr.charAt(i);
            Long count = HomeTask2.calculateLetterCount(filteredStr, symbol);
            System.out.println(symbol + " - " + count);
        }
    }
}