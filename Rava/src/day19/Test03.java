package day19;
import java.io.*;
import javax.swing.*;

/*
 	예제3] FileOutputStream
 		
 */
public class Test03 {

	public Test03() {
		// 파일에 데이터를 저장하기 위해서는 파일로 연결되는 타겟스트림이 필요하다.
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("src/day19/etc/sample01.euns");
			// 이 경우 파일이 없어도 자동으로 파일을 만들어준다.
			// 파일이 존재한다면 기존 파일을 덮어쓰기한다.
			//1. 한글자만 입력해보기
//			out.write('9');
			
			//2. 한 문장 입력해보기
			String str = "자바로 코딩하는 것은 참으로 재밌어~";
			byte[] buff = str.getBytes();
			out.write(buff);
			JOptionPane.showMessageDialog(null, "저장완료");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				out.close();
				// 스트림은 열어두면 닫아주는것이 원칙이다
				// 외부장치에 연결을 하고 다 사용한 후에는 반드시 닫아주는 것이 원칙이다.
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
