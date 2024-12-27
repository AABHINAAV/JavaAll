@FunctionalInterface
interface MyFunctionalInterface1 {
  void fun1();

  default void defaultConcreteMethod() {}

  static void staticConcreteMethod() {}

  private void privateConcreteMethod() {}
}

class MyClass1 implements MyFunctionalInterface1 {

  @Override
  public void fun1() {
    // body
  }
}

//
//
//
//
//
@FunctionalInterface
interface MyFunctionalInterface2 {
  int fun(int a, int b);
}

class MyClass2 {

  public static void main(String[] args) {
    MyFunctionalInterface1 obj1 = new MyFunctionalInterface1() {
      @Override
      public void fun1() {
        System.out.println("hello");
      }
    };
    obj1.fun1();

    MyFunctionalInterface1 obj2 = () -> {
      System.out.println("hello");
    };
    obj2.fun1();

    MyFunctionalInterface2 obj3 = new MyFunctionalInterface2() {
      @Override
      public int fun(int a, int b) {
        return a + b;
      }
    };
    System.out.println(obj3.fun(10, 20));

    MyFunctionalInterface2 obj4 = (int a, int b) -> {
      int res = a + b;
      return res;
    };
    System.out.println(obj4.fun(10, 20));
  }
}

//
//
//
//
//
interface SavingData {}

class SaveDataInLocal implements SavingData {}

class SaveDataInAzure implements SavingData {}
