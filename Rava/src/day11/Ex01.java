package day11;

import java.util.HashSet;
import java.util.Iterator;

/*
 	���� 3]
 		���� 1, 2������ ���� Ŭ������ ��ü�� ����
 		�� �������Լ��� �ùٸ��� �۵��ϴ��� �����ϼ���.
 */
public class Ex01 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(5);
		
//		c1.showAll();
//		c2.showAll();
		
		HashSet<Score> user = new HashSet<Score>();
		
		user.add(new Score()); 
		user.add(new Score("������",80, 30, 20, 40, 70, 80));
		
		Iterator<Score> itr = user.iterator();
		
		while(itr.hasNext()) {
			Score inst = null;
			inst = itr.next();
			inst.showAllScore();
		}
		
	}
}
