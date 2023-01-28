import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		List<People> people = List.of(new People("Akku", 28, "BUDAUN"), new People("Basu", 26, "BUDAUN"),
				new People("Babu", 20, "Agartala"), new People("Riyansh", 1, "NOIDA"));

		List<People> peopl=people.stream().filter(ppl->ppl.getAge()<18).collect(Collectors.toList());
		peopl.forEach(System.out::println);
		
		//MAP (change from people  to peopleDTO(dataype changes)
		
		people.stream().map(PeopleDTO:: map).forEach(System.out::println);
		//calculate avg age
		System.out.println(people.stream().mapToDouble(People::getAge).average());
	}

}
