package b_java_se_8.f_String.b_StringBuffer;

public class b {

  public static void main(String[] args) {
    // Creating a StringBuffer object
    StringBuffer sb = new StringBuffer("Hello");

    // Appending text to the StringBuffer
    sb.append(" World!");
    System.out.println(sb); // Output: Hello World!

    // Inserting text at a specific position
    sb.insert(5, ",");
    System.out.println(sb); // Output: Hello, World!

    // Deleting part of the text
    sb.delete(5, 7); // Deletes ", "
    System.out.println(sb); // Output: HelloWorld!

    // Reversing the string
    sb.reverse();
    System.out.println(sb); // Output: !dlroWolleH

    // Replacing part of the string
    sb.replace(0, 2, "Hi");
    System.out.println(sb); // Output: Hi dlroWolleH
  }
}
