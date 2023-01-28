import java.util.List;
import java.util.stream.Collectors;

public class StreamJoiner {

	public static void main(String[] args) {
		List<String> str = List.of("Akku", "Basu", "Babu");
//imperative way
		String join = "";
		for (String name : str) {
			join += name + ", ";
		}
		System.out.println(join.substring(0, join.length() - 2));

		// using stream

		String collect = str.stream().map(String::toUpperCase).collect(Collectors.joining(","));
		System.out.println(collect);

	}

}
