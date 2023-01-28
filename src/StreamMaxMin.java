import java.util.Comparator;
import java.util.List;

public class StreamMaxMin {

	public static void main(String[] args) {
		final List<Integer> list = List.of(8, 3, 100, 20, 4);
		final List<String> str = List.of("AKKU", "BABU");
		//min 
		System.out.println("MIN : "+list.stream().min(Comparator.naturalOrder()).get());
		//max
		System.out.println("MAX : "+str.stream().max(Comparator.naturalOrder()).get());
		System.out.println("MIN : "+str.stream().min(Comparator.naturalOrder()).get());
	}

}
