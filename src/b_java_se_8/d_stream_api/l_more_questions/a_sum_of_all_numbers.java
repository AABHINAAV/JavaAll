package b_java_se_8.d_stream_api.l_more_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class a_sum_of_all_numbers {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(null);

    Optional<Integer> total = list
      .stream() // creating stream
      .reduce((a, b) -> a + b); // reducing to make sum

    System.out.println("total : " + total.get());
  }
}
