package day19;
import java.io.*;
import java.util.Arrays;

/*
 	예제2] FileInputStream
 		day19.etc 패키지에 있는 sample.txt 파일을 읽어보자.
 */
public class Test02 {

	public Test02() {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day19/etc/sample.txt");
			
			// 1. 한글자만 읽어보자.
//			int ch = fin.read();
//			System.out.println("읽은 문자 : " + (char)ch);
			
			//2. 여러글자를 읽어보자
			/*
			byte[] buff = new byte[1024]; //1KByte
			int len = fin.read(buff);
			// 문자열로 변환하고
			String str = new String(buff,0,len);
			System.out.println(str);
			*/
			
			//3. 문서 전체를 읽어보자.
			// 이 경우는 1KByte 만 읽을 것이다. 그러나 피일에는 그 이상의 데이터가 있을 수 있으니
			// 이 작업을 반복해서 처리한다.
			byte[] buff = new byte[1024];
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = fin.read(buff);
				if(len == -1) {
				// read함수는 더이상 읽을 데이터가 없으면 -1을 반환한다
					break;
				}
				String str = new String(buff, 0, len);
				System.out.print(str);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
