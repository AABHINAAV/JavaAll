// handling user defined runtime exception using try-catch and throw and throws

class UserDefinedRuntimeException extends RuntimeException {

  UserDefinedRuntimeException(String e) {
    super(e);
  }
}

class Result {

  public static void fun() throws UserDefinedException {
    throw new UserDefinedRuntimeException("hello");
  }

  public static void main(String[] args) {
    try {
      fun();
    } catch (UserDefinedRuntimeException e) {
      e.printStackTrace();
    }
  }
}
