class Result {

  String name;
  int age;
  static String school = "St. Mary's School"; // will remain same for all objects
  static int totalStudents = 0; // gets memory once only

  Result(String name, int age) {
    this.name = name;
    this.age = age;
    totalStudents++;
  }

  void display() {
    System.out.println(name);
    System.out.println(age);
    System.out.println(school);
  }

  public static void main(String[] args) {
    Result s1 = new Result("Abhinav", 24);
    Result s2 = new Result("Nandini", 18);

    s1.display();
    System.out.println("total Students " + totalStudents);
    s2.display();
    System.out.println("total Students " + totalStudents);
  }
}
