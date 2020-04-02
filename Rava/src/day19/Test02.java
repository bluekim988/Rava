package day19;
import java.io.*;
import java.util.Arrays;

/*
 	����2] FileInputStream
 		day19.etc ��Ű���� �ִ� sample.txt ������ �о��.
 */
public class Test02 {

	public Test02() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day19/etc/sample.txt");
			
			// 1. �ѱ��ڸ� �о��.
//			int ch = fin.read();
//			System.out.println("���� ���� : " + (char)ch);
			
			//2. �������ڸ� �о��
			/*
			byte[] buff = new byte[1024]; //1KByte
			int len = fin.read(buff);
			// ���ڿ��� ��ȯ�ϰ�
			String str = new String(buff,0,len);
			System.out.println(str);
			*/
			
			//3. ���� ��ü�� �о��.
			// �� ���� 1KByte �� ���� ���̴�. �׷��� ���Ͽ��� �� �̻��� �����Ͱ� ���� �� ������
			// �� �۾��� �ݺ��ؼ� ó���Ѵ�.
			byte[] buff = new byte[1024];
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = fin.read(buff);
				if(len == -1) {
				// read�Լ��� ���̻� ���� �����Ͱ� ������ -1�� ��ȯ�Ѵ�
					break;
				}
				String str = new String(buff, 0, len);
				System.out.print(str);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
