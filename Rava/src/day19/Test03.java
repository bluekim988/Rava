package day19;
import java.io.*;
import javax.swing.*;

/*
 	����3] FileOutputStream
 		
 */
public class Test03 {

	public Test03() {
		// ���Ͽ� �����͸� �����ϱ� ���ؼ��� ���Ϸ� ����Ǵ� Ÿ�ٽ�Ʈ���� �ʿ��ϴ�.
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("src/day19/etc/sample01.euns");
			// �� ��� ������ ��� �ڵ����� ������ ������ش�.
			// ������ �����Ѵٸ� ���� ������ ������Ѵ�.
			//1. �ѱ��ڸ� �Է��غ���
//			out.write('9');
			
			//2. �� ���� �Է��غ���
			String str = "�ڹٷ� �ڵ��ϴ� ���� ������ ��վ�~";
			byte[] buff = str.getBytes();
			out.write(buff);
			JOptionPane.showMessageDialog(null, "����Ϸ�");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				out.close();
				// ��Ʈ���� ����θ� �ݾ��ִ°��� ��Ģ�̴�
				// �ܺ���ġ�� ������ �ϰ� �� ����� �Ŀ��� �ݵ�� �ݾ��ִ� ���� ��Ģ�̴�.
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
