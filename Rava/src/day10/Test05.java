package day10;
/**
 *  �� Ŭ������ �����μ� ���̽� Ŭ����
 * @author	������
 * @since	2020.03.20
 * @version	v.1.0
 *
 */
public class Test05 {

	public Test05() {
		int cnt = getCnt("�����ٶ󸶴�","�����", "�ڱ�ȣ");
		System.out.println(cnt);
	}
	// �̸����� �Է��ϸ� �ο����� ��ȯ���ִ� �Լ�
	public int getCnt(String...name) {
		System.out.println(name[1]);
		return name[0].length();
	}
	public static void main(String[] args) {
		new Test05();

	}

}
