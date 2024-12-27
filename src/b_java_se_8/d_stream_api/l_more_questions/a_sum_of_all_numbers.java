package b_java_se_8.d_stream_api.l_more_questions;

import java.util.Arrays;
import java.util.List;

public class a_sum_of_all_numbers {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

    Integer total = list
      .stream() // creating stream
      .reduce(0, (a, b) -> a + b); // reducing to make sum

    System.out.println("total : " + total);
  }
}
