package day19;

import java.io.*;
import javax.swing.*;

/*
 	Test10에서 만든 문서를 읽어보자.
 */
public class Test11 {

	public Test11() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/day19/etc/FileWriter_test.txt");
			
			/*
			// 1. 한글자 읽기
			int ch = fr.read();
			System.out.println((char)ch);
			*/
			
			// 2. 여러글자 읽어보기
			char[] buff = new char[1024];
			int len = fr.read(buff);
			
			String str = new String(buff, 0, len);
			System.out.println(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {

			}
		}
	}

	public static void main(String[] args) {
		new Test11();

	}

}
