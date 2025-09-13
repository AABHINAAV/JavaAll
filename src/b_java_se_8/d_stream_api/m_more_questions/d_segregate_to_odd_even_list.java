package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class d_segregate_to_odd_even_list {

  public static void printing_odd_even() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

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

    List<List<Integer>> res = list
      .stream()
      .collect(Collectors.groupingBy(n -> n & 1))
      .entrySet()
      .stream()
      .map(singleSet -> singleSet.getValue())
      .collect(Collectors.toList());

    System.out.println("Result : " + res);
  }

  public static void main(String[] args) {
    printing_odd_even();
  }
}
