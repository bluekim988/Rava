package day18;

import java.io.*;
import java.util.*;

public class Test02 {

	public Test02() {
		Properties prop = new Properties();
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day18/sample2_ko.properties");
			prop.load(fin);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("이름 : " + prop.get("name"));
		System.out.println("나이 : " + prop.get("age"));
		System.out.println("전화번호 : " + prop.get("tel"));
		System.out.println("주소 : " + prop.get("addr"));
	}

	public static void main(String[] args) {

		new Test02();
	}

}
