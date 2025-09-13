package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class e_sorting_questions {

  public static void simpleSorting() {
    List<String> names = Arrays.asList(
      "Abhinav",
      "Shristi Kataria",
      "Avi",
      "Bhavya"
    );

    // sorting on basis of alphabets in names
    List<String> result1 = names.stream().sorted().collect(Collectors.toList());
    System.out.println(result1);

    //
    //
    //

    // sorting on basis of lengths of names
    List<String> result2 = names
      .stream()
      // .sorted(
      //   (name1, name2) -> name1.length().compareTo(name2.length())
      // ) // compareTo() cannot be invoked on primitive
      .sorted((name1, name2) -> Integer.compare(name1.length(), name2.length()))
      .toList();
    System.out.println(result2);
  }

  public static void sortOnBasisOfSalary() {
    List<Employee> emps = Employee.createData();

    List<Employee> result = emps
      .stream()
      // .sorted((emp1, emp2) -> emp1.getSalary().compareTo(emp2.getSalary()))
      // .sorted(Comparator.comparingDouble(Employee::getSalary))
      .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
      .collect(Collectors.toList());

    System.out.println(result);
  }

  public static Comparator<Employee> getComparator() {
    Comparator<Employee> comparatorObj = (emp1, emp2) -> {
      int len1 = emp1.getName().length();
      int len2 = emp2.getName().length();

      //   if (len1 < len2) {
      //     return -1;
      //   } else if (len1 > len2) {
      //     return 1;
      //   } else {
      //     return 0;
      //   }

      return Integer.compare(len1, len2);
    };

    return comparatorObj;
  }

  public static void sortOnBasisOfStringLength() {
    List<Employee> emps = Employee.createData();

    // creating comparator at same point
    List<Employee> res1 = emps
      .stream()
      // .sorted(
      //   (emp1, emp2) -> emp1.getName().length().compareTo(emp2.getName().length())
      // )  // cannot be invoked on primitive types
      .sorted((emp1, emp2) ->
        Integer.compare(emp1.getName().length(), emp2.getName().length())
      // Integer.compare(emp2.getName().length(), emp1.getName().length()) // * reversed
      )
      .collect(Collectors.toList());
    // System.out.println("res1 : " + res1);

    //
    //
    //

    // using comparingInt() to create comparator
    List<Employee> res2 = emps
      .stream()
      // .sorted(Comparator.comparingInt(emp -> emp.getName().length()))
      .sorted(
        Comparator.comparing(
          (Employee emp) -> emp.getName().length(),
          Comparator.reverseOrder()
        )
      ) // * reversed
      .collect(Collectors.toList());
    // System.out.println("res2 : " + res2);

    //
    //
    //

    // using comparing() to create comparator
    List<Employee> res3 = emps
      .stream()
      .sorted(Comparator.comparing(emp -> emp.getName().length()))
      .collect(Collectors.toList());
    // System.out.println("res3 : " + res3);

    //
    //
    //

    // same as first one but taking comparator in a method outside
    List<Employee> res4 = emps
      .stream()
      .sorted(getComparator())
      .collect(Collectors.toList());
    // System.out.println("res4 : " + res4);

    //
    //
    //

    // using comparing() to create comparator
    List<Employee> res5 = emps
      .stream()
      .sorted(
        Comparator.comparing((Employee e) -> e.getName().length()).reversed()
      ) // during multiple methods in comparator datatype like employee is necessary to provide
      // otherwise it will take it as Object which will not have getName
      // incase of adding reversed()
      .collect(Collectors.toList());
    System.out.println("res5 : " + res5);
  }

  public static void mergeTwoUnsortedArrayAndInSortedOrder() {
    int[] array1 = { 5, 1, 9, 3 };
    int[] array2 = { 8, 2, 6, 4 };

    int[] array = IntStream
      .concat(Arrays.stream(array1), Arrays.stream(array2))
      .sorted()
      .toArray();

    System.out.println(array.toString());
  }

  public static void main(String[] args) {
    // simpleSorting();

    // sortOnBasisOfSalary();

    sortOnBasisOfStringLength();

    mergeTwoUnsortedArrayAndInSortedOrder();
  }
}
