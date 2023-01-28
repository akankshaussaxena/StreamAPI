package ParallelStreams;

import java.util.stream.IntStream;

public class SumClient {

	public static void main(String[] args) {
		Sum sum = new Sum();
		// IntStream.rangeClosed(1, 1000).forEach(sum::getSum);
		// for this kind of case parallel wont be used as that will give us wrong result
		IntStream.rangeClosed(1, 1000).parallel().forEach(sum::getSum);
		System.out.println(sum.getValue());

	}

}
