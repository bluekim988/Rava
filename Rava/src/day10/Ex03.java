package day10;

/*
 ���� 3]
	�л��� �̸�, ����, ����, ����, ����, �ڵ� ������ ������ �����ϰ�
	����, ����� ����ؼ� �Է��� Ŭ������ �����ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� ���� ó���ϼ���.
	�׸��� 5���� �л��� �迭�� ���� ���� ����, �̸��� �Է��ؼ� 
	����ϼ���. 
 */
public class Ex03 {

	public static void main(String[] args) {
		Cls2[] clsArr = new Cls2[5];
		
		clsArr[0] = new Cls2("�����");
		clsArr[1] = new Cls2("ȸ���");
		clsArr[2] = new Cls2("�����");
		clsArr[3] = new Cls2("��ı");
		clsArr[4] = new Cls2("ŷ");
		
		for(int i=0; i<clsArr.length; i++) {
			clsArr[i].setVal();
		}
		
		for(Cls2 i : clsArr) {
			i.showVal();
		}

	}

}
