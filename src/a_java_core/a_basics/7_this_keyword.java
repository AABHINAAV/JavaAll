class Result {

  int x = 10;

  Result() {
    System.out.println("constuctor called");
  }

  Result(String str) {
    this();
    System.out.println(str);
  }

  void display() {
    System.out.println("hello");
  }

  void fun(int x) {
    System.out.println(x);
    System.out.println(this.x);
    display();
    this.display();
  }

  public static void main(String[] args) {
    Result obj1 = new Result();
    obj1.fun(20);

    Result obj2 = new Result("hello");
  }
}
