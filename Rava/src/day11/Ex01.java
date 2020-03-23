package day11;

import java.util.HashSet;
import java.util.Iterator;

/*
 	문제 3]
 		문제 1, 2번에서 만든 클래스를 객체로 만들어서
 		각 생성자함수가 올바르게 작동하는지 실행하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		
//		c1.showAll();
//		c2.showAll();
		
		HashSet<Score> user = new HashSet<Score>();
		
		user.add(new Score()); 
		user.add(new Score("김종형",80, 30, 20, 40, 70, 80));
		
		Iterator<Score> itr = user.iterator();
		
		while(itr.hasNext()) {
			Score inst = null;
			inst = itr.next();
			inst.showAllScore();
		}
		
	}
}
