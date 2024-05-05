package company.abstracts;

import company.interfaces.Employable;

abstract public class Employee implements Employable {
  private String name;
  private Double salary;
  private Integer id;

  public Employee(String name, Double salary, Integer id) {
    this.name = name;
    this.salary = salary;
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return this.salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}