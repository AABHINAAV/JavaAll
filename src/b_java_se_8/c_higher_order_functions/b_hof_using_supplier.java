package b_java_se_8.c_higher_order_functions;

import java.util.function.Supplier;

public class b_hof_using_supplier {

  public static Supplier<String> makeSupplier(String str) {
    return () -> str;
  }

  public static String useSupplier(Supplier<String> supplierObj) {
    return supplierObj.get();
  }

  public static void main(String[] args) {
    String str = "Higher Order Function using Supplier";

    //

    Supplier<String> supplierObj1 = () -> {
      return str;
    };
    System.out.println(useSupplier(supplierObj1));

    //
    //
    //

    Supplier<String> supplierObj2 = makeSupplier(str);
    System.out.println(useSupplier(supplierObj2));
  }
}
