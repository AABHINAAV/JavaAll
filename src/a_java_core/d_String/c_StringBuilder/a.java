package a_java_core.d_String.c_StringBuilder;

public class a {

  public static void main(String[] args) {
    final StringBuffer s1 = new StringBuffer("hello world");

    // s1 = new StringBuffer("bey world");
    // The final local variable s cannot be assigned.
    // It must be blank and not using a compound assignment

    s1.append(" java"); // altering the value
    // so string buffer is mutable
    System.out.println(s1);
  }
}
