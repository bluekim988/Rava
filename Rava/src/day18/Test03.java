package day18;

import java.io.FileOutputStream;
import java.util.Properties;

import javax.swing.JOptionPane;

import day08.EchaArray01;

public class Test03 {

	public Test03() {
		Properties prop = new Properties();
		
		prop.put("name", "��ҿ�");
		prop.put("age", "30");
		prop.put("tel", "010-2222-2222");
		prop.put("addr", "����� �Ÿ���");
		
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/Pengsoon.txt");
			prop.store(fout, "####��������####");
			JOptionPane.showMessageDialog(null, "����Ϸ�");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
