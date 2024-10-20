import java.util.function.Consumer;

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
    Consumer<Person> consumerObj = person -> {
      person.setName("first name");
    };

    Person person = new Person();
    consumerObj.accept(person);
  }
}
