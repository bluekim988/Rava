package day04;

/*
 	while 명령
 		
 		for 명령문처럼 반복실행할 수 있는 명령문
 		for 명령문과의 차이점은 반복을 할 횟수를 지정하는 카운터 변수가 
 		명령내부에 없는것이 차이점이다.
 		

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
