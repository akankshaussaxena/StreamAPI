package DefaultMethodsJAVA8;

public class Client123 implements Interface1, Interface2, Interface3 {
	public void methodA() {
		System.out.println("Inside method A "+Client123.class);
	}
	
	//first pref for class which impl the method
	//2nd for sub interface that extends the interface
	//then only will go for self interface

	public static void main(String[] args) {
		Client123 client = new Client123();
		client.methodA();// will call from parent method 
		client.methodB();
		client.methodC();

	}

}
