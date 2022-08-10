package Lesson11;
import Lesson11.Company;
import Lesson11.Developer;
import Lesson11.Employee;
import Lesson11.ProgrammingLanguage;
import Lesson11.Gender;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Developer(
                50010073,
                "Viktor",
                Gender.MALE,
                24,
                "1049123945678912",
                24,
                2000,
                ProgrammingLanguage.JAVA
        );
        employee1.greet();
        employee1.work();

        // Output an empty string
        System.out.println();

        Developer developer1 = new Developer(
                23500159,
                "Zina",
                Gender.FEMALE,
                25,
                "3456789012345467",
                15,
                1500,
                ProgrammingLanguage.TS
        );
        developer1.greet();
        developer1.writeSoftware();

        // Output an empty string
        System.out.println();

        Company company = new Company();
        company.ofValues(employee1, developer1);

        printCompanyMembers(company);

        Developer developer2 = new Developer(
                28880159,
                "Alex",
                Gender.MALE,
                25,
                "3467812012345467",
                45,
                4000,
                ProgrammingLanguage.C
        );

        company.addEmployee(developer2);
        company.fireEmployee(employee1.getId());

        printCompanyMembers(company);

        company.getEmployeeById(developer1.getId()).work();

        // Output an empty string
        System.out.println();

        company.paySalary();

    }

    static void printCompanyMembers(Company company) {
        List<Employee> list = company.getAll();
        for (Employee employee: list) {
            employee.greet();
        }
        // Output an empty string
        System.out.println();
    }
}
