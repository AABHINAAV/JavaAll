package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class k_first_repeated_non_repeated {

  public static void method1_by_creating_map() {
    String str = "hello world";

    Map<Character, Long> charFreq = str
      .chars()
      .mapToObj(e -> (char) e)
      .collect(
        Collectors.groupingBy(
          Function.identity(),
          LinkedHashMap::new,
          Collectors.counting()
        )
      );

    Optional<Character> firstNonRepeating = charFreq
      .entrySet()
      .stream()
      .filter(e -> e.getValue() == 1)
      .map(e -> e.getKey())
      .findFirst();

    if (firstNonRepeating.isPresent()) {
      System.out.println(firstNonRepeating);
    }

    Optional<Character> firstRepeating = charFreq
      .entrySet()
      .stream()
      .filter(e -> e.getValue() > 1)
      .map(e -> e.getKey())
      .findFirst();

    if (firstRepeating.isPresent()) {
      System.out.println(firstRepeating);
    }
  }

  public static void method2_by_using_Collections_frequency() {
    List<Integer> list = Arrays.asList(null);

    Set<Integer> result1 = list
      .stream()
      .filter(e -> Collections.frequency(list, e) > 1)
      .collect(Collectors.toSet());

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

  public static void main(String[] args) {
    // method1_by_creating_map();
    method2_by_using_Collections_frequency();
  }
}
