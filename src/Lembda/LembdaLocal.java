package Lembda;

import java.util.function.Consumer;

public class LembdaLocal {

	static int  i3=4;
	public static void main(String[] args) {
		int i = 0;
		Consumer<Integer> c = (i1) -> System.out.println(i);// local variable aleardy define so can not used in lembda

		Consumer<Integer> c1 = (i1) -> {
			// i++;//compilation issue
			i3++;
			System.out.println(i+i1+i3);
		};

		c1.accept(1);
	}

}
