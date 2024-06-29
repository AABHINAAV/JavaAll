package d_StreamAPI;

import java.util.stream.IntStream;

public class D3_parallel_stream {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(i->{
			System.out.print(i+" ");
		});
		endTime = System.currentTimeMillis();
		System.out.println("\nsingle core time taken : "+(endTime - startTime));
		
		//
		
		startTime = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(i->{
			System.out.print(i+" ");
		});
		endTime = System.currentTimeMillis();
		System.out.println("\nmulticore time taken : "+(endTime - startTime));
		
		//
		//
		//
		System.out.println("\n\n\n");
		//
		//
		//
		
		IntStream.range(1, 10).forEach(i->{
			System.out.println(Thread.currentThread().getName() + " " + i);
		});
		
		System.out.println("\n");
		
		IntStream.range(1, 10).parallel().forEach(i->{
			System.out.println(Thread.currentThread().getName() + " " + i);
		});
	}

}
