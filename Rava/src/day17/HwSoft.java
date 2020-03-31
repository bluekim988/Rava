package day17;

import java.util.*;
public class HwSoft implements Comparator {
	// 이미 정렬기준이 있는 클래스에 별도의 정렬기준으로 정렬을 하고자할 때
	// Comparator 인터페이스를 구현해서 정렬기준으로 사용할 클래스를 만들어주면 된다.
	// Comparator 는 compare() 를 추상함수로 가지고 있고
	// 구현을 하게되면 이 함수를 반드시 오버라이드 해야한다.
	// 정렬할 때 sort()가 호출되면 이 함수는 정렬기준으로 사용할 클래스의 compare()를
	// 자동 호출해서 정렬을 하게 된다.
	public HwSoft() {
	
	}

	@Override
	public int compare(Object o1, Object o2) {
		Sagak s1 = (Sagak) o1;
		Sagak s2 = (Sagak) o2;
		int result = (s1.getWidth() - s2.getWidth());
		// 0이면 바꾸지 않고
		// 음수이면 자리를 바꾸고
		return result;
	}

}
