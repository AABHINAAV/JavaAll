class Parent {

  int x = 10;
}

class Result extends Parent {

  int a = 10;
  static int b = 20;

  void dummy_nonStaticMethod() {}

  static void dummy_staticMethod() {}

  void fun1() {
    System.out.println(a);
    System.out.println(Result.b);

    dummy_nonStaticMethod();
    dummy_staticMethod();

    System.out.println(this.a);
    System.out.println(super.x);
  }

  static void fun2() {
    // System.out.println(a);
    // static cannot access non-static class variable
    System.out.println(Result.b);

    // dummy_nonStaticMethod();
    // it cannot access non-static method
    dummy_staticMethod();
    Result.dummy_staticMethod();
    // System.out.println(this.a);
    // cannot use this keyword

    // System.out.println(super.x);
    // cannot use super keyword
  }
}
