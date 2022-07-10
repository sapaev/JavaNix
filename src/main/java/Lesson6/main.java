package Lesson6;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String hello="Hello world";
        char h=hello.charAt(0);
        char g=hello.charAt(hello.length()-1);
        char[] symbols=hello.toCharArray();
        System.out.println(Arrays.toString(symbols));
        String world=hello.substring(6, 10);
        char[] world1=world.toCharArray();;
        System.out.println(world1[world1.length-1]);
    }
}
