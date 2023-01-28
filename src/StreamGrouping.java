import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGrouping {

	public static void main(String[] args) {
		List<People> ppl = List.of(new People("Akku", 28, "BUDAUN"), new People("Basu", 26, "BUDAUN"),
				new People("Babu", 20, "Agartala"), new People("Riyansh", 1, "NOIDA"));

		// grouping
		Map<Integer, List<People>> collect = ppl.stream().collect(Collectors.groupingBy(People::getAge));
		collect.forEach((age, people) -> {
			System.out.println(age);
			System.out.println(people);
		});
		
		//grouping
		List<String> list=List.of("Akku","Akku","Basu","Basu","Basu","Babu");
		//find repetation by group by
		Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		collect2.forEach((name,count)->System.out.println(name+"="+count));
	}

}
