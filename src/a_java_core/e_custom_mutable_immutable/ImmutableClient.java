package e_custom_mutable_immutable;

import java.util.HashSet;
import java.util.Set;

public class ImmutableClient {

  public static void checkMutableClass() {
    System.out.println("\nchecking mutable class");
    String name = "name1";
    int age = 10;
    Set<String> sports = new HashSet<String>();
    sports.add("sport1");
    sports.add("sports2");

    MutablePerson immutablePerson = new MutablePerson(name, age, sports);
    System.out.println(immutablePerson.toString());

    sports.add("sports3");

    Set<String> sportsObj = immutablePerson.getSports();
    sportsObj.add("sports4");

    System.out.println(immutablePerson.toString());
  }

  public static void checkImmutableClass() {
    System.out.println("\nchecking immutable class");
    String name = "name1";
    int age = 10;
    Set<String> sports = new HashSet<String>();
    sports.add("sport1");
    sports.add("sports2");

    ImmutablePerson immutablePerson = new ImmutablePerson(name, age, sports);
    System.out.println(immutablePerson.toString());

    sports.add("sports3");

    Set<String> sportsObj = immutablePerson.getSports();
    sportsObj.add("sports4");

    System.out.println(immutablePerson.toString());
  }

  public static void main(String[] args) {
    checkMutableClass();
    checkImmutableClass();
  }
}
