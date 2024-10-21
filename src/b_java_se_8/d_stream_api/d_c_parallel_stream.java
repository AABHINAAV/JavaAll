package b_java_se_8.d_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Employee {

  int id;
  int salary;

  Employee(int id, int salary) {
    this.id = id;
    this.salary = salary;
  }

  int getSalary() {
    return salary;
  }
}

class EmployeesDatebase {

  List<Employee> getEmployeesData() {
    List<Employee> emps = new ArrayList<>();
    for (int i = 0; i < 1000; i++) {
      emps.add(new Employee(i, new Random().nextInt(100 * 100)));
    }

    return emps;
  }
}

public class d_c_parallel_stream {

  public static void main(String[] args) {
    long startTime;
    long endTime;

    List<Employee> emps = new EmployeesDatebase().getEmployeesData();

    startTime = System.currentTimeMillis();
    double salarySingleStream = emps
      .stream()
      .map(Employee::getSalary)
      .mapToDouble(i -> i)
      .average()
      .getAsDouble();
    endTime = System.currentTimeMillis();
    System.out.println(
      "single Stream : " +
      (endTime - startTime) +
      "\n  average salary : " +
      salarySingleStream
    );

    startTime = System.currentTimeMillis();
    double salaryParalleStream = emps
      .parallelStream()
      .map(Employee::getSalary)
      .mapToDouble(i -> i)
      .average()
      .getAsDouble();
    endTime = System.currentTimeMillis();
    System.out.println(
      "parallel Stream : " +
      (endTime - startTime) +
      "\n  average salary : " +
      salaryParalleStream
    );
  }
}
