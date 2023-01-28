package NumericStream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeAnRangeClosedExamples {

	public static void main(String[] args) {

		System.out.println("IntStream Range count: "+IntStream.range(1, 20).count());
		System.out.println("IntStream RangeClosed count: "+IntStream.rangeClosed(1, 20).count());
	
		System.out.println("LongStream Range count: "+LongStream.range(1, 20).count());
		System.out.println("LongStream RangeClosed count: "+LongStream.rangeClosed(1, 20).count());
		//not having these method
		//System.out.println("DoubleStream RangeClosed count: "+DoubleStream.rangeClosed(1, 20).count());
	
		System.out.println("LongStream Range count: "+LongStream.range(1, 20).asDoubleStream().count());
		LongStream.range(1, 20).asDoubleStream().forEach(value->System.out.print(value+","));
	
	}

}
