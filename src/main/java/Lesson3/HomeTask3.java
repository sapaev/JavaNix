package Lesson3;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        System.out.println("Введите название урока");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int fist=9;
        int second=10;
        int third=11;
        int forth=12;
        int fifth=13;
        int sixth=14;
        int seventh=15;
        int eighth=16;
        int ninth=17;
        int tenth=18;
        int min1=45;
        int min2=35;
        int min3=25;
        int min4=15;
        if(a==1){
            System.out.println(fist+" "+min1);
        }else if (a==2){
            System.out.println(second+" "+min2);
        }else if (a==3){
            System.out.println(third+" "+min2);
        }else if (a==4){
            System.out.println(forth+" "+min3);
        }else if (a==5){
            System.out.println(fifth+" "+min3);
        }else if (a==6){
            System.out.println(sixth+" "+min4);
        }else if (a==7){
            System.out.println(seventh+" "+min4);
        }else if (a==8){
            System.out.println(eighth+" "+min4);
        }else if (a==9){
            System.out.println(ninth+" "+min4);
        }else if (a==10){
            System.out.println(tenth+" "+min4);
        } else {
            System.out.println("такого урока не существует");
        }
    }
}

