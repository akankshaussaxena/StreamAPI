import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamRemoveDuplicateOrRepeat {

	public static void main(String[] args) {
		final List<Integer> list = List.of(8, 3, 100, 20, 4,4,4,5,5,5,100);
		List<Integer> ditint=list.stream().distinct().collect(Collectors.toList());
		System.out.println("using distint "+ditint);
		Set<Integer> set=list.stream().collect(Collectors.toSet());
		
		System.out.println("using set "+set);
	}

}
