package day10;
 /*
 문제 1]
	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서
	각 멤버를 초기화하고
	출력하세요. 
	
 */

public class Ex01 {
	Circle[] arr01 = new Circle[10];
	
	public static void main(String[] args) {
		Ex01 ex1 = new Ex01();
		
		for(int i=0; i<ex1.arr01.length; i++) {
			int no = (int)(Math.random() * (30))+1;
			ex1.arr01[i] = new Circle(no);
		}
		
		for(Circle a : ex1.arr01) {
			a.showVal();
			System.out.println();
		}

	}

}
