// handling user defined checked exception using try catch and throw

class UserDefinedException extends Exception {

  UserDefinedException(String e) {
    super(e);
  }
}

class Result {

  public static void main(String[] args) {
    try {
      throw new UserDefinedException("user defined checked exception");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
