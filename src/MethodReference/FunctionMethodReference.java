package MethodReference;

import java.util.function.Function;

public class FunctionMethodReference {

	public static void main(String[] args) {
		Function<String, String> functionLembda = s -> s.toUpperCase();
		Function<String, String> functionMethodRef=String::toUpperCase;
		System.out.println("Function using lembda:"+functionLembda.apply("Akanksha"));
		System.out.println("Function using MethodRef:"+functionMethodRef.apply("Akanksha"));
	}

}
