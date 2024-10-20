package b_java_se_8.a_Annotations;

import java.util.ArrayList;
import java.util.List;

class A3_SupressWarnings {

  @SuppressWarnings("unused")
  public void method1() {
    List<String> lst = new ArrayList<>();   // variable not used
  }

  @SuppressWarnings("unchecked")
  public void method2() {
    Object list = List.of("a", "b");
    List<Integer> actualList = (List<Integer>) list;    // unchecked cast from Object to List<Integer>
    System.out.println(actualList);
  }

  @Deprecated
  public void deprecatedMethod() {}

  @SuppressWarnings("deprecation")
  public void method3() {
    this.deprecatedMethod();    // earlier method name was showing with strike through
  }

  @SuppressWarnings({ "unchecked", "unused" })
  public void method4() {
    Object list = List.of("a", "b");
    List<Integer> actualList = (List<Integer>) list;    // unchecked cast from Object to List<Integer>
    System.out.println(actualList);

    List<String> lst = new ArrayList<>();   // variable not used
  }

  @SuppressWarnings("all")
  public void method5() {}
}
