package b_java_se_8.d_stream_api;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class f_comparisons {

  public static void main(String[] args) {
    List<Employee> emps = Employee.createData();

    // single comparison
    List<Employee> res1 = emps
      .stream()
      .sorted(Comparator.comparing(Employee::getName))
      .collect(Collectors.toList());

    System.out.println(res1);
    //
    //
    //
    //
    //
    // single comparison with reverse order
    List<Employee> res2 = emps
      .stream()
      .sorted(Comparator.comparing(Employee::getName).reversed())
      .collect(Collectors.toList());

    System.out.println(res2);
    //
    //
    //
    //
    //
    // multiple type comparisons
    List<Employee> res3 = emps
      .stream()
      .sorted(
        Comparator
          .comparing(Employee::getName)
          .thenComparing(Employee::getJoiningDate)
      )
      .collect(Collectors.toList());

    System.out.println(res3);
    //
    //
    //
    //
    //
    // multiple type comparisons with reversed order
    List<Employee> res4 = emps
      .stream()
      .sorted(
        Comparator
          .comparing(Employee::getName)
          .thenComparing(Employee::getJoiningDate)
          .reversed()
      )
      .collect(Collectors.toList());

    System.out.println(res4);
    //
    //
    //
    //
    //
    // multiple type comparisons with reversed order
    List<Employee> res5 = emps
      .stream()
      .sorted(
        Comparator
          .comparing((Employee e) -> e.getName().length())
          .thenComparing(Employee::getSalary)
          .thenComparing(Employee::getJoiningDate)
          .reversed()
      )
      .collect(Collectors.toList());
    System.out.println("res5 : " + res5);
    //
    //
    //
    //
    //
    /*
     * length in desc
     * salary in asc
     * joining date in desc
     * and then full reversed 😂
     */
    List<Employee> res6 = emps  //* List<Employees> */
      .stream()
      .sorted(
        Comparator
          .comparing((Employee e) -> e.getName().length(), Comparator.reverseOrder())
          // .thenComparing((Employee e) -> e.getSalary()) //* way 1
          .thenComparing(Employee::getSalary) //* way 2
          // .thenComparing((Employee e) -> e.getJoiningDate(), Comparator.reverseOrder()) //* way 1
          .thenComparing(Employee::getJoiningDate, Comparator.reverseOrder()) //* way 2
          .reversed()
      )
      .skip(1)
      .limit(2)
      .collect(Collectors.toList());
    System.out.println("res6 : " + res6);
  }
}
