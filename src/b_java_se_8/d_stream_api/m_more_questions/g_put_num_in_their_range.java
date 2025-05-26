package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class g_put_num_in_their_range {

  public static void main(String[] args) {
    int[] arr = { 2, 4, 10, 14, 25, 27, 34, 38 };

    Map<Integer, List<Integer>> result = Arrays
      .stream(arr)
      .boxed()
      .collect(
        Collectors.groupingBy(
          n -> n / 10 * 10,
          LinkedHashMap::new,
          Collectors.toList()
        )
      );

    System.out.println(result);
  }
}
