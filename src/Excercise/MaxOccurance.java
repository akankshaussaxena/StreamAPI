package Excercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxOccurance {

	public static void main(String[] args) {
		List<Integer> integrs = Arrays.asList(1, 2, 3, 4, 4, 4, 5, 56, 4, 7);
		int maxNext = 0;
		Map<Integer, Long> mapping = integrs.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mapping);
		Set<Integer> keys = mapping.keySet();
		System.out.println(keys);
		Long max = mapping.get(0);
		for (int i = 1; i < keys.size(); i++) {
			

			if (max < mapping.get(i)) {
				max = mapping.get(i);
				maxNext = i + 1;

			}

		}
		System.out.println("Output is:" + maxNext);

	}

}
