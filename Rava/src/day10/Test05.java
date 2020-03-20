package day10;
/**
 *  이 클래스는 가변인수 테이스 클래스
 * @author	김종형
 * @since	2020.03.20
 * @version	v.1.0
 *
 */
public class Test05 {

	public Test05() {
		int cnt = getCnt("가나다라마다","정우승", "박광호");
		System.out.println(cnt);
	}
	// 이름들을 입력하면 인원수를 반환해주는 함수
	public int getCnt(String...name) {
		System.out.println(name[1]);
		return name[0].length();
	}
	public static void main(String[] args) {
		new Test05();

	}

}
