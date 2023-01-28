package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVSStream {

	public static void main(String[] args) {
		ArrayList<String> collections = new ArrayList<>();
		collections.add("Akku");
		collections.add("Basu");
		collections.add("Babu");
		collections.remove(0);
		System.out.println(collections);
		//in collection we can add and modify
		
		for(String name:collections) {
			System.out.println(name);
		}
		
		for(String name:collections) {
			System.out.println(name);
		}
		//in collection we can iterate same stream many times
		Stream<String> streams=collections.stream();
		streams.forEach(System.out::println);
		//we can not use same stream to iterate as it a internal process
		//streams.forEach(System.out::println);
		//stream we can not add modify delete
		

	}

}
