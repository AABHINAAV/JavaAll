// handling user defined checked exception using try catch and throw and throws

class UserDefinedException extends Exception {

  UserDefinedException(String e) {
    super(e);
  }
}

class Result {

  public static void fun() throws UserDefinedException {
    throw new UserDefinedException("user defined checked exception");
  }

  public static void main(String[] args) {
    try {
      fun();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
