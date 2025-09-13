package e_custom_mutable_immutable;

import java.util.HashSet;
import java.util.Set;

public class ImmutablePerson {

  private final String name;
  private final int age;
  private final Set<String> sports;

  public ImmutablePerson(
    String name,
    int age,
    Set<String> sports
  ) {
    this.name = name;
    this.age = age;
    this.sports = new HashSet<>(sports);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Set<String> getSports() {
    return new HashSet<String>(this.sports);
  }

  @Override
  public String toString() {
    return (
      "ImmutablePerson [name=" +
      name +
      ", age=" +
      age +
      ", sports=" +
      sports +
      "]"
    );
  }
}
