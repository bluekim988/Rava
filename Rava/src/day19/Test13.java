package day19;

import java.io.*;
import java.util.Arrays;

import javax.swing.*;

/*
 	day19/etc/poem.txt
 	������ �о��.
 	
 	FileInputStream ���� �а�
 	BufferedReader�� �����غ���.
 	
 	�̶� byte ũ�⿡�� char ũ��� �������ִ� ������Ʈ��
 	InputStreamReader / OutputStreamWriter
 	�� �̿�����
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
