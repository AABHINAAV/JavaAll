package b_java_se_8.d_stream_api.l_more_questions;

import java.util.Arrays;
import java.util.List;

public class b_average_of_all_numbers {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

    double average = list
      .stream() // creating stream -> Stream<Integer>
      .mapToDouble(e -> e) // converting all int to double then returning DoubleStream
      .average() // abstract method of DoubleStream | getting average of all double | returns OptionalDouble
      .getAsDouble(); // static method of OptionalDouble to return double

    System.out.println("total : " + average);
  }
}
