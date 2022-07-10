package Lesson5;

public class main {
    public static void main(String[] args) {
        Box box=new Box(35);
        System.out.println(box.value); //35
        box.value=40;
        System.out.println(box.value); //40
    }
}
