package b_java_se_8.f_optional_class;

import java.util.Optional;

public class a {

  public static void main(String[] args) {
    Optional<String> emptyOptional = Optional.empty();
    emptyOptional.ifPresent(val -> System.out.println(val));
    // nothing will pring
    if (emptyOptional.isPresent()) {
      System.out.println(emptyOptional.get());
    } else {
      System.out.println("empty");
      // it will print
    }

    // Creating Optional with a value
    Optional<String> optionalValue = Optional.of("Hello, World!");

    // Creating Optional with a nullable value (can be null)
    Optional<String> optionalNullable = Optional.ofNullable(null); // Can be empty

    // Using ifPresent() to check if the value is present
    // it takes Consumer<a> HOF
    optionalValue.ifPresent(value -> System.out.println(value)); // Outputs: Hello, World!

    // Using isPresent() to check if a value is present
    if (optionalNullable.isPresent()) {
      System.out.println("Value is present");
    } else {
      System.out.println("Value is not present"); // Outputs: Value is not present
    }

    // Using orElse() to return a default value if the Optional is empty
    String result = optionalNullable.orElse("Default Value");
    System.out.println(result); // Outputs: Default Value

    // Using map() to transform the value inside the Optional
    // takes Function<a, b> HOF
    Optional<String> transformed = optionalValue.map(String::toUpperCase);
    transformed.ifPresent(System.out::println); // Outputs: HELLO, WORLD!

    // Using orElseThrow() to throw an exception if the value is not present
    // takes Supplier<a> HOF
    String value = optionalNullable.orElseThrow(() ->
      new IllegalArgumentException("Value not present")
    );
  }
}
