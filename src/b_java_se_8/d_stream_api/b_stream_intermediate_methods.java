package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class b_stream_intermediate_methods {

  public static void terminal_forEach_() {
    System.out.println("\nforEach() :-");
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    // stream.forEach(e -> System.out.println(e));
    stream.forEach(System.out::println);
  }

  public static void intermediate_filter_() {
    System.out.println("\nfilter() :-");
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    List<Integer> res = stream.filter(i -> i > 3).collect(Collectors.toList());
    System.out.println(res);
  }

  public static void intermedicate_map_() {
    System.out.println("\nmap() :-");
    Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    List<Integer> res = stream.map(i -> i * i).collect(Collectors.toList());
    System.out.println(res);
  }

  public static void intermediate_sorted_() {
    System.out.println("\nsorted() :-");
    Stream<Integer> stream = Stream.of(5, 1, 4, 2, 3);

    List<Integer> res1 = stream.sorted().collect(Collectors.toList());
    // List<Integer> res1 = stream.sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
    System.out.println(res1);

    stream = Stream.of(5, 1, 4, 2, 3);
    // List<Integer> res2 = stream.sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());
    // List<Integer> res2 = stream.sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
    List<Integer> res2 = stream
      .sorted(Comparator.reverseOrder())
      .collect(Collectors.toList());
    System.out.println(res2);
  }

  public static void intermediate_distinct_() {
    System.out.println("\ndistinct() :-");
    Stream<Integer> stream = Stream.of(5, 1, 5, 3, 3);
    List<Integer> res = stream.distinct().collect(Collectors.toList());
    System.out.println(res);
  }

  public static void intermediate_limit_() {
    System.out.println("\nlimit() :-");
    Stream<Integer> stream = Stream.iterate(1, n -> n + 2);
    // creates an infinite stream starting from 1 with logic given ahead
    // Stream<Integer> stream = Stream.of(5, 1, 5);
    List<Integer> limitedStream = stream.limit(5).collect(Collectors.toList());
    // returns a stream of size maximum 5 with first 5 elements of stream
    // if less elements presnet in stream then less are returned in result
    System.out.println(limitedStream);

    //
    //
    //
    // sum of first 5 numbers
    stream = Stream.iterate(1, n -> n + 2);
    Integer sumOfFirst5 = stream.limit(5).reduce((a, b) -> a + b).get();
    System.out.println(sumOfFirst5);
  }

  public static void intermediate_flatMap_() {
    System.out.println("\nflatMap() :-");

    List<List<Integer>> nestedLists = Arrays.asList(
      Arrays.asList(1, 2),
      Arrays.asList(3, 4)
    );
    List<Integer> flattenedStream = nestedLists
      .stream()
      .flatMap(List::stream)
      .collect(Collectors.toList());
    // used to flatten a stream of streams into a single stream

    System.out.println(flattenedStream);
  }

  public static void intermediate_skip() {
    int[] array = new int[10];
    Arrays.setAll(array, i -> i + 1);

    System.out.println(array);

    List<Integer> result = Arrays
      .stream(array)
      .limit(5) // returns IntStream
      .skip(2) // returns IntStream
      .boxed() // convert from IntStream to Stream<Integer>
      .toList(); // convert from Stream<Integer> to List<Integer>

    System.out.println(result);
  }

  public static void main(String[] args) {
    // terminal_forEach_();

    // intermediate_filter_();

    // intermedicate_map_();

    // intermediate_sorted_();

    // intermediate_distinct_();

    // intermediate_limit_();

    // intermediate_flatMap_();

    intermediate_skip();
  }
}
