package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test03 {

	public Test03() {
		ArrayList<Square> list = new ArrayList<Square>();
		
		for(int i=0; i<10; i++) {
			int no1 = (int)(Math.random() * 46 + 5);
			int no2 = (int)(Math.random() * 46 + 5);
			
			list.add(new Square(no1, no2));
		}
		
		System.out.println("------------기본------------");
		for(Square s : list) {
			System.out.println("넓이 "+s.getArea());
		}
		System.out.println("------------정렬------------");
		Collections.sort(list);
		for(Square s : list) {
			System.out.println("넓이 "+s.getArea());
		}
		System.out.println("------------무명클래스 ver------------");
		Collections.sort(list, new Comparator<Square>() {
			@Override
			public int compare(Square o1, Square o2) {
				
				return o1.getVer() - o2.getVer();
			}	
		});
		for(Square s : list) {
			System.out.println("세로 "+s.getVer());
		}
		
		System.out.println("------------람다 hor------------");
		list.sort((o1, o2) -> o1.getHor() - o2.getHor());
		for(Square s : list) {
			System.out.println("가로 " + s.getHor());
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
