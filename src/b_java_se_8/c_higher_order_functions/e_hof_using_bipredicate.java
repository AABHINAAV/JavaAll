package b_java_se_8.c_higher_order_functions;

import java.util.function.BiPredicate;

public class e_hof_using_bipredicate {

  public static BiPredicate<String, String> makeBiPredicate() {
    return (str1, str2) -> str1.length() > str2.length();
  }

  public static boolean useBipredicate(
    String str1,
    String str2,
    BiPredicate<String, String> biPredicateObj
  ) {
    return biPredicateObj.test(str1, str2);
  }

  public static void main(String[] args) {
    String s1 = "first name";
    String s2 = "last name";

    //

    BiPredicate<String, String> bipredicateObj1 = (str1, str2) -> {
      return str1.length() > str2.length();
    };
    System.out.println(
      "Bipredicate test : " + useBipredicate(s1, s2, bipredicateObj1)
    );

    //
    //
    //

    BiPredicate<String, String> bipredicateObj2 = makeBiPredicate();
    System.out.println(
      "Bipredicate test : " + useBipredicate(s1, s2, bipredicateObj2)
    );
  }
}
