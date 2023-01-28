package Streams;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamMapANDConcurrentMapExamples {
	
	public static List<String> namesList(){
		 List<String> studentList=StudentDataBase.getAllStudents().stream()//Stream<Student>
		.map(Student::getName)//Stream<String>
		.map(String::toUpperCase)//Stream<String> with upper case operation
		.collect(Collectors.toList());//List<String>
		 
		 return studentList;
	}
	
	public static Set<String> namesSet(){
		 Set<String> studentList=StudentDataBase.getAllStudents().stream()//Stream<Student>
		.map(Student::getName)//Stream<String>
		.map(String::toUpperCase)//Stream<String> with upper case operation
		.collect(Collectors.toSet());//Set<String>
		 
		 return studentList;
	}

	public static void main(String[] args) {
		
		//ConcurrentMap<String, List<String>> collect = StudentDataBase.getAllStudents().stream().collect(Collectors.toConcurrentMap(Student::getName, Student::getActivities));
		ConcurrentMap<String, String> collect2 = StudentDataBase.getAllStudents().stream().collect(Collectors.toConcurrentMap(Student::getName, Student::getGender, (s,s2)->s+","+s2));// using both value for same key
		ConcurrentMap<String, String> collect1 = StudentDataBase.getAllStudents().stream().collect(Collectors.toConcurrentMap(Student::getName, Student::getGender, (s,s2)->s));//using first value for same key
		//this we can use if in case keys which we have map is duplicate than we can use merge function to rectify the values for same
		//ConcurrentMap<String, String> collect1 = StudentDataBase.getAllStudents().stream().collect(Collectors.toConcurrentMap(Student::getName, Student::getGender));
		
		//System.out.println(collect);
		System.out.println(collect1);
		System.out.println(collect2);
		System.out.println(namesList());
		System.out.println(namesSet());
	}

}
