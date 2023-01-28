package Streams_Terminals;

import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamSummingIntAndAvgInt {

	public static int summingInt() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student:: getNoteooks));
	}
	
	public static double avgInt() {
		return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student:: getNoteooks));
	}
	public static void main(String[] args) {
		System.out.println("summingInt: "+summingInt());
		System.out.println("avgInt: "+avgInt());

	}

}
