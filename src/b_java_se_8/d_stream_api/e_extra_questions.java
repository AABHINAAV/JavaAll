package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class e_extra_questions {

  public static void sortOnBasisOfStringLength() {
    List<String> names = Arrays.asList(
      "Abhinav",
      "Shristi Kataria",
      "Avi",
      "Bhavya"
    );

    // using comparator for custom sorting
    Comparator<String> comparatorObj = (name1, name2) -> {
      int len1 = name1.length();
      int len2 = name2.length();

      //   if (len1 < len2) {
      //     return -1;
      //   } else if (len1 > len2) {
      //     return 1;
      //   } else {
      //     return 0;
      //   }

      return Integer.compare(len1, len2);
    };

    // List<String> res = names
    //   .stream()
    //   .sorted(comparatorObj)
    //   .collect(Collectors.toList());

    // List<String> res = names
    // .stream()
    // .sorted((name1, name2) -> Integer.compare(name1.length(), name2.length()))
    // .collect(Collectors.toList());

    List<String> res = names
      .stream()
      .sorted(Comparator.comparingInt(String::length))
      .collect(Collectors.toList());

    System.out.println(res);
  }

  public static void main(String[] args) {
    sortOnBasisOfStringLength();
  }
}
