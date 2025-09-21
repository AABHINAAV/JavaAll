package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class j_sort_chars_on_basis_of_their_frequency {

  public static void main(String[] args) {
    System.out.println("\n");
    String str = "abracadabra";

    System.out.println(
      Arrays
        .stream(str.split(""))
        .filter(ch -> !ch.equals(""))
        .collect(
          Collectors.groupingBy(Function.identity(), Collectors.counting())
        )
        .entrySet()
        .stream()
        .sorted(Comparator.comparing(e -> e.getValue()))
        // .map(e -> e.getKey())
        .collect(
          Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
          )
        )
      // .collect(Collectors.joining(""))
    );
  }
}
