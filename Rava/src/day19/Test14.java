package day19;
/*
 	Friend �� �����͸� ä��� ���Ϸ� ��������
 */

import java.io.*;
import javax.swing.*;

public class Test14 {

	public Test14() {
		FileOutputStream out = null;
		ObjectOutputStream obc = null;
		
		try {
			out = new FileOutputStream("src/day19/etc/FriendObject.txt");
			obc = new ObjectOutputStream(out);
			
			String name = "���";
			String tel = "010-1212-7979";
			String mail = "woody@Disney.com";
			int age = 10;
			float height = 130.2f;
			char gen = 'M';
			
			Friend f1 = new Friend(name, tel, mail, age, height, gen);
			
			obc.writeObject(f1);
			
			JOptionPane.showMessageDialog(null, "ģ�� ���� �Ϸ�  :) ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				obc.close();
				out.close();
			} catch (Exception e2) {

			}
		}
	}

	public static void main(String[] args) {
		new Test14();

	}

}
