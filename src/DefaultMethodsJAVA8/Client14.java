package DefaultMethodsJAVA8;

public class Client14 implements Interface1, Interface4 {

	// if 2 interface having same method signature then this will cause compilation
	// issue in impl class so need to override the method in impl class then this
	// will be resolved

	public static void main(String[] args) {
		Client14 client = new Client14();
		client.methodA();

	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		Interface1.super.methodA();
	}

}
