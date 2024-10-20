abstract class Animal {

  public String name; // Instance variable
  public static int count = 0; // Static variable

  // Constructor
  Animal(String name) {
    this.name = name;
    count++; // Increment count for each instance
  }

  // Abstract method
  abstract void sound();

  // Concrete method
  void display() {
    System.out.println("Animal Name: " + name);
  }
}

class Dog extends Animal {

  Dog(String name) {
    super(name); // Call constructor of Animal
  }

  @Override
  void sound() {
    System.out.println("name : " + name + "sound : Bark");
  }
}

class Result {

  public static void main(String[] args) {
    Dog dog1 = new Dog("Buddy");
    dog1.display(); // Outputs: Animal Name: Buddy
    dog1.sound(); // Outputs: Bark

    Dog dog2 = new Dog("Max");
    System.out.println("Total Animals: " + Animal.count); // Outputs: Total Animals: 2
  }
}
