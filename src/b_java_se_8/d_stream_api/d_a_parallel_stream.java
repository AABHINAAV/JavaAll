package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.List;

public class d_a_parallel_stream {

  public static void main(String[] args) {
    System.out.println("\n");

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

    list.stream().parallel().forEach(i -> System.out.println(i));

    System.out.println("\n\n");

    list.parallelStream().forEach(i -> System.out.println(i));
  }
}
