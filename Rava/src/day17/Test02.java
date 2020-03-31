package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test02 {

	public Test02() {
		ArrayList<Samgak> list = new ArrayList<Samgak>();
		
		for(int i=0; i<10; i++) {
			int no1 = (int)(Math.random() * 16 + 5);
			int no2 = (int)(Math.random() * 16 + 5);
			list.add(new Samgak(no1, no2));
		}
		
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getArea());
		}
		System.out.println("----------------------");
		
		// ������ �غ���. ���� ����Ʈ�� �ԷµǾ��ִ� ��ü�� ���� ũ�⸦ ���� �� ���� �����̹Ƿ�
		// ���ڸ� ���� �Է����ְ� ���غ���.
		Collections.sort(list, new HwSort01());
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getArea());
		}
		
		// �̹����� ���̸� �������� �������������� �غ���
		
		System.out.println("����----------------------");
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return (((Samgak)o2).getHeight() - ((Samgak)o1).getHeight());
			}
		});
		for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i).getHeight());
		}
	}

	public static void main(String[] args) {
		new Test02();

	}

}
