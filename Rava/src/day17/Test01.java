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
		System.out.println("-------------�⺻-------------------");
		
		for(Sagak s : list) {
			System.out.println(s.getArea());
		}
		
		// ���� �� ArrayList�� �����غ���
		// �����ϴ� ����� Collections Ŭ������ �Ҽӵ� sort()�Լ��� ȣ���ϸ� ���� ���������� �� ���̴�.
	
		System.out.println("---------------compareTo----------------");
		Collections.sort(list);
		for(Sagak s : list) {
			System.out.println(s.getArea());
		}
		
		System.out.println("--------------����------------------");
		list.sort((o1, o2) -> o1.getWidth() - o2.getWidth());
		for(Sagak s : list) {
			System.out.println(s.getWidth());
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
