package day19;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 	���Ͽ�
 		ģ���� ������ �����Ѵ�.
 		
 		����
 			�̸�		String
 			���� 		int
 			����		float
 			����		char
 			��ȭ		String
 			����		String
 			
 	��ó�� �ڹ��� ������ Ÿ���� �״�� ������ ���� �� �ִ� ��Ʈ����
 	DataInputStream / DataOutputStream   �̴�.
 	���� ������ �Է¼��� �°� �״�� �����ߵǰ�
 	�������� DataInputStream ���θ� ������ �Ѵ�.
 */
public class Test08 {

	public Test08() {
		FileOutputStream out = null;
		DataOutputStream dout = null;
		try {
			out = new FileOutputStream("src/day19/etc/dataStream_test.txt");
			dout = new DataOutputStream(out);
			
			dout.writeUTF("�����");
			dout.writeInt(16);
			dout.writeFloat(180.5f);
			dout.writeChar('M');
			dout.writeUTF("010-1231-2255");
			dout.writeUTF("aaa@increpas.com");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				out.close();
			} catch (Exception e2) {

			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
