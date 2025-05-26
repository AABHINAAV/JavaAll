package e_custom_mutable_immutable;

import java.util.Set;

class MutablePerson {

  String name;
  int age;
  Set<String> sports;

  public MutablePerson(String name, int age, Set<String> sports) {
    this.name = name;
    this.age = age;
    this.sports = sports;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSports(Set<String> sports) {
    this.sports = sports;
  }

  public Set<String> getSports() {
    return this.sports;
  }

  @Override
  public String toString() {
    return (
      "MutablePerson [name=" +
      name +
      ", age=" +
      age +
      ", sports=" +
      sports +
      "]"
    );
  }
}
