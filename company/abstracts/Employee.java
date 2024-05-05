package company.abstracts;

import company.interfaces.Employable;

abstract public class Employee implements Employable {
  private String name;
  private Double salary;
  private Integer id;

  private String hireDate;
  private String position;

  public Employee(String name, Double salary, Integer id, String hireDate, String position) {
    this.name = name;
    this.salary = salary;
    this.id = id;

    this.hireDate = hireDate;
    this.position = position;
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

  public String getHireDate() {
    return this.hireDate;
  }

  public void setHireDate(String hireDate) {
    this.hireDate = hireDate;
  }

  public String getPosition() {
    return this.position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int hashCode() {
    return this.id;
  }

}