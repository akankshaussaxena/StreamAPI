package DefaultMethodsJAVA8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

	public static void main(String[] args) {
		// sort list
		List<String> stringList = Arrays.asList("Basu", "Shruti", "Akku", "Noopur", "Babu");
//sorting prior java8
		Collections.sort(stringList);
		System.out.println("sort using before java 8 collection.sor" + stringList);

		// sorting after java8
		stringList.sort(Comparator.naturalOrder());
		System.out.println("sort using after java 8 list.sort" + stringList);

	}

}
