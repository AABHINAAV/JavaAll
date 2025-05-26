package b_java_se_8.b_lambda_expression;

abstract class Class1 {

  public void method1() {}

  public void method2() {}

  public void method3() {}
}

public class B_anonymous_class {

  interface Interface1 {
    public void method1();

    public void method2();
  }

  public static void main(String[] args) {
    Interface1 interface1Obj = new Interface1() {
      @Override
      public void method1() {
        System.out.println("method1 of interface1");
      }

      @Override
      public void method2() {
        System.out.println("method2 of interface2");
      }
    };

    interface1Obj.method1();
    interface1Obj.method2();

    Class1 class1Obj = new Class1() {
      @Override
      public void method1() {
        System.out.println("method1 of class1");
      }

      @Override
      public void method3() {
        System.out.println("method3 of class1");
      }
    };

    class1Obj.method1();
    class1Obj.method2();
    class1Obj.method3();
  }
}
