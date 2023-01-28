import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

public class StreamFindAnyFindFirst {
	final static IntPredicate predicate = e -> e > 3 && e < 10;

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 50, 67, 2, 1 };
//find any for unsatble or undeterministics->every time not getting same result
		int i = Arrays.stream(array).filter(predicate).findAny().getAsInt();
		System.out.println(i);
		//find first for stble or deterministics->every time  getting same result
		int j = Arrays.stream(array).filter(predicate).findFirst().getAsInt();
		System.out.println(j);

	}

}
