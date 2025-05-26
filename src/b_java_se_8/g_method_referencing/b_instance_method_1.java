package b_java_se_8.g_method_referencing;

import java.util.Arrays;
import java.util.List;

class StringPrinter {

  public void print(String s) {
    System.out.println(s);
  }
}

public class b_instance_method_1 {

  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry");

    // Using method reference to refer to an instance method on a specific object
    StringPrinter printer = new StringPrinter();
    words.forEach(printer::print); // Instance method reference
    // Output:
    // apple
    // banana
    // cherry
  }
}
