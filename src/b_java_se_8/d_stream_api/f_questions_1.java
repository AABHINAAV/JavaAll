package b_java_se_8.d_stream_api;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class f_questions_1 {

  public static List<Employee> createData() {
    LocalDate joiningDateRam = LocalDate.of(2000, 01, 01);
    LocalDate joiningDateSita = LocalDate.of(1995, 5, 15);
    LocalDate joiningDateVishnu = LocalDate.of(1998, 12, 10);
    LocalDate joiningDateMahesh = LocalDate.of(1990, 03, 20);

    List<Employee> emps = Arrays.asList(
      new Employee("Ram", 50000.0, joiningDateRam, "M"),
      new Employee("Sita", 40000.0, joiningDateSita, "F"),
      new Employee("Vishnu", 20000.0, joiningDateVishnu, "M"),
      new Employee("Mahesh", 70000.0, joiningDateMahesh, "M")
    );

    return emps;
  }

  public static void main(String[] args) {
    List<Employee> emps = createData();
    //
    //
    //
    // find the employee with maximum salary
    Employee res = emps
      .stream()
      .max((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
      .get();

    System.out.println("\nhighest salary : " + res);
    //
    //
    //
    // find the employee with second highest salary
    // List<Employee> res1 =  emps
    // .stream()
    // .sorted((emp1, emp2) -> emp2.getSalary().compareTo(emp1.getSalary()))
    // .toList();
    // System.out.println("\nsecond Highest salary : " + res1.get(1));
    //
    Optional<Employee> res1 = emps
      .stream()
      .sorted((emp1, emp2) -> emp2.getSalary().compareTo(emp1.getSalary()))
      .skip(1)
      .findFirst();

    res1.ifPresent(t -> System.out.println("\nsecond Highest salary : " + t));
    //
    //
    //
    // find the employee who is most senior based on joining date
    Optional<Employee> res2 = emps
      .stream()
      .min((emp1, emp2) ->
        emp1.getJoiningDate().compareTo(emp2.getJoiningDate())
      );

    res2.ifPresent(t -> System.out.println("\nmost senior employee : " + res2));
    //
    //
    //
    // count of employee based on gender
    // long res3 = emps
    //   .stream()
    //   .filter(emp -> emp.getGender().equals("F"))
    //   .count();
    // System.out.println("\nnumber of female employees : " + res3);
    //
    Map<String, Long> collect = emps
      .stream()
      .collect(
        Collectors.groupingBy(Employee::getGender, Collectors.counting())
      );

    System.out.println(collect);
  }
}
