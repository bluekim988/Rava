package day17;

import java.util.ArrayList;
import java.util.Collections;

public class Test01 {

	public Test01() {
		ArrayList<Sagak> list = new ArrayList<Sagak>();
		for(int i=0; i<10; i++) {
			int num1 = (int)(Math.random() * 16) +5;
			int num2 = (int)(Math.random() * 16) +5;
			
			list.add(new Sagak(num1, num2));
			
		}
		System.out.println("-------------기본-------------------");
		
		for(Sagak s : list) {
			System.out.println(s.getArea());
		}
		
		// 이제 이 ArrayList를 정렬해보자
		// 정렬하는 방법은 Collections 클래스가 소속된 sort()함수를 호출하면 오름 차순정렬이 될 것이다.
	
		System.out.println("---------------compareTo----------------");
		Collections.sort(list);
		for(Sagak s : list) {
			System.out.println(s.getArea());
		}
		
		System.out.println("--------------람다------------------");
		list.sort((o1, o2) -> o1.getWidth() - o2.getWidth());
		for(Sagak s : list) {
			System.out.println(s.getWidth());
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
