package day17;

import java.util.*;
import javax.swing.*;

public class Test08 {

	public Test08() {
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("이름", "큰손");
		table.put("tel", "010-1111-1111");
		table.put("직업", "건물주");
		table.put("부업", "재벌");

		// 데이터 꺼내기
		/*
		 * String key = JOptionPane.showInputDialog("알고싶은 정보를 입력하세요");
		 * 
		 * JOptionPane.showMessageDialog(null, table.get(key));
		 */
		// Map 계열은 키값을 알아야 데이터를 꺼낼수 있다

		Collection<String> con = table.values();

		Iterator<String> itr = con.iterator();

//		while (itr.hasNext()) {
//			JOptionPane.showMessageDialog(null, itr.next());
//		}

		Enumeration<String> en = table.keys();

		while (en.hasMoreElements()) {
			String key = en.nextElement();
			JOptionPane.showMessageDialog(null,key + " : " + table.get(key));
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
