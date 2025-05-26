package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class e_create_smallest_largest_num_from_arr {

  public static void smallest_num_from_arr() {
    String smallestNumber = IntStream
      .rangeClosed(1, 9)
      .boxed()
      .sorted()
      .map(String::valueOf)
      .collect(Collectors.joining(""));

    System.out.println("smallest number : " + smallestNumber);
  }

  public static void larget_num_from_arr() {
    String largestNumber = IntStream
      .rangeClosed(1, 9) // creating IntStream
      .boxed() // convert to Stream<Integer>
      .sorted(Collections.reverseOrder()) // sorting
      .map(String::valueOf) // convert to Stream<String>
      .collect(Collectors.joining("")); // collect to String

    System.out.println("result : " + largestNumber);
  }

  public static void main(String[] args) {
    smallest_num_from_arr();
    larget_num_from_arr();
  }
}
