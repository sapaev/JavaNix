package Lesson11;
import Lesson11.Employee;
import Lesson11.PayrollService;
import Lesson11.Storage;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Company {
    private final Storage<Employee> storageService = new Storage();

    public Company ofValues(Employee ...employees) {
        Company newCompany = new Company();
        Stream.of(employees).forEach(employee -> storageService.add(employee.getId(), employee));
        return newCompany;
    }

    public void addEmployee(Employee employee) {
        storageService.add(employee.getId(), employee);
    }

    public Employee getEmployeeById(int id) {
        return storageService.get(id);
    }

    public Employee fireEmployee(int id) {
        return storageService.delete(id);
    }

    public List<Employee> getAll() {
        return storageService.getAllData();
    }

    public void paySalary () {
        Map<String, Float> accountMoneyMap = getAll().stream()
                .collect(Collectors.toMap(Employee::getBankAccountId, Employee::getSalary));
        PayrollService.transferMoney(accountMoneyMap);
    }

}
