package a_java_core.d_String.b_StringBuffer;

public class a {

  public static void main(String[] args) {
    final StringBuilder s1 = new StringBuilder("hello world");

    // s1 = new StringBuilder("bey world");
    // The final local variable s cannot be assigned.
    // It must be blank and not using a compound assignment

    s1.append(" java"); // altering the value
    // so string buffer is mutable
    System.out.println(s1);
  }
}
