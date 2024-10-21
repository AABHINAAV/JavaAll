package b_java_se_8.c_higher_order_functions;

import java.util.function.Function;

public class c_hof_using_function {

  public static Function<String, Integer> makeFunction() {
    return str -> str.length();
  }

  public static Integer useFunction(String str, Function<String, Integer> functionObj) {
    return functionObj.apply(str);
  }

  public static void main(String[] args) {
    String s = "\nHigher Order Function Using Function";

    //

    Function<String, Integer> functionObj1 = str -> {
      return str.length();
    };
    System.out.println("length : " + useFunction(s, functionObj1));

    // 
    // 
    // 

    Function<String, Integer> functionObj2 = makeFunction();
    System.out.println("length : " + useFunction(s, functionObj2));
  }
}
