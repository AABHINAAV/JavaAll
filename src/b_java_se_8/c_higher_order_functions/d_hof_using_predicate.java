package b_java_se_8.c_higher_order_functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class d_hof_using_predicate {

  public static boolean fun_predicate(
    String str,
    Predicate<String> predicateObj
  ) {
    return predicateObj.test(str);
  }

  public static boolean fun_bipredicate(
    String str1,
    String str2,
    BiPredicate<String, String> biPredicateObj
  ) {
    return biPredicateObj.test(str1, str2);
  }

  public static void main(String[] args) {
    Predicate<String> predicateObj = str -> {
      return str.length() > 10;
    };

    String str = "Higer Order Function Using Predicate";

    System.out.println("Predicate test : " + fun_predicate(str, predicateObj));
    //
    //
    //
    //
    //
    BiPredicate<String, String> bipredicateObj = (str1, str2) -> {
      return str1.length() > str2.length();
    };

    System.out.println(
      "Bipredicate test : " +
      fun_bipredicate("first name", "last name", bipredicateObj)
    );
  }
}
