package b_java_se_8.c_higher_order_functions;

import java.util.function.Consumer;

public class a_hof_using_consumer {

  public static void fun(String str, Consumer<String> consumerObj) {
    consumerObj.accept(str);
  }

  public static void main(String[] args) {
    Consumer<String> consumerObj = str -> {
      System.out.println(str);
    };

    String str = "Higher Order Function using Consumer";

    fun(str, consumerObj);
  }
}
