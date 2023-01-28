package DefaultMethodsJAVA8;

import java.util.List;

public interface Multiplier {
	int multiply(List<Integer> studentList);
	
	default boolean size(List<Integer> studentList) {
		System.out.println("Inside Multiplier interface ");
		return studentList!=null && studentList.size()>0;
	}
	
	static boolean isEmpty(List<Integer> studentList) {
		return studentList.size()==0;
	}

}
