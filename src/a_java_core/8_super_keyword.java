class ClassA {

  int x = 10;

  ClassA() {
    System.out.println("Class A constructor");
  }

  void fun() {
    System.out.println("Class A method");
  }
}

class Result extends ClassA {

  Result() {
    System.out.println("Class Result constructor");
  }

  Result(String str) {
    super();
    System.out.println(str);
  }

  void fun() {
    System.out.println(super.x);
    super.fun();
  }

  public static void main(String[] args) {
    Result obj = new Result();
    obj.fun();

    Result obj2 = new Result("hello");
  }
}
