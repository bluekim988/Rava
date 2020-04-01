package day16.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test02  {

	public static void main(String[] args) {
		List<Integer> list = IntStream.range(0, 10).boxed().collect(Collectors.toList()); 
		System.out.println(list); 
		
		
		list.removeIf(integer -> integer % 2 == 0);
		System.out.println(list); 
		
		List<String> list2 = new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		
		list2.removeIf(string -> string.equals("A"));
		System.out.println(list2);

	}

}
