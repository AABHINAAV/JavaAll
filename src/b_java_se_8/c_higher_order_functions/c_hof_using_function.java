package b_java_se_8.c_higher_order_functions;

import java.util.function.Function;

public class c_hof_using_function {

  public static Integer fun(String str, Function<String, Integer> functionObj) {
    return functionObj.apply(str);
  }

  public static void main(String[] args) {
    Function<String, Integer> functionObj = str -> {
      return str.length();
    };

    String str = "Higher Order Function Using Function";

    System.out.println("length : " + fun(str, functionObj));
  }
}
