package b_java_se_8.b_lambda_expression;

@FunctionalInterface
interface Interface1 {
  void display();
}

@FunctionalInterface
interface Interface2 {
  void display(int a);
}

@FunctionalInterface
interface Interface3 {
  void display(int a, int b);
}

class LambdaExpression {

  public static void main(String[] args) {
    Interface1 obj11 = new Interface1() {
      @Override
      public void display() {
        System.out.println("interface 1 by anonymous inner class");
      }
    };
    obj11.display();

    Interface1 obj12 = () ->
      System.out.println("interface 1 by lambda expression");
    obj12.display();

    ///////////////////////////////////////////////////////

    Interface2 obj21 = new Interface2() {
      @Override
      public void display(int a) {
        System.out.println("interface 2 by anonymous inner class : " + a);
      }
    };
    obj21.display(10);

    Interface2 obj22 = a ->
      System.out.println("interface 2 by lambda expression : " + a);
    obj22.display(20);

    ///////////////////////////////////////////////////////

    Interface3 obj31 = new Interface3() {
      @Override
      public void display(int a, int b) {
        System.out.println(
          "interface 3 by anonymous inner class : " + a + " : " + b
        );
      }
    };
    obj31.display(100, 200);

    Interface3 obj32 = (a, b) ->
      System.out.println("interface 3 by lambda expression : " + a + " : " + b);
    obj32.display(300, 400);
  }
}
