package b_java_se_8.f_String.a_string;

public class a {

  public static void main(String[] args) {
    final String s = new String("\nhello world");

    // s = new String("bye world");
    // The final local variable s cannot be assigned.
    // It must be blank and not using a compound assignment

    s.concat(" abcd"); // not altering the value | creating and returing new string
    // this is immutability
    System.out.println(s);

    String s2 = s.concat(" abcd");
    System.out.println(s2);
  }
}
