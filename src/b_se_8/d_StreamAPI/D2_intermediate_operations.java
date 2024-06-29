package d_StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D2_intermediate_operations {
	
	public void learnForEachMethod() {
		System.out.println("\nfor each method :-");
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		stream.forEach(val->System.out.println(val));
	}
	
	public void learnMapMethod() {
		System.out.println("\n map method :-");
		Stream<Integer> stream = Stream.of(1,2,3,4,5);
		Stream<Integer> res = stream.map(val->val*2);
		res.forEach(i->System.out.println(i));
	}
	
	public void learnFilterMethod() {
		Stream<Integer> stream = Stream.of(1,2,3,4);
		Stream<Integer> res = stream.filter(i->i%2==0);
		res.forEach(i->System.out.println(i));
	}
	
	public void learnSortedMethod() {
		Stream<Integer> stream = Stream.of(100,20,3,43);
		Stream<Integer> res = stream.sorted();
		res.forEach(i->System.out.println(i));
	}
	
	public void learnCollectMethod() {
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
		List<Integer> res = stream
							.sorted()
							.filter(i->i>3)
							.map(i->i*2)
							.collect(Collectors.toList());
		System.out.println(res);
	}

	public static void main(String[] args) {
		D2_intermediate_operations obj = new D2_intermediate_operations();
		
		obj.learnForEachMethod();
		
		obj.learnMapMethod();
		
		obj.learnFilterMethod();
		
		obj.learnSortedMethod();
		
		obj.learnCollectMethod();
	}	

}
