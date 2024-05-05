package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {

  public Worker(String name, Double salary, Integer id, String hireDate) {
    super(name, salary, id, hireDate, "Worker");
  }

  @Override
  public void work() {
    System.out.println("Worker " + this.getName() + " is working.");
  }

}