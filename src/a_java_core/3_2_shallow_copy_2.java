class Address {

  String houseno;
  String street;
  String city;

  public Address(String houseno, String street, String city) {
    this.houseno = houseno;
    this.street = street;
    this.city = city;
  }
}

class Person implements Cloneable {

  String name;
  Address address;

  public Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

class Result {

  public static void main(String[] args) {
    Person person1 = new Person(
      "person1",
      Address("house1", "street1", "city1")
    );

    Person person2 = person1.clone();
  }
}
