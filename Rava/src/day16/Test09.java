package day16;

import java.util.*;
public class Test09 {

	public Test09() {
		/*
		ArrayList list = new ArrayList();
		
		list.add("��ö");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		*/
		HashSet list = new HashSet();
		list.add("5");
		list.add("4");
		list.add("1");
		list.add("4");
		list.add("4");
		
		System.out.println(list.size());
		/*
		System.out.println("--------String------------");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
		System.out.println();
		*/
		System.out.println("------Iterator----------");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			String str = (String)itr.next();
			System.out.print(str + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test09();

	}

}
