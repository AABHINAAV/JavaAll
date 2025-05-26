package b_java_se_8.g_method_referencing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class c_instance_method_2 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    // Using method reference to refer to an instance method on an arbitrary object
    List<Integer> evenNumbers = numbers
      .stream()
      .filter(c_instance_method_2::isEven) // Instance method reference
      .collect(Collectors.toList());

    System.out.println(evenNumbers); // Output: [2, 4, 6, 8]
  }

  public static boolean isEven(Integer number) {
    return number % 2 == 0;
  }
}
