package Excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 2, 33, 45, 45, 2, 0, 6, 7);
		
		String str="AKANKSHA";
		
		char str1[]=str.toCharArray();
		
		
	 char str2[]=new char[str1.length];
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str1[i]);
		}
		System.out.println();
		System.out.println(str1);
		Set<Integer> set = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
		System.out.println(set);
		//
		List<Integer> li = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list:" + li);
		
		List<Integer> sorted = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted list in reverse :" + sorted);
		// 2nd highest num
		int Secondmax=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second hightes number :" + Secondmax);
	
	}

}
