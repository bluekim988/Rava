package day18;

import java.io.FileOutputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

import day08.EchaArray01;

public class Test03 {

	public Test03() {
		Properties prop = new Properties();
		
		prop.put("name", "김소영");
		prop.put("age", "30");
		prop.put("tel", "010-2222-2222");
		prop.put("addr", "서울시 신림동");
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/Pengsoon.txt");
			prop.store(fout, "####프랍파일####");
			JOptionPane.showMessageDialog(null, "저장완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
