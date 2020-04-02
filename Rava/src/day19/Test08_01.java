package day19;

import java.io.DataInputStream;
import java.io.FileInputStream;
/*
 	저장한 친구의 정보를 읽어오자
 */
public class Test08_01 {

	public Test08_01() {
		FileInputStream in = null;
		DataInputStream din = null;
		try {
			in = new FileInputStream("src/day19/etc/dataStream_test.txt");
			din = new DataInputStream(in);
			
			String name = din.readUTF();
			int age = din.readInt();
			float key = din.readFloat();
			char gen = din.readChar();
			String num = din.readUTF();
			String mail = din.readUTF();
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(key);
			System.out.println(gen);
			System.out.println(num);
			System.out.println(mail);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
				in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		new Test08_01();

	}

}
