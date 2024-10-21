package b_java_se_8.c_higher_order_functions;

import java.util.function.Supplier;

public class b_hof_using_supplier {

  public static String fun(Supplier<String> supplierObj) {
    return supplierObj.get();
  }

  public static void main(String[] args) {
    Supplier<String> supplierObj = () -> {
      return "Higher Order Function using Supplier";
    };

    System.out.println(fun(supplierObj));
  }
}
