package b_java_se_8.d_stream_api;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class h_reusing_stream {

  public static Stream<String> getStream(String[] strArr) {
    return Stream.of(strArr);
  }

  public static void main(String[] args) {
    String[] strarr = { "apple", "banana", "cat", "dog" };

    // Stream<String> stream = Arrays.stream(strarr);
    // stream.forEach(e -> System.out.println(e));
    // long count = stream.filter(e -> e.equals("apple")).count();
    // // will throw error: stream has already been operated upon or closed
    // System.out.println(count);

    //
    //
    //

    // solution : create a method which will give you stream
    getStream(strarr).forEach(e -> System.out.println(e));
    getStream(strarr).forEach(e -> System.out.println(e));

    //
    //
    //

    // solution : make a supplier which will provide the stream again and again
    Supplier<Stream<String>> supplierObj = () -> {
      return Stream.of(strarr);
    };
    // every call to it creates and returns a stream

    supplierObj.get().forEach(e -> System.out.println(e));
    supplierObj.get().filter(e -> e.equals("apple")).count();
  }
}
