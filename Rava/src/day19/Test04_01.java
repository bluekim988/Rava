package day19;
import java.io.*;
import java.util.Arrays;

import javax.swing.*;

/*
 	예제 4]
 		파일을 복사해보자.
 */
public class Test04_01 {

	public Test04_01() {
		//기본 스트림 두개를 준비한다.
		FileInputStream in = null; // 원본
		FileOutputStream out = null; //복사본
		
		try {
			// 기본 스트림 두개를 연다.
			in = new FileInputStream("src/day19/etc/sample.txt");
			out = new FileOutputStream("src/day19/etc/sample_clone.txt");
			// 몇번 읽어야 할지 몰라 읽을 작업을 반복한다
			byte[] buff = new byte[1024];
		
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = in.read(buff);
				if(len == -1) {
					break;
				}
				out.write(buff,0,len);
			}
		
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
		new Test04_01();

	}

}
