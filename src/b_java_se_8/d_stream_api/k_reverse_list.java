package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class k_reverse_list {

  public static void reverse_list_using_stream() {
    List<String> list = Arrays.asList("Java", "Spring", "Hibernate");

    List<String> reversed = IntStream
      .range(0, list.size())
      .mapToObj(i -> list.get(list.size() - 1 - i))
      .collect(Collectors.toList());

    System.out.println(reversed);
  }

  public static void create_map_num_with_its_square() {
    Map<Integer, Integer> res = IntStream
      .range(1, 5)
      .boxed()
      .collect(Collectors.toMap(n -> n, n -> n * n));
    System.out.println(res);
  }

  public static void check_all_salary_greater_than_specific_salary() {
    List<Employee> employees = Employee.createData();
    System.out.println(
      employees.stream().allMatch(emp -> emp.getSalary() > 5000)
    );
  }

  public static void main(String[] args) {
    // create_map_num_with_its_square();
    check_all_salary_greater_than_specific_salary();
  }
}
