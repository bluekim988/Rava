package day11;
/*
 	���� ]
 		�� Ŭ������ ��ӹ��� Ŭ������ ������ �ϴµ�
 		��, �簢��, �ﰢ�� Ŭ������ ���弼��.
 */
public class Dohyung {
	double area;
	
	public Dohyung(int rad) {
		area = rad * rad * 3.14;
	}
	
	public Dohyung(int tri_base, int tri_height) {
		area = tri_base * tri_height * 0.5;
	}
	
	public Dohyung(double squ_base, double squ_height) {
		area = squ_base * squ_height;
	}
	
	public void showAll() {
		System.out.printf("���� : %.2f \n", area);
		System.out.println("------------------");
	}
}
