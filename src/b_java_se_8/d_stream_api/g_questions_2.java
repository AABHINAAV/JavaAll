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
              Comparator.comparingDouble(Employee::getSalary)
            )
          )
        )
      );

      System.out.println(res);
  }

  public static void main(String[] args) {
    find_highest_salary_in_each_gender();
  }
}
