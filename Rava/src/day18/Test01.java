package day18;
import java.io.*;
import java.util.*;
public class Test01 {
/*
 	Sample.txt 파일을 읽어서 Map으로 저장해보자
 */
	public Test01() {
		//properties 변수 만들고
		Properties prop = new Properties();
		//외부 파일과 연결할 예정이다
		FileInputStream fin = null;	// 파일이 없는 경우는 예외가 발생할 것이다 때문에 예외처리를 항상 해주자
		try {
			fin = new FileInputStream("src/day18/sample_ko.txt");
//			BufferedReader in = new BufferedReader(new FileReader("src/day18/sample.txt"));
			// 경로는 절대 경로를 사용해서 우리가 현재 작업하는 폴더로 설정해도 무방하다.
			prop.load(fin);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//Properties파일은 ( = )을 기준으로 좌측이 키값, 우측이 데이터가 된다
		// key=StringData
		String name = (String)prop.get("name");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + prop.get("age"));
		System.out.println("전화번호 : " + prop.get("tel"));
		System.out.println("주소 : " + prop.get("addr"));
	}

	public static void main(String[] args) {
		new Test01();

	}

}
