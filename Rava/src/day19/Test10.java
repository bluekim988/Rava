package day19;

import java.io.*;
import javax.swing.*;

/*
 	문자 단위로 파일에 데이터를 저장하는 프로그램을 작성해보자
 */
public class Test10 {

	public Test10() {
		FileWriter fw = null;
		try {
			fw = new FileWriter("src/day19/etc/FileWriter_test.txt");
			
			/*
			// 1. 글자만(2바이트) 저장해보자
			char ch = '한';
			fw.write(ch);
			*/
			
			/*
			// 2. 문자열을 char[] 로 입력하자
			String str = "저는 항상 잘 됩니다.";
			char[] ch = str.toCharArray();
			fw.write(ch);
			*/
			
			// 3. 문자열자체로 입력하자
			String str = "스프링 프레임워크";
			fw.write(str);
			// char 단위 스트림은 텍스트 데이터만 처리하도록 되어있기 때문에
			// 기본 함수에 문자 처리 기능도 함께 추가되었다.
			
			JOptionPane.showMessageDialog(null, "저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
