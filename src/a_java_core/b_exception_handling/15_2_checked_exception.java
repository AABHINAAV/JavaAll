// handling predefined checked exception using try catch and throw and throws

class Result {

  void fun() throws Exception {
    throw new Exception("hello");
  }

  public static void main(String[] args) {
    Result obj = new Result();

    try {
      obj.fun();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
