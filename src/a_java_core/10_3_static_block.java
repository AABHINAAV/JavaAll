class Config {

  static int configValue;

  // Static block to initialize static variable
  static {
    configValue = 100;
    System.out.println("Static block executed. Config value: " + configValue);
  }
}

class Main {

  public static void main(String[] args) {
    // Static block is executed when the class is loaded, even before creating any object
    System.out.println("Main method started.");
  }
}
