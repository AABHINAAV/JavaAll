package b_java_se_8.c_higher_order_functions;

import java.util.function.Consumer;

public class a_hof_using_consumer {

  public static Consumer<String> makeConsumer() {
    return str -> System.out.println(str);
  }

  public static void useConsumer(String str, Consumer<String> consumerObj) {
    consumerObj.accept(str);
  }

  public static void main(String[] args) {
    String s = "\nHigher Order Function using Consumer";

    //

    Consumer<String> consumerObj1 = str -> {
      System.out.println(str);
    };
    useConsumer(s, consumerObj1);

    //
    //
    //

    Consumer<String> consumerObj2 = makeConsumer();
    useConsumer(s, consumerObj2);
  }
}
