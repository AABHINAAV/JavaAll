interface InterfaceA {
  public default void display() {
    System.out.println("default method of InterfaceA");
  }
}

interface InterfaceB {
  public default void display() {
    System.out.println("default method of InterfaceB");
  }
}

class Result implements InterfaceA, InterfaceB {

  @Override
  public void display() {
    InterfaceA.super.display();
    InterfaceB.super.display();
    // but this will call both of them together
  }

  public void call_InterfaceA_Display() {
    InterfaceA.super.display();
  }

  public void call_InterfaceB_Display() {
    InterfaceB.super.display();
  }

  public static void main(String[] args) {
    Result result = new Result();
    result.display();

    // InterfaceA.super.display();
    // InterfaceB.super.display();
    // cannot use super in static constext

    result.call_InterfaceA_Display();
    result.call_InterfaceB_Display();
  }
}
