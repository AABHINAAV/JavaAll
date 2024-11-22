package b_java_se_8.d_stream_api;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class g_questions_1 {

  public static void find_max_salary() {
    List<Employee> emps = Employee.createData();

    // method 1 : using comparator in collect()
    Optional<Employee> res1 = emps
      .stream()
      .collect(
        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
      );
    System.out.println(res1);

    // method 2 : using comparing double method comparator
    Employee res2 = emps
      .stream()
      .max(Comparator.comparingDouble(Employee::getSalary))
      .get();
    System.out.println(res2);

    // method 3 : creating our own comparator for max()
    Employee res3 = emps
      .stream()
      .max((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
      .get();
    System.out.println(res3);
    //
    //
    // using max method is best
  }

  public static void find_min_salary() {
    List<Employee> emps = Employee.createData();

    // method 1 : using comparator in collect()
    Optional<Employee> res1 = emps
      .stream()
      .collect(
        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))
      );
    System.out.println(res1);

    // method 2 : using comparing double method comparator
    Optional<Employee> res2 = emps
      .stream()
      .min(Comparator.comparingDouble(Employee::getSalary));
    System.out.println(res2);

    // method 3 : creating our own comparator for max()
    Optional<Employee> res3 = emps
      .stream()
      .min((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()));
    System.out.println(res3);
    //
    //
    // using max method is best
  }

  public static void find_second_max_min_salary() {
    List<Employee> emps = Employee.createData();

    // second max salary
    Optional<Employee> secondMaxSalEmp = emps
      .stream()
      .sorted((emp1, emp2) -> -emp1.getSalary().compareTo(emp2.getSalary()))
      // .sorted(Comparator.comparing(Employee::getSalary).reversed())
      .skip(1)
      .findFirst();
    System.out.println(secondMaxSalEmp);

    // second min Salary
    Optional<Employee> secondMinSalEmp = emps
      .stream()
      .sorted((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
      // .sorted(Comparator.comparing(Employee::getSalary))
      .skip(1)
      .findFirst();
    System.out.println(secondMinSalEmp);
    // 
    // 
    // simply add distinct() after stream if directly working on int[]
  }

  public static void find_senior_based_on_joining_date() {
    List<Employee> emps = Employee.createData();

    // method 1 : by sorting
    Optional<Employee> res1 = emps
      .stream()
      // .sorted(Comparator.comparing(Employee::getJoiningDate)) // using Comparator class for comparator
      .sorted((emp1, emp2) ->
        emp1.getJoiningDate().compareTo(emp2.getJoiningDate())
      ) // making comparator
      .findFirst();
    System.out.println(res1);

    // method 2 : using min method
    Optional<Employee> res2 = emps
      .stream()
      .min(Comparator.comparing(Employee::getJoiningDate));
    System.out.println(res2);
  }

  public static void grouping_employee_based_on_gender() {
    List<Employee> emps = Employee.createData();

    // grouping employee on basis of gender
    Map<String, List<Employee>> res1 = emps
      .stream()
      .collect(Collectors.groupingBy(Employee::getGender));
    System.out.println(res1);

    // getting count of each gender
    Map<String, Long> res2 = emps
      .stream()
      .collect(
        Collectors.groupingBy(Employee::getGender, Collectors.counting())
      );
    System.out.println(res2);
  }

  public static void main(String[] args) {
    // find_max_salary();
    //
    //
    //
    // find_min_salary();
    //
    //
    //
    // find_second_max_min_salary();
    //
    //
    //
    // find_senior_based_on_joining_date();
    //
    //
    //
    grouping_employee_based_on_gender();
  }
}
