package day19;

import java.io.*;
import javax.swing.*;

public class Test14_01 {

	public Test14_01() {
		FileInputStream in = null;
		ObjectInputStream oin = null;
		
		try {
			in = new FileInputStream("src/day19/etc/FriendObject.txt");
			oin = new ObjectInputStream(in);
			
			Friend fr = (Friend)oin.readObject();
			
			JOptionPane.showMessageDialog(null, fr.getName() + "\n" +
			fr.getAge() + "\n" + fr.getMail());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				in.close();
			} catch (Exception e2) {

			}
		}
	}

	public static void main(String[] args) {
		new Test14_01();
	}

}
