package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class c_words_with_n_vowels {

  public static void do1(String sentence) {
    List<String> result = Arrays
      .stream(sentence.split(" "))
      .filter(w -> {
        int count = 0;
        for (char ch : w.toCharArray()) {
          if (
            ch == 'a' ||
            ch == 'A' ||
            ch == 'e' ||
            ch == 'E' ||
            ch == 'i' ||
            ch == 'I' ||
            ch == 'o' ||
            ch == 'O' ||
            ch == 'u' ||
            ch == 'U'
          ) {
            count++;
          }
        }

        return count == 2 ? true : false;
      })
      .collect(Collectors.toList());

    System.out.println(result);
  }

  public static void do2(String sentence) {
    List<String> result = Arrays
      .stream(sentence.split(" "))
      .filter(word -> word.replaceAll("[^aeiouAEIOU]", "").length() == 2)
      .collect(Collectors.toList());

    System.out.println(result);
  }

  public static void main(String[] args) {
    String sentence = "SOLID principles are general guidelines";

    do1(sentence);
    do2(sentence);
  }
}
