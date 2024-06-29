package d_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D5_creation_methods {
	
	public void using_parallel_Method() {
		List<Integer> list = new ArrayList<>();
		
		List<Integer> res = list
							.stream()
							.parallel()
							.sorted()
							.collect(Collectors.toList());
	}
	
	public void using_parallelStream_Method() {
		List<Integer> list = new ArrayList<>();
		
		List<Integer> res = list
							.parallelStream()
							.sorted()
							.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
	}
}
