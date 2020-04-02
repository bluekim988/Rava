package day19;
/*
 	Friend 에 데이터를 채운뒤 파일로 저장하자
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
			
			String name = "우디";
			String tel = "010-1212-7979";
			String mail = "woody@Disney.com";
			int age = 10;
			float height = 130.2f;
			char gen = 'M';
			
			Friend f1 = new Friend(name, tel, mail, age, height, gen);
			
			obc.writeObject(f1);
			
			JOptionPane.showMessageDialog(null, "친구 저장 완료  :) ");
			
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
