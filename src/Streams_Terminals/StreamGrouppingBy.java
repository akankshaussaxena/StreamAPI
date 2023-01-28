package Streams_Terminals;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class StreamGrouppingBy {
	
	public static void getStudentByGender() {
		Map<String,List<Student> >studentByGender=StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
		//System.out.println(studentByGender);
		Set<String> keys=studentByGender.keySet();
		for(String key:keys) {
		System.out.println(key+"="+studentByGender.get(key));
		}
	}
	
	public static void getCustomizeStudentByGPA() {
		Map<String,List<Student> >studentByGender=StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(student->student.getGpa()>=3.9?"OUTSTANDING":"AVERAGE"));
		//System.out.println(studentByGender);
		Set<String> keys=studentByGender.keySet();
		for(String key:keys) {
		System.out.println(key+"="+studentByGender.get(key));
		}
	}

	public static void groupingBy_level2() {
		Map<String,Map<String,List<Student>> >studentByGender=StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender,Collectors.groupingBy(s->s.getGpa()>=3?"OutStanding":"Average")));
		System.out.println("groupingBy_level2 "+studentByGender);
		
	}
	
	public static void groupingBy_level3() {
		Map<String,Integer >studentByGender=StudentDataBase.getAllStudents().stream().
				collect(Collectors.groupingBy(Student::getGender,Collectors.summingInt(Student::getNoteooks)));//1->key,2nd for output Type,3->output value
		System.out.println("groupingBy_level3 "+studentByGender);
		
	}
	public static void groupingByThreeParameters() {
		LinkedHashMap<String, Set<Student>> studentByName=StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));
		studentByName.keySet().forEach(s->System.out.println(s+"="+studentByName.get(s)));
	}
	public static void main(String[] args) {
		getStudentByGender();
		getCustomizeStudentByGPA();
		groupingBy_level2();
		groupingBy_level3();
		groupingByThreeParameters();
	}

}
