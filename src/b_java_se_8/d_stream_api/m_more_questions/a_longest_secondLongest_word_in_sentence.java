package b_java_se_8.d_stream_api.m_more_questions;

import java.util.Arrays;
import java.util.Comparator;

public class a_longest_secondLongest_word_in_sentence {

  public static void longest_word() {
    String sentence = "SOLID principles are general guidelines";
    String[] words = sentence.split(" ");

    String res1 = Arrays
      .stream(words)
      .max((String w1, String w2) -> Integer.compare(w1.length(), w2.length()))
      .get();

    System.out.println("using lambda expression : " + res1);

    String res2 = Arrays
      .stream(words)
      .max(Comparator.comparing((String str) -> str.length()))
      .get();

    System.out.println("using comparator : " + res2);
  }

  public static void second_longest_word() {
    String sentence = "SOLID principle are general guidelines";
    String result = Arrays
      .stream(sentence.split(" "))
      // .sorted((String w1, String w2) ->
      //   Integer.compare(w2.length(), w1.length())
      // )
      .sorted(Comparator.comparingInt(String::length).reversed())
      .skip(1)
      .findFirst()
      .get();

    System.out.println("result : " + result);
  }

  public static void length_longest_word() {
    String sentence = "SOLID principle are general guidelines";
    int length = Arrays
      .stream(sentence.split(" "))
      .sorted(Comparator.comparingInt(String::length).reversed())
      .findFirst()
      .get()
      .length();

    System.out.println("result : " + length);
  }

  public static void main(String[] args) {
    // longest_word();
    //
    second_longest_word();
  }
}
