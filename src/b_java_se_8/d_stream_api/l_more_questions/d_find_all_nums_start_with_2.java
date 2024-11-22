package b_java_se_8.d_stream_api.l_more_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class d_find_all_nums_start_with_2 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(null);

    List<Integer> result = list
      .stream()
      .map(String::valueOf)
      .filter(e -> e.startsWith("2"))
      .map(Integer::valueOf)
      .collect(Collectors.toList());

    System.out.println(result.toString());
  }
}
