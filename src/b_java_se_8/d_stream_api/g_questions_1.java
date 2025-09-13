package b_java_se_8.d_stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class g_questions_1 {

  public static void find_max_salary() {
    List<Employee> emps = Employee.createData();

    // method 1 : creating our own comparator for max() at that point
    Employee res1 = emps
      .stream()
      .max((Employee emp1, Employee emp2) ->
        emp1.getSalary().compareTo(emp2.getSalary())
      )
      .get();
    System.out.println(res1);

    // method 2 : creating our own comparator for max() at that point using Double class
    Employee res2 = emps
      .stream()
      .max((Employee emp1, Employee emp2) ->
        Double.compare(emp1.getSalary(), emp2.getSalary())
      )
      .get();
    System.out.println(res2);

    // method 3 : creating comparator using comparingDouble() of Comparator class
    Employee res3 = emps
      .stream()
      .max(Comparator.comparing(Employee::getSalary))
      .get();
    System.out.println(res3);
  }

  public static void find_min_salary() {
    List<Employee> emps = Employee.createData();

    // method 1 : creating our own comparator for max() at that point
    Optional<Employee> res1 = emps
      .stream()
      .min((Employee emp1, Employee emp2) ->
        emp1.getSalary().compareTo(emp2.getSalary())
      );
    System.out.println(res1);

    // method 2 : creating our own comparator for max() at that point using Double class
    Optional<Employee> res2 = emps
      .stream()
      .min((Employee emp1, Employee emp2) ->
        Double.compare(emp1.getSalary(), emp2.getSalary())
      );
    System.out.println(res2);

    // method 3 : creating comparator using comparingDouble() of Comparator class
    Optional<Employee> res3 = emps
      .stream()
      .min(Comparator.comparingDouble(Employee::getSalary));
    System.out.println(res3);
  }

  public static void find_second_max_min_salary() {
    List<Employee> emps = Employee.createData();

    // second max salary
    Employee secondMaxSalEmp = emps
      .stream()
      .sorted((Employee emp1, Employee emp2) ->
        -emp1.getSalary().compareTo(emp2.getSalary())
      )
      // .sorted(Comparator.comparing(Employee::getSalary).reversed())
      .skip(1)
      .findFirst()
      .get();
    System.out.println(secondMaxSalEmp);

    // second min Salary
    Employee secondMinSalEmp = emps
      .stream()
      .sorted((Employee emp1, Employee emp2) ->
        emp1.getSalary().compareTo(emp2.getSalary())
      )
      // .sorted(Comparator.comparing(Employee::getSalary))
      .skip(1)
      .findFirst()
      .get();
    System.out.println(secondMinSalEmp);
    //
    //
    // simply add distinct() after stream if directly working on int[]
  }

  public static void find_senior_based_on_joining_date() {
    List<Employee> emps = Employee.createData();

    // method 1 : by sorting
    Employee res1 = emps
      .stream()
      .sorted((emp1, emp2) ->
        emp1.getJoiningDate().compareTo(emp2.getJoiningDate())
      ) // making comparator
      // .sorted(Comparator.comparing(Employee::getJoiningDate)) // using Comparator class for comparator
      .findFirst()
      .get();
    System.out.println(res1);

    // method 2 : using min method
    Employee res2 = emps
      .stream()
      .min((Employee emp1, Employee emp2) ->
        emp1.getJoiningDate().compareTo(emp2.getJoiningDate())
      )
      .get(); // making comparator
    // .min(Comparator.comparing(Employee::getJoiningDate));
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
