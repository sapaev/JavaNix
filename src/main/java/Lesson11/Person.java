package Lesson11;

public abstract class Person {
    private String name;
    private Gender gender;
    private int age;

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, Gender gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //abstract method
    public abstract void greet();

    @Override
    public String toString(){
        return "Name="+this.name+"::person.Gender="+this.gender;
    }
}