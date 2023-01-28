package Streams;

import java.util.Optional;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamFindFirstAnyExamplesAsShortCircuit {
	
	public static Optional<Student> findAnyStudent(){
		return StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=3).findAny();
	}
	
	public static Optional<Student> findFirstStudent(){
		return StudentDataBase.getAllStudents().stream().filter(s->s.getGpa()>=3).findFirst();
	}

	public static void main(String[] args) {
		Optional<Student> findAny=findAnyStudent();
		if(findAny.isPresent()) {
			System.out.println("findAnyStudent "+findAny.get());
		}else {
			System.out.println("Student not found!");
		}
		
		Optional<Student> findFirst=findFirstStudent();
		if(findFirst.isPresent()) {
			System.out.println("findFirst "+findFirst.get());
		}else {
			System.out.println("Student not found!");
		}

	}

}
