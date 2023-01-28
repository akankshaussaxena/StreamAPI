package DefaultMethodsJAVA8;

import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {
		Multiplier multiplier = new MultiplierImpl();
		System.out.println(multiplier.multiply(List.of(1, 2, 3)));
		System.out.println(multiplier.size(List.of(1, 2, 3)));
		System.out.println(Multiplier.isEmpty(List.of(1, 2, 3)));

	}

}
