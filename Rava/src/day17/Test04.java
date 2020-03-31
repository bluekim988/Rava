package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public class Test04 {

	public Test04() {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("����");
		list.add("ū��");
		list.add("ȸ��");
		list.add("����");
		list.add("��ȣ");
		System.out.println("---------�Ϲ����-----------");
		for(String s : list) {
			System.out.println(s);
		}

		System.out.println("---------��������-----------");
		Collections.sort(list);
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("---------��������-----------");
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
