import java.util.function.Supplier;

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
    Supplier<Person> supplierObj = () -> {
      Person person = new Person();
      person.setName("first name");
      return person;
    };

    System.out.println(supplierObj.get());
  }
}
