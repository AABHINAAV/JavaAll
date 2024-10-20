// handling user defined runtime exception using try-catch and throw

class UserDefinedRuntimeException extends RuntimeException {

  UserDefinedRuntimeException(String e) {
    super(e);
  }
}

class Result {

  public static void main(String[] args) {
    try {
      throw new UserDefinedRuntimeException("hello");
    } catch (UserDefinedRuntimeException e) {
      e.printStackTrace();
    }
  }
}
