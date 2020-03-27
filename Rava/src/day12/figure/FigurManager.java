package day12.figure;
/*
 ���� 3]
	Figure Ŭ������ �����ϰ�
	��ӹ޾Ƽ� �ﰢ��, �簢��, ���� Ŭ������ ������ ��
	
	1 ~ 3 ������ ������ �����ϰ� 10�� ����
	1�� ��� �ﰢ��
	2�� ��� �簢��
	3�� ��� ��
	�� �迭�� �־��
	
	����ϼ���.
 */
public class FigurManager {

	public static void main(String[] args) {
		Figure[] fig = new Figure[10];
		
		for(int i=0; i<fig.length; i++) {
			int no = randomScore();
			
			if(no == 1) {
				fig[i] = new Triangle(randomScore() * no, randomScore() * no);
			} else if(no == 2) {
				fig[i] = new Square(randomScore() * no, randomScore() * no);
			} else if(no == 3) {
				fig[i] = new Circle(randomScore() * no);
			}
		}
		
		for(Figure f : fig) {
			f.toPrint();
		}
	}
	
	public static int randomScore() {
		return (int)(Math.random() * 3) + 1;
	}
}
