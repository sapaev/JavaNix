package Lesson11;

import Lesson11.BankUser;
import Lesson11.Gender;
import Lesson11.Person;

public class Employee extends Person implements BankUser {
    // unique payment tax identifier
    private int id;
    private String bankAccountId;

    // value in months
    private int experience;

    private float salary;

    public Employee(int id, String name, Gender gender, int age, String bankAccountId, int experience, float salary) {
        super(name, gender, age);
        this.id = id;
        this.bankAccountId = bankAccountId;
        this.experience = experience;
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public float getSalary() {
        return salary;
    }

    public void work() {
        System.out.println("I am working");
    }

    @Override
    public void greet() {
        System.out.println("Hello, I'm just an employee");
    }

    @Override
    public String  getBankAccountId() {
        return bankAccountId;
    }

    public int getId() {
        return id;
    }
}
