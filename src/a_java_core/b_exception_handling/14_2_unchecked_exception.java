// handling predefined runtime exception using try-catch and throw and throws
class Result {

  public static void fun() throws RuntimeException {
    throw new RuntimeException("hello");
  }

  public static void main(String[] args) {
    try {
      fun();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
