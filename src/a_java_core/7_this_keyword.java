class Result {

  int x = 10;

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
    Result obj = new Result();
    obj.fun(20);
  }
}
