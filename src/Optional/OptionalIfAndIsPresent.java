package Optional;

import java.util.Optional;

public class OptionalIfAndIsPresent {

	public static void main(String[] args) {
//isPresent()
		//ifPresent()
		Optional<String> data=Optional.ofNullable("Hello");
		System.out.println("isPresent: "+data.isPresent());
		if(data.isPresent()) {
			System.out.println(data.get());
		}
		
		data.ifPresent(s->System.out.println(s));
		
	}

}
