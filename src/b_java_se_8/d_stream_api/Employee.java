package b_java_se_8.d_stream_api;

import java.time.LocalDate;

class Employee {

  private String name;
  private Double salary;
  private LocalDate joiningDate;
  private String gender;

  public Employee() {}

  public Employee(String name, Double salary, LocalDate joiningDate, String gender) {
    this.name = name;
    this.salary = salary;
    this.joiningDate = joiningDate;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public LocalDate getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(LocalDate joiningDate) {
    this.joiningDate = joiningDate;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return (
      "Employee [name=" +
      name +
      ", salary=" +
      salary +
      ", joiningDate=" +
      joiningDate +
      ", gender=" +
      gender +
      "]"
    );
  }
}
