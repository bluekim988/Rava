package day10;

/*
 문제 3]
	학생의 이름, 국어, 영어, 수학, 물리, 코딩 과목의 점수를 저장하고
	총점, 평균을 계산해서 입력할 클래스를 제작하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 만들어서 처리하세요.
	그리고 5명의 학생을 배열로 만들어서 과목 점수, 이름을 입력해서 
	출력하세요. 
 */
public class Ex03 {

	public static void main(String[] args) {
		Cls2[] clsArr = new Cls2[5];
		
		clsArr[0] = new Cls2("반장님");
		clsArr[1] = new Cls2("회장님");
		clsArr[2] = new Cls2("팀장님");
		clsArr[3] = new Cls2("스캇");
		clsArr[4] = new Cls2("킹");
		
		for(int i=0; i<clsArr.length; i++) {
			clsArr[i].setVal();
		}
		
		for(Cls2 i : clsArr) {
			i.showVal();
		}

	}

}
