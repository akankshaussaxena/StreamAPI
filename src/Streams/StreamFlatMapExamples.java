package Streams;

import java.util.List;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamFlatMapExamples {
	
	public static List<String> printAllStudentActivities(){
		return StudentDataBase.getAllStudents().stream()//stream<Student>
		.map(Student::getActivities)//stream<List<String>>
		.flatMap(List::stream)//stream<String>
		.collect(Collectors.toList());//
	}

	public static void main(String[] args) {
		System.out.println("printAllStudentActivities: "+printAllStudentActivities());
	}

}
