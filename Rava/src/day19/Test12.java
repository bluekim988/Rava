package day19;

import java.io.*;
import java.text.FieldPosition;

import javax.swing.*;

/*
 	Test11.java 파일을 읽어보자.
 */
public class Test12 {

	public Test12() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			String msg = "";
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				msg += str + "\r\n";
			}
			JOptionPane.showMessageDialog(null, msg);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			
			}
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
