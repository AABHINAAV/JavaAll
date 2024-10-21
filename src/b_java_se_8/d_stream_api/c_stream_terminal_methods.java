package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class c_stream_terminal_methods {

  public static void terminal_reduce_() {
    System.out.println("\nreduce() :-");
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
    // It takes an initial value and a binary operator, and applies the operator to the initial value
    // and each element of the stream to produce a final result.
    System.out.println(sum);
  }

  public static void terminal_count_() {
    System.out.println("\ncount() :-");
    List<String> words = Arrays.asList("hello", "world");
    long wordCount = words.stream().count();
    // counts number of elements in stream
    System.out.println(wordCount);
  }

  public static void terminal_min_() {
    System.out.println("\nmin() :-");
    List<Integer> numbers = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

    Optional<Integer> minNumber = numbers
      .stream()
      .min((i, j) -> i.compareTo(j));
    // find the minimum element in a stream based on a specified comparator
    // max of stream api works same but finds max

    minNumber.ifPresent(minNum -> System.out.println(minNum));
  }

  public static void main(String[] args) {
    // terminal_reduce_();

    // terminal_count_();

    terminal_min_();
  }
}
