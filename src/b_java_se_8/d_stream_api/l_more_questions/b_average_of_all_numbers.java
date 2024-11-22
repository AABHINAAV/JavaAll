package b_java_se_8.d_stream_api.l_more_questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class b_average_of_all_numbers {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(null);

    double average = list
      .stream() // creating stream
      .mapToDouble(e -> e) // converting int to double
      .average() // getting average of all double | returns OptionalDouble
      .getAsDouble(); // static method of OptionalDouble

    System.out.println("total : " + average);
  }
}
