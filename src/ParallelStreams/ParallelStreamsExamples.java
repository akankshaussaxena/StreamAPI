package ParallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamsExamples {

	public static long checkPerformance(Supplier<Integer> supplier, int value) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < value; i++) {
			supplier.get();
		}

		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	public static int sequentialStreamExample() {
		return IntStream.rangeClosed(1, 100000).sum();
	}
	public static int parallelStreamExample() {

		return IntStream.rangeClosed(1, 100000).parallel().sum();
	}
	
	 public static int sumSequentialStream(){

	        return IntStream.rangeClosed(1,100000)
	                .sum();
	    }

	    public static int sumParallelStream(){

	        return IntStream.rangeClosed(1,100000)
	                .parallel()
	                .sum();
	    }
	
	 public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes){

	        long startTime = System.currentTimeMillis();
	        for(int i=0;i<numberOfTimes;i++){
	            supplier.get();
	        }
	        long endTime = System.currentTimeMillis();
	        return endTime-startTime;
	    }


	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().totalMemory()+" free "+Runtime.getRuntime().freeMemory());
		System.out.println("sequentialStreamExample : " + sequentialStreamExample());
		System.out.println("parallelStreamExample : " + parallelStreamExample());

		System.out.println(
				"sequentialStreamExample : " + checkPerformanceResult(ParallelStreamsExamples::sumSequentialStream, 50));

		System.out.println(
				"parallelStreamExample : " + checkPerformanceResult(ParallelStreamsExamples::sumParallelStream, 50));

	}
	

	

}
