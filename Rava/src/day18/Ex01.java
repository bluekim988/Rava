package day18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Ex01 {
/*
 	���� 1] 
 		1 Ex01.txt �� ����� �����͸� Properties�� ���
 		2 Ű���� ��� ������
 		3 �����͸� �����ϰ� 
 		4 ������ �����ּ���.
 		5 �޼���â�� ����� ������ ������ּ���.
 */
	public Ex01() {
		Properties prop = new Properties();
		FileInputStream in = null;
		Set fset = null;
		try {
			in = new FileInputStream("src/day18/Ex01.txt");
			prop.load(in);
			fset = prop.keySet();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (Exception e2) {
				
			}
		}
		
		int sum = 0;
		
//		ArrayList<String> list = new ArrayList<String>(fset);
		
		
		Iterator<String> itr = fset.iterator();
		while(itr.hasNext()) {
			String inst = itr.next();
			sum += Integer.parseInt((String)prop.get(inst));
			System.out.println(inst + " : " + prop.get(inst));			
		}
		System.out.println("sum" + " : " + sum);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
