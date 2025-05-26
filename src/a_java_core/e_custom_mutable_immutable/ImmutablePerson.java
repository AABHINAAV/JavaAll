package e_custom_mutable_immutable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ImmutablePerson {

  private final String name;
  private final int age;
  private final Set<String> sports;
  private final List<String> subjects;

  public ImmutablePerson(
    String name,
    int age,
    Set<String> sports,
    List<String> subjects
  ) {
    this.name = name;
    this.age = age;
    this.sports = new HashSet<>(sports);
    this.subjects = new ArrayList<>(subjects);
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

  public List<String> getSubjects() {
    return new ArrayList<>(this.subjects);
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
      ", subjects=" +
      subjects +
      "]"
    );
  }
}
