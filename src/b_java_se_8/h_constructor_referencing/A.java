package b_java_se_8.h_constructor_referencing;

import java.util.function.Function;
import java.util.function.Supplier;

class Person {

  private String name = "name1";

  public String getName() {
    return name;
  }
}

class Person2 {

  private String name;

  public Person2(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class A {

  public static void main(String[] args) {
    Supplier<Person> personSupplier = Person::new;
    Person person = personSupplier.get();
    System.out.println(person.getName());

    Function<String, Person2> person2Function = Person2::new;
    Person2 person2 = person2Function.apply("name2");
    System.out.println(person2.getName());
  }
}
