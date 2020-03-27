package day12.figure;
/*
 문제 3]
	Figure 클래스를 정의하고
	상속받아서 삼각형, 사각형, 원의 클래스를 정의한 후
	
	1 ~ 3 까지의 정수를 랜덤하게 10개 만들어서
	1의 경우 삼각형
	2의 경우 사각형
	3의 경우 원
	을 배열에 넣어고
	
	출력하세요.
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
