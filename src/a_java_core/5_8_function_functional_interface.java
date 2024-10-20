import java.util.function.Function;

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
    Function<Person, String> functionObj = p -> {
      return p.getName();
    };

    Person person = new Person();
    person.setName("first name");

    System.out.println(functionObj.apply(person));
  }
}
