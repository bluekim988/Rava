package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test05 {
// �����ϰ� ���� 10���� ���� �÷��ǿ� ��� �������. ��, �ߺ��� ���ڴ� ���ܽ�Ų��.
	public Test05() {
		HashSet<Integer> set = new HashSet<Integer>();
		Random rnd = new Random();
		
		while(true) {
			if(set.size() == 10) {
				break;
			}
			int no = rnd.nextInt(45) + 1;
			set.add(no);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for(Integer i : list) {
			System.out.println(i.intValue());
		}
		System.out.println("-----------Itr------------");
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next().intValue());
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Test05();
	}

}
