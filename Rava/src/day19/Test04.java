package day19;
import java.io.*;
import java.util.Arrays;

import javax.swing.*;

/*
 	예제 4]
 		파일을 복사해보자.
 */
public class Test04 {

	public Test04() {
		//기본 스트림 두개를 준비한다.
		FileInputStream in = null; // 원본
		FileOutputStream out = null; //복사본
		
		try {
			// 기본 스트림 두개를 연다.
			in = new FileInputStream("src/day19/Test04.java");
			out = new FileOutputStream("src/day19/Test04_01.java");
			// 몇번 읽어야 할지 몰라 읽을 작업을 반복한다
			byte[] buff = new byte[1024];
			String str = "";
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = in.read(buff);
				if(len == -1) {
					break;
				}
				str += new String(buff, 0, len);
			}
			// 문자열을 다시 배열로 바꿔 파일에 저장하자
			byte[] obuff = str.getBytes();
			out.write(obuff);
			JOptionPane.showMessageDialog(null, "파일 복사 완료");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				out.close();
				in.close();
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test04();

	}

}
