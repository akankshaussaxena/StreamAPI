import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {

	public static void main(String[] args) {
		List<List<String>> arrayListOfNames = Arrays.asList(
				Arrays.asList("Mariam", "Alex", "Ismail"),
				Arrays.asList("John", "Alesha", "Andre"),
				Arrays.asList("Susy", "Ali")
			    );
		System.out.println(arrayListOfNames);
		
		List<String> stringData=arrayListOfNames.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(stringData);
	}

}
