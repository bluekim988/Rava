package day18;
import java.io.*;
import java.util.*;
public class Test01 {
/*
 	Sample.txt ������ �о Map���� �����غ���
 */
	public Test01() {
		//properties ���� �����
		Properties prop = new Properties();
		//�ܺ� ���ϰ� ������ �����̴�
		FileInputStream fin = null;	// ������ ���� ���� ���ܰ� �߻��� ���̴� ������ ����ó���� �׻� ������
		try {
			fin = new FileInputStream("src/day18/sample_ko.txt");
//			BufferedReader in = new BufferedReader(new FileReader("src/day18/sample.txt"));
			// ��δ� ���� ��θ� ����ؼ� �츮�� ���� �۾��ϴ� ������ �����ص� �����ϴ�.
			prop.load(fin);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//Properties������ ( = )�� �������� ������ Ű��, ������ �����Ͱ� �ȴ�
		// key=StringData
		String name = (String)prop.get("name");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + prop.get("age"));
		System.out.println("��ȭ��ȣ : " + prop.get("tel"));
		System.out.println("�ּ� : " + prop.get("addr"));
	}

	public static void main(String[] args) {
		new Test01();

	}

}
