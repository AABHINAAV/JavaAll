// handling predefined runtime exception using try-catch and throw
class Result {

  public static void main(String[] args) {
    try {
      throw new RuntimeException("hello");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}