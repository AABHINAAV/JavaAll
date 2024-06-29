class Person implements Cloneable {

  String name;
  int id;

  public Person(String name, int id) {
    this.name = name;
    this.id = id;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

class Result {

  public static void main(String[] args) {
    Person person1 = new Person("person1", 1);

    Person person2 = person1.clone();
  }
}
