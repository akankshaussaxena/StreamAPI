import java.util.DoubleSummaryStatistics;
import java.util.List;

public class StreamStatics {

	public static void main(String[] args) {
		List<People> ppl = List.of(new People("Akku", 28, "BUDAUN"), new People("Basu", 26, "BUDAUN"),
				new People("Babu", 20, "Agartala"), new People("Riyansh", 1, "NOIDA"));
//avg
		double avg = ppl.stream().mapToDouble(People::getAge).average().getAsDouble();
		System.out.println(avg);
//count
		long count = ppl.stream().count();
		System.out.println(count);

//max
		double max = ppl.stream().mapToDouble(People::getAge).max().getAsDouble();
		System.out.println(max);

//avg
		double min = ppl.stream().mapToDouble(People::getAge).min().getAsDouble();
		System.out.println(min);

//sum
		double sum = ppl.stream().mapToDouble(People::getAge).sum();
		System.out.println(sum);

//statistics

		DoubleSummaryStatistics summaryStatistics = ppl.stream().mapToDouble(People::getAge).summaryStatistics();

		System.out.println(summaryStatistics);
		System.out.println(summaryStatistics.getAverage());
		System.out.println(summaryStatistics.getCount());
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getSum());
	}

}
