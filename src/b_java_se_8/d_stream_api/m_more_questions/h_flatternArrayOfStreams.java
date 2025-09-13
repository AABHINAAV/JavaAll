package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class h_flatternArrayOfStreams {

  public static void main(String[] args) {
    Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 } };
    List<Object> result = flattenToStream(array).collect(Collectors.toList());
    System.out.println(result); // Output: [1, 2, 3, 4, 5, 6, 7]
  }

  // Recursive method to flatten using Stream API
  public static Stream<Object> flattenToStream(Object[] arr) {
    return Arrays
      .stream(arr)
      .flatMap(o ->
        (o instanceof Object[]) ? flattenToStream((Object[]) o) : Stream.of(o)
      );
  }
}
