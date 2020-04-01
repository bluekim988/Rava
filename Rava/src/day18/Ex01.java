package day18;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Ex01 {
/*
 	문제 1] 
 		1 Ex01.txt 에 저장된 데이터를 Properties에 담고
 		2 키값을 모두 꺼내서
 		3 데이터를 추출하고 
 		4 총점을 구해주세요.
 		5 메세지창을 띄워서 총점을 출력해주세요.
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
