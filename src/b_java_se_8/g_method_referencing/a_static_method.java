package b_java_se_8.g_method_referencing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class a_static_method {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry");

    // Using method reference to refer to a static method
    List<String> upperCaseWords = words
      .stream()
      .map(String::toUpperCase) // Static method reference
      .collect(Collectors.toList());

    System.out.println(upperCaseWords); // Output: [APPLE, BANANA, CHERRY]
  }
}
