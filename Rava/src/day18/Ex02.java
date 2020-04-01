package day18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;

/*
 	문제 2]
 		학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균
 		을 저장할 VO 클래스를 만들고
 		
 		5학생의 데이터를 입력해서 관리할 Set을 만들어서
 		이름 순으로 출력하세요.
 */

public class Ex02 {

	public Ex02() {
		HashSet<Test02_VO> voSet = new HashSet<Test02_VO>();
		String[][] strArr = { 		{"박광호", "반장님", "황스캇", "데이빗", "김펭수"},
									{"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-4444-4444", "010-5555-5555"},
									{"A", "A", "B", "C", "B"}	};
		
		Random random = new Random();
		for(int i=0; i<5; i++) {
			int no1 = random.nextInt(101);
			int no2 = random.nextInt(101);
			int no3 = random.nextInt(101);
			String name = strArr[0][i];
			String num = strArr[1][i];
			String cls = strArr[2][i];
			
			voSet.add(new Test02_VO(name, num, cls, no1, no2, no3));
		}
		
		ArrayList<Test02_VO> list = new ArrayList<Test02_VO>(voSet);
		
		Collections.sort(list, new Comparator<Test02_VO>() {

			@Override
			public int compare(Test02_VO o1, Test02_VO o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for(Test02_VO v : list) {
			System.out.println(v);
		}
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
