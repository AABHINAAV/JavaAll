class Person {

  String name;
  int id;

  public Person(String name, int id) {
    this.name = name;
    this.id = id;
  }
}

class Result {

  public static void main(String[] args) {
    Person person1 = new Person("person1", 1);

    Person person2 = person1;
  }
}
