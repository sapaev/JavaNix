package Lesson5;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        int a=11;
        exponentiation(a);
        System.out.println(a);

        String line="Привет";
        line=array(line);
        System.out.println(line);
    }

    static int exponentiation(int a){
        int b=a*a;
        return b;
    }

    static String array( String line){

        StringBuilder sb=new StringBuilder();
        sb.append(line);
        String a= String.valueOf(sb.reverse());
        return a;
    }


}
