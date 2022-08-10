package Lesson11;

import Lesson11.Gender;

public class Developer extends Employee {
    ProgrammingLanguage programmingLanguage;

    public Developer(int id, String name, Gender gender, int age, String bankAccountId, int experience, float salary, ProgrammingLanguage language) {
        super(id, name, gender, age, bankAccountId, experience, salary);
        this.programmingLanguage = language;
    }

    public void writeSoftware () {
        System.out.println("I write software this is my job. I use " + programmingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I am writing code, what are you doing ?");
    }

    @Override
    public void greet() {
        String text = String.format(
                "Hello my name is %s. I am a developer. I am using %s for development. It is %s.",
                getName(), programmingLanguage, programmingLanguage.value
        );
        System.out.println(text);
    }
}

