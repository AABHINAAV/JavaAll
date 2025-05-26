package g_try_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class a {

  public static void main(String[] args) {
    try (
      BufferedReader br = new BufferedReader(new FileReader("file.txt"));
      PrintWriter writer = new PrintWriter("output.txt")
    ) {
      // Use both resources
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
