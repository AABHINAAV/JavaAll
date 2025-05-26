package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class a_c_find_all_nums_start_with_2 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> result = list
      .stream()
      // .map(e -> String.valueOf(e))
      .map(String::valueOf)
      .filter(e -> e.startsWith("2"))
      // .map(e -> Integer.valueOf(e))
      .map(Integer::valueOf)
      .collect(Collectors.toList());

    System.out.println(result.toString());
  }
}
