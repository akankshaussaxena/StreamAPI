package FunctionalInterfaceExamples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import FunctionalInterfaceExamples.Data.Student;
import FunctionalInterfaceExamples.Data.StudentDataBase;

public class FunctionExample {

	static List<Student> students=StudentDataBase.getAllStudents();
	static Function<List<Student>, Map<String,Double>> f=s->{
		Map<String,Double> map=new HashMap<>();
		s.forEach(s1->{
			if(PredicateStudentExample.s.test(s1))
		map.put(s1.getName(), s1.getGpa());
			//}
		 
		});
		 return map;
	};
	
	public static void getStudent() {
		
	}
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toLowerCase();
		Function<String, String> f2 = s -> s.toUpperCase().concat("default");
		System.out.println("Function :"+f1.apply("Akku"));
		System.out.println("Function with andThen :"+f1.andThen(f2).apply("Akku"));//function chaining
		System.out.println("Function with compose :"+f1.compose(f2).apply("Akku"));
		System.out.println("Function :"+f.apply(students));
		
		
	}

}
