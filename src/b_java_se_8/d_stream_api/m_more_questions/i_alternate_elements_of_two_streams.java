package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Given two Java Lists, how would you merge their elements alternately
 * (i.e., pick one element from each stream in order)?
 * The result should interleave the elements from both list. Use stream api.
 * Handle cases where the streams are of unequal lengths
 */

public class i_alternate_elements_of_two_streams {

  public static void main(String[] args) {
    String[] arr1 = new String[] { "A", "C", "E" };
    String[] arr2 = new String[] { "B", "D", "F", "G" };

    Stream<String> s1 = Arrays.stream(arr1);
    Stream<String> s2 = Arrays.stream(arr2);

    Iterator<String> itr1 = s1.iterator();
    Iterator<String> itr2 = s2.iterator();

    List<String> result = Stream
      .generate(() -> null)
      .takeWhile(x -> itr1.hasNext() || itr2.hasNext())
      .flatMap(x ->
        Stream.of(
          itr1.hasNext() ? itr1.next() : null,
          itr2.hasNext() ? itr2.next() : null
        )
      )
      .filter(x -> Objects.nonNull(x))
      .collect(Collectors.toList());

    System.out.println(result);
  }
}
