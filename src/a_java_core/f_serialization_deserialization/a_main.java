package f_serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

public class a_main {

  public static void serializationProcess() {
    Student student = new Student("Alice", 20);
    try (
      ObjectOutputStream oos = new ObjectOutputStream(
        new FileOutputStream("student.ser")
      )
    ) {
      oos.writeObject(student);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void deserializationProcess() {
    try (
      ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("student.ser")
      )
    ) {
      Student student = (Student) ois.readObject();
      System.out.println("Deserialized Student: " + student);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
