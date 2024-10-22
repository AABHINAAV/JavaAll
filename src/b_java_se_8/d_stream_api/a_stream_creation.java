package b_java_se_8.d_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamCreation {

  public static void main(String[] args) {
    // converting a collection into stream using stream method of that collection
    List<String> l = new ArrayList<>();
    l.add("name 1");
    l.add("name 2");
    Stream<String> s1 = l.stream();

    System.out.println(s1);
    s1.forEach(i -> {
      System.out.println(i);
    });

    //
    //
    //

    // converting an array into stream using static stream method of Arrays class
    int[] arr = { 1, 2, 3 };
    IntStream s2 = Arrays.stream(arr);

    System.out.println(s2);
    s2.forEach(i -> {
      System.out.println(i);
    });

    //
    //
    //

    Stream<String> s11 = Arrays.stream(new String[] { "a", "b", "c", "d" });
    Stream<Integer> s21 = Arrays.stream(new Integer[] { 1, 2, 3, 4 });

    s11.forEach(i -> {
      System.out.println(i);
    });

    s21.forEach(i -> {
      System.out.println(i);
    });

    //
    //
    //

    IntStream s4 = Arrays.stream(new int[] { 1, 2, 3, 4 });

    System.out.println(s4);
    s4.forEach(i -> {
      System.out.println(i);
    });
  }
}
