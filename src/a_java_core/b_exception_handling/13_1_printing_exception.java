class Result {

  public static void main(String[] args) {
    try {
      int a = 10;
      int b = 0;
      int c = a / b;
      System.out.println(c);
    } 
    // catch(Exception e) {
    catch (ArithmeticException e) {
      e.printStackTrace();
      // name // description // stack trace

      System.out.println("");
      System.out.println(e);
      System.out.println(e.toString());
      // name // description

      System.out.println("");
      System.out.println(e.getMessage());
      // description
    }
  }
}
