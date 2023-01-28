package ParallelStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxingExamples {
	
	

	public static void main(String[] args) {
List<Integer> integers=IntStream.rangeClosed(1, 1000).boxed().collect(Collectors.toList());
	seqSum(integers);
	parallelSum(integers);
	
	}

	private static int parallelSum(List<Integer> integers) {
		long start=System.currentTimeMillis();
		int sum=integers.parallelStream().reduce(0,(a,b)->a+b);
		long duration=System.currentTimeMillis()-start;
		System.out.println("parallelSum duration: "+duration);
		return sum;
	}

	private static int seqSum(List<Integer> integers) {
		long start=System.currentTimeMillis();
		int sum=integers.stream().reduce(0,(a,b)->a+b);
		long duration=System.currentTimeMillis()-start;
		System.out.println("seqSum duration: "+duration);
		return sum;
	}
}
