package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {

  public Worker(String name, Double salary, Integer id) {
    super(name, salary, id);
  }

  @Override
  public void work() {
    System.out.println("Worker " + this.getName() + " is working.");
  }

}