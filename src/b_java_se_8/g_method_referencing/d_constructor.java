package b_java_se_8.g_method_referencing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {

  private String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class d_constructor {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("John", "Jane", "James");

    // Using constructor reference to create new Person objects
    List<Person> people = names
      .stream()
      .map(Person::new) // Constructor reference
      .collect(Collectors.toList());

    people.forEach(person -> System.out.println(person.getName()));
  }
}
