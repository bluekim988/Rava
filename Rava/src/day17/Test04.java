package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class Test04 {

	public Test04() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("진로");
		list.add("큰손");
		list.add("회장");
		list.add("반장");
		list.add("광호");
		System.out.println("---------일반출력-----------");
		for(String s : list) {
			System.out.println(s);
		}

		System.out.println("---------오름차순-----------");
		Collections.sort(list);
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("---------내림차순-----------");
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int result = o2.compareTo(o1);
				return result;
			}
		});
		for(String s : list) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test04();
		
	}

}
