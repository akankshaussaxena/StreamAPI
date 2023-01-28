package DefaultMethodsJAVA8;

public interface Interface3 extends Interface2{
	default void methodC() {
		System.out.println("Inside method C "+Interface3.class);
	}
	default void methodB() {
		System.out.println("Inside method B "+Interface3.class);
	}
}
