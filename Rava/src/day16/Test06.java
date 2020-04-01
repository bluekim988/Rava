package day16;

import java.text.*;

/*
 	MessageFormat
 		db 질의 명령을 제작하는데 사용해 보자.
 */
public class Test06 {

	public Test06() {
		String sql = "INSERT INTO emp VALUES(1234,'홍길동','010-1111-1111',24) ";
		
		MessageFormat form = new MessageFormat("INSERT INTO emp VALUES({0},{1},{2},{3}) ");
		
		Object[] result = null;
		
		try {
			result = form.parse(sql);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		new Test06();

	}

}
