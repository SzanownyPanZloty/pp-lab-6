import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
  public static void main(String[] args) {
    Worker worker1 = new Worker("John", 2000.0, 1, "2021-01-01");
    Worker worker2 = new Worker("Alice", 2500.0, 2, "2021-01-02");
    Worker worker3 = new Worker("Bob", 3000.0, 3, "2021-01-03");
    Worker worker4 = new Worker("Eve", 3500.0, 4, "2021-01-04");
    Manager manager = new Manager("Tom", 5000.0, 5, "2021-01-05");

    List<Employee> employees = new ArrayList<>();
    employees.add(worker1);
    employees.add(worker2);
    employees.add(worker3);
    employees.add(worker4);
    employees.add(manager);

    for (Employee employee : employees) {
      System.out.println(employee.getName() + " (ID: " + employee.getId() + "), Position: " + employee.getPosition()
          + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary());
      employee.work();
    }

  }
}
