package Streams;

import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamAllmatchAnyMatchNoneMatchExmplsAsShortCircuit {

	public static boolean allMatch() {
		return StudentDataBase.getAllStudents().stream().allMatch(s -> s.getGpa() >= 3);
	}

	public static boolean anyMatch() {
		return StudentDataBase.getAllStudents().stream().anyMatch(s -> s.getGpa() >= 3);
	}

	public static boolean noneMatch() {
		return StudentDataBase.getAllStudents().stream().noneMatch(s -> s.getGpa() >= 3);
	}

	public static void main(String[] args) {
		System.out.println("All match is" + allMatch());
		System.out.println("any match is" + anyMatch());
		System.out.println("none match is" + noneMatch());
	}

}
