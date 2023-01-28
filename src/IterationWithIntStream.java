import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IterationWithIntStream {

	public static void main(String[] args) {
		
		List<People> ppl=new ArrayList<>();
		ppl.add(new People("Akku",28,"BUDAUN"));
		ppl.add(new People("BASU",26,"BUDAUN"));
		ppl.add(new People("BABU",20,"AGARTALA"));
		IntStream.range(0, ppl.size()).forEach(e->{
			System.out.println(ppl.get(e));
			});
		//error as it will add 3 also a index which is no more availabe as index start from o 
		/*
		 * IntStream.rangeClosed(0, ppl.size()).forEach(e->{
		 * System.out.println(ppl.get(e)); });
		 */
		System.out.println("Imperative");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("Exclusive");
		IntStream.range(0, 10).forEach(i -> System.out.println(i));
		System.out.println("Inclusive");
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
		
		//iterate
		System.out.println("Even number through iterator");
		IntStream.iterate(0, operand->operand+1).filter(value->value%2==0).limit(10).forEach(System.out::println);
		
		

	}

}
