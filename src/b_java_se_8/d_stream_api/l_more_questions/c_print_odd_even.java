package b_java_se_8.d_stream_api.l_more_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class c_print_odd_even {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(null);

    List<Integer> oddNumbers = list
      .stream() // creating stream
      .filter(e -> (e & 1) == 1) // checking for odd
      .collect(Collectors.toList()); // collecting in list

    System.out.println("odds : " + oddNumbers);

    List<Integer> evenNumbers = list
      .stream() // creating stream
      .filter(e -> (e & 1) == 0) // checking for even
      .collect(Collectors.toList()); // collecting in list

    System.out.println("odds : " + evenNumbers);
  }
}
