import java.util.Arrays;

public class StreamReduce {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int sum = Arrays.stream(array).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		int sum2 = Arrays.stream(array).reduce(0, Integer::sum);
		System.out.println(sum2);
	}

}
