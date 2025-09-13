package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class f_first_repeated_non_repeated {

  public static void method1_by_creating_map() {
    String str = "hello world";

    Map<String, Long> charFreq = Arrays
      .stream(str.split(""))
      .filter(ch -> !ch.equals(" "))
      .collect(
        Collectors.groupingBy(
          Function.identity(),
          LinkedHashMap::new, // added so to maintain the order of String
          Collectors.counting()
        )
      );

    String firstNonRepeating = charFreq
      .entrySet()
      .stream()
      .filter(e -> e.getValue() == 1)
      .findFirst()
      .get()
      .getKey();

    System.out.println("\n\n" + firstNonRepeating);

    Optional<String> firstRepeating = charFreq
      .entrySet()
      .stream()
      .filter(e -> e.getValue() > 1)
      .map(e -> e.getKey())
      .findFirst();

    if (firstRepeating.isPresent()) {
      System.out.println("\n\n" + firstRepeating.get());
    }
  }

  public static void method2_by_using_Collections_frequency() {
    String str = "hello world";

    List<Character> charList = str
      .chars()
      .mapToObj(e -> (char) e)
      .collect(Collectors.toList());

    Set<Character> result2 = charList
      .stream()
      .filter(e -> Collections.frequency(charList, e) > 1)
      .collect(Collectors.toSet());

    System.out.println(result2);
  }

  public static void method3_by_using_index() {
    String str = "hello world";

    Character firstNonRepeating = str
      .chars()
      .mapToObj(x -> (char) x)
      .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
      .findFirst()
      .get();

    System.out.println("first non repeating : " + firstNonRepeating);

    Character firsstRepeating = str
      .chars()
      .mapToObj(x -> (char) x)
      .filter(c -> str.indexOf(c) != str.lastIndexOf(c))
      .findFirst()
      .get();

    System.out.println("first repeating : " + firsstRepeating);
  }

  public static void main(String[] args) {
    method1_by_creating_map();
    //
    //
    // method2_by_using_Collections_frequency();
    //
    //
    // method3_by_using_index();
  }
}
