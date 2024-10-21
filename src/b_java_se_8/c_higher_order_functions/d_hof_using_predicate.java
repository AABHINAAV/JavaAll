package b_java_se_8.c_higher_order_functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class d_hof_using_predicate {

  public static Predicate<String> makePredicate() {
    return str -> str.length() > 10;
  }

  public static boolean usePredicate(
    String str,
    Predicate<String> predicateObj
  ) {
    return predicateObj.test(str);
  }

  public static void main(String[] args) {
    String s = "Higer Order Function Using Predicate";

    //

    Predicate<String> predicateObj1 = str -> {
      return str.length() > 10;
    };
    System.out.println("Predicate test : " + usePredicate(s, predicateObj1));

    //
    //
    //

    Predicate<String> predicateObj2 = makePredicate();
    System.out.println("Predicate test : " + usePredicate(s, predicateObj2));
  }
}
