package day19;

import java.io.*;
import java.util.Arrays;

import javax.swing.*;

/*
 	day19/etc/poem.txt
 	파일을 읽어보자.
 	
 	FileInputStream 으로 읽고
 	BufferedReader를 연결해보자.
 	
 	이때 byte 크기에서 char 크기로 연결해주는 보조스트림
 	InputStreamReader / OutputStreamWriter
 	을 이용하자
 */
public class Test13 {

	public Test13() {
		FileInputStream in = null;
		InputStreamReader isr = null;
		BufferedReader bin = null;
		
		try {
			in = new FileInputStream("src/day19/etc/poem.txt");
			isr = new InputStreamReader(in);
			bin = new BufferedReader(isr);
			
			StringBuffer buff = new StringBuffer();
			while(true) {
				String str = bin.readLine();
				if(str == null) {
					break;
				}
				buff.append(str + "\r\n");
			}
			
			JOptionPane.showMessageDialog(null, buff.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bin.close();
				isr.close();
				in.close();
			} catch (Exception e2) {

			}
		}
	}

	public static void main(String[] args) {
		new Test13();

	}

}
