import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Person {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Result {

  public static void main(String[] args) {
    Person person = new Person();
    person.setName("first name");

    //

    Predicate<Person> predicateObj = p -> {
      return p.getName() == "first name";
    };

    System.out.println(predicateObj.test(person));

    //

    BiPredicate<Person, Integer> bipredicateObj = (p, len) -> {
      return p.getName().length() == len;
    };

    System.out.println(bipredicateObj.test(person, 5));
  }
}
