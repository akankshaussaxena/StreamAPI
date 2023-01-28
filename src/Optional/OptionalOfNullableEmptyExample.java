package Optional;

import java.util.Optional;

public class OptionalOfNullableEmptyExample {
	
	public static Optional<String> optionalOf(){
		//Optional<String> str=Optional.ofNullable("Hello");
		Optional<String> str=Optional.ofNullable(null);
		return str;
	}
	
	public static Optional<String> Of(){
		Optional<String> str=Optional.of("Hello");//of not allowed in Optional of method
		return str;
	}
	
	public static Optional<String> empty(){
		Optional<String> str=Optional.empty();
		return str;
	}

	public static void main(String[] args) {
		System.out.println("of nullable: "+optionalOf());
		System.out.println("empty: "+empty());
		System.out.println("of : "+Of());
	}

}
