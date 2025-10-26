package b_java_se_8.d_stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class g_questions_2 {

  public static void find_highest_salary_in_each_gender() {
    List<Employee> emps = Employee.createData();

    Map<String, Optional<Employee>> res = emps
      .stream()
      .collect(
        Collectors.groupingBy(
          Employee::getGender,
          Collectors.reducing(
            BinaryOperator.maxBy(
              // Comparator.comparingDouble(Employee::getSalary)
              Comparator.comparing((Employee e) -> e.getSalary())
            )
          )
        )
      );

    System.out.println(res);
  }

  public static void find_lowest_salary_in_each_gender() {
    List<Employee> emps = Employee.createData();

    Map<String, Optional<Employee>> res = emps
      .stream()
      .collect(
        Collectors.groupingBy(
          Employee::getGender,
          Collectors.reducing(
            BinaryOperator.minBy(
              // Comparator.comparingDouble(Employee::getSalary)
              Comparator.comparing((Employee e) -> e.getSalary())
            )
          )
        )
      );

    System.out.println(res);
  }

  public static void total_salary_by_gender() {
    List<Employee> employees = Employee.createData();
    Map<String, Double> totalSalaryByDept = employees
      .stream()
      .collect(
        Collectors.groupingBy(
          Employee::getGender, // Group by gender
          Collectors.summingDouble(Employee::getSalary) // Sum salaries per dept
        )
      );

    System.out.println("total salary by gender : " + totalSalaryByDept);
  }

  public static void average_salary_by_gender() {
    List<Employee> employees = Employee.createData();

    Map<String, Double> res = employees
      .stream()
      .collect(
        Collectors.groupingBy(
          Employee::getGender,
          Collectors.averagingDouble(Employee::getSalary)
        )
      );

    System.out.println("average salary by gender : " + res);
  }

  public static void gender_with_higest_average_salary() {
    List<Employee> employees = Employee.createData();

    Double res = employees
      .stream()
      .collect(
        Collectors.groupingBy(
          Employee::getGender,
          Collectors.averagingDouble(Employee::getSalary)
        )
      )
      .entrySet()
      .stream()
      .max(Comparator.comparing(Map.Entry::getValue))
      .get()
      .getValue();

    System.out.println("gender with higest average salary : " + res);
  }

  public static void main(String[] args) {
    // find_highest_salary_in_each_gender();
    // find_lowest_salary_in_each_gender();
    // total_salary_by_gender();
    // average_salary_by_gender();
    gender_with_higest_average_salary();
  }
}
