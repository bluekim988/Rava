package day04;

/*
 	while ���
 		
 		for ��ɹ�ó�� �ݺ������� �� �ִ� ��ɹ�
 		for ��ɹ����� �������� �ݺ��� �� Ƚ���� �����ϴ� ī���� ������ 
 		��ɳ��ο� ���°��� �������̴�.
 		

 */
class Gogodan {
	int dan = 2;
	public Gogodan() {
		while(dan<10) {
			int gop = 1;
			while(gop<10) {
				System.out.println(dan+"x"+gop+"="+dan*gop);
				gop++;
			}
			dan++;
		}
	}
}
public class Test05 {
	public static void main(String[] args) {
		new Gogodan();
	}

}
