package day17;
import java.util.*;
public class Test07 {
/*
 	예제]
 		랜덤한 숫자를 10개를 발생하고
 		그 숫자를 학생의 성적이라고 가정한다.
 		이중에 80 ~ 100 사이의 점수만 따로 뽑아서 관리하고자 한다.
 		단, 중복 점수는 없는 것으로 한다.
 */
	public Test07() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random rnd = new Random();
		for(int i=0; i<10; i++) {
			set.add(rnd.nextInt(101));
		}
		
		TreeSet<Integer> tmpSet = (TreeSet<Integer>)set.subSet(80, 100);
		
		ArrayList<Integer> list = new ArrayList<Integer>(tmpSet);
		
		for(int s : list) {
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		new Test07();

	}

}
