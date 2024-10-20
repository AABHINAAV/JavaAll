// handling predefined checked exception using try catch and throw

class Result {

  public static void main(String[] args) {
    try {
      int a = 10;
      int b = 0;
      int c = a / b;
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
