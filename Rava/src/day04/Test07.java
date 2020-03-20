package day04;

/*
 	label이 붙은 for 명령
 		: 반복문이 중첩이 될 경우
 			내부의 반복문에서 조건에 따라서 바깥 반복문을 제어해야 될 경우가 생긴다.
 			이때 해당 반복문을 제어해줄용도로 쓰이는 반복문
 			
 	*****
 	주의 ]
 		라벨에 의한 처리는 직속관계에 한해서만 적용된다.
 */

public class Test07 {

	public static void main(String[] args) {
		//구구단을 출력하는데 3단의 5곱 이상은 출력되지 말고 건너 뛰게 하세요.
		t1:
		for(int dan=2; dan<=9; dan++) {
			for(int gop=1; gop<=9; gop++) {
				if(dan == 3 && gop>=5) {
					continue t1;
				}
				System.out.println(dan+ "x" + gop+ "=" + dan*gop);
			}
		}
	}

}
