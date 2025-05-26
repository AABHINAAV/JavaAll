package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class b_remove_duplicate_and_return_in_same_order {

  public static void main(String[] args) {
    String sentence =
      "SOLID principles are SOLID principles guidelines are SOLID general principles guidelines are are";

    String result = Arrays
      .stream(sentence.split(" "))
      .distinct()
      .collect(Collectors.joining(" "));

    System.out.println("result : " + result);
  }
}
