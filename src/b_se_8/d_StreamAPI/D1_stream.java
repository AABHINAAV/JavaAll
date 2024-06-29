package d_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D1_stream {

    public static void main(String[] args) {
    	// converting a collection into stream using stream method of that collection
        List<String> l = new ArrayList<>();
        l.add("abhinav");
        l.add("bhavya");
        Stream<String> s1 = l.stream();

        System.out.println(s1);
        s1.forEach(i -> {
            System.out.println(i);
        });

        //
        //
        //

        // converting an array into stream using static stream method of Arrays class
        int[] val = {1, 2, 3};
        IntStream s2 = Arrays.stream(val);

        System.out.println(s2);
        s2.forEach(i -> {
            System.out.println(i);
        });

        //
        //
        //

        Stream<String> s11 = (Stream)Arrays.stream(new String[]{"a", "b", "c", "d"});
        Stream<Integer> s21 = (Stream)Arrays.stream(new Integer[]{1,2,3,4});

        s11.forEach(
                i -> {
                    System.out.println(i);
                }
        );

        s21.forEach(
                i -> {
                    System.out.println(i);
                }
        );

        //
        //
        //

        IntStream s4 = Arrays.stream(new int[]{1, 2, 3, 4});

        System.out.println(s4);
        s4.forEach(i -> {
            System.out.println(i);
        });
    }
}
