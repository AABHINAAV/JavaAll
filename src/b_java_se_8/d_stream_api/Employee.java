package b_java_se_8.d_stream_api;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Employee {

  private String name;
  private Double salary;
  private LocalDate joiningDate;
  private String gender;
  private String active;

  public Employee() {}

  public Employee(
    String name,
    Double salary,
    LocalDate joiningDate,
    String gender,
    String active
  ) {
    this.name = name;
    this.salary = salary;
    this.joiningDate = joiningDate;
    this.gender = gender;
    this.active = active;
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

  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
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
      ", active=" +
      active +
      "]"
    );
  }

  public static List<Employee> createData() {
    LocalDate joiningDateRam = LocalDate.of(2000, 01, 01);
    LocalDate joiningDateSita = LocalDate.of(1995, 5, 15);
    LocalDate joiningDateVishnu = LocalDate.of(1998, 12, 10);
    LocalDate joiningDateMahesh = LocalDate.of(1990, 03, 20);
    LocalDate joiningDateChinki = LocalDate.of(1995, 02, 16);

    List<Employee> emps = Arrays.asList(
      new Employee("Ram", 50000.0, joiningDateRam, "M", "active"),
      new Employee("Sita", 40000.0, joiningDateSita, "F", "inactive"),
      new Employee("Vishnu", 20000.0, joiningDateVishnu, "M", "active"),
      new Employee("Mahesh", 70000.0, joiningDateMahesh, "M", "inactive"),
      new Employee("Chinki", 65000.0, joiningDateChinki, "F", "active")
    );

    return emps;
  }
}
