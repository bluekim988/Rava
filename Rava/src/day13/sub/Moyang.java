package day13.sub;

public interface Moyang {
	double pi = 3.14;
	// 변수도 가질 수 있다.
	// 이때 변수는 자동적으로 public static final 변수가 된다.
	// 따라서 만들때 초기화가 이루어져야 한다.
	
	
	void setArea();
	// 인터페이스는 추상함수만 가질 수 있다.
	// 그리고 소속함수는 자동적으로 public abstract 가 붙게 된다.
	
	void toPring();
	
	/*
	default void abc() {
		// default 명령을 통해 함수를 구현할 수 있다.
	}
	*/
}
