package b_java_se_8.d_stream_api;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class i_string_joinger {

  public static void main(String[] args) {
    //      given string "hello how are you".
    //      convert it into "[hello-how-are-you]"

    // method 1 : using methods of string
    String str = "hello how are you";
    String result1 = "[" + str.replace(" ", "-") + "]";
    System.out.println(result1);

    //
    //
    //
    //
    //
    // method 2 : using StringJoiner class (added in java 8)
    String[] strarr = str.split(" ");
    StringJoiner result2 = new StringJoiner("-", "[", "]");
    for (String word : strarr) {
      result2.add(word);
    }
    System.out.println(result2);

    //
    //
    //
    //
    //
    // method 3 : using stream
    String[] strarr1 = str.split(" ");
    String result3 =
      "[" + Arrays.stream(strarr1).collect(Collectors.joining("-")) + "]";
    System.out.println(result3);
  }
}
