package day19;

import java.io.*;
import javax.swing.*;

/*
 	��ҿ��� ���޷� ���� �����غ���.
 */
public class Test09 {

	public Test09() {
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day19/etc/poem.txt");
			// ����] �� ��Ʈ���� ������Ʈ���̴�. ������ ���������� �⺻ ��Ʈ���� �����Ǿ��־� 
			//���� ��ġ�� �����Ͽ� ����Ѵ�.
			ps.println("*** ���޷� �� ***");
			ps.println("				�� �� ��");
			ps.println();
			ps.println("�����Ⱑ ���ܿ� ���Ƕ�����");
			ps.println("������ ���� ���� �帮���̴�.");
			ps.println();
			ps.println("����...");
			ps.println();
			
			ps.flush();
			// ���������� Buffer�� ����� ������ �ִ�
			JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				// close() �Լ��� ���������� flush() ����� ���� �ϰ� �ִ�.
				// ���� close() �Լ��� ȣ��Ǹ� �ڵ������� flush()�� ȣ��ȴ�.
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test09();

	}

}
