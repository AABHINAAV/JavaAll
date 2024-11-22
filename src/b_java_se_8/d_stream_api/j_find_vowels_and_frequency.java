package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class j_find_vowels_and_frequency {

  public static void findVowels() {
    String str = "hello hello";
    long count = str
      .chars()
      .filter(e -> {
        return (e == 'a' || e == 'e' || e == 'i' || e == 'o' || e == 'u');
      })
      .count();

    System.out.println("\nvowels count :" + count);
  }

  public static void countFrequency() {
    String str = "hello hello";

    // method 1
    Map<String, Long> res1 = str
      .chars() // converting to IntStream
      .mapToObj(e -> (char) e) // converting each int to char
      .filter(e -> !e.equals(' ')) // removing ' '
      .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

    System.out.println(res1.toString());
    //
    //
    //
    //
    //
    // method 2
    String[] strarr = str.split("");
    Map<String, Long> res2 = Arrays
      .stream(strarr)
      .filter(e -> !e.equals(" "))
      .collect(
        Collectors.groupingBy(Function.identity(), Collectors.counting())
      );
    System.out.println(res2.toString());
  }

  public static void countFrequency2() {
    List<Integer> numlist = Arrays.asList(1, 3, 2, 1, 4, 2, 3, 4);

    Map<Integer, Long> result = numlist
      .stream()
      .collect(
        Collectors.groupingBy(Function.identity(), Collectors.counting())
      );

    System.out.println(result.toString());
    // same things can also work for list of strings
  }

  public static void main(String[] args) {
    findVowels();
    countFrequency();
    countFrequency2();
  }
}
