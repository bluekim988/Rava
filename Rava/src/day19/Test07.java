package day19;

import java.io.*;
import javax.swing.*;

/*
 	내용을 파일에 저장하는 프로그램을 작성하세요.
 	단, 보조스트림 Bufferd 스트림을 사용하세요.
 */

public class Test07 {

	public Test07() {
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		
		try {
			out = new FileOutputStream("src/day19/etc/buffer_test.txt");
			bout = new BufferedOutputStream(out);
			
			String str = "버퍼스트림을 테스트 합니다.";
			byte[] buff = str.getBytes();
			bout.write(buff);
			// 버퍼가 가득 차기 전 버퍼의 내용을 강제로 꺼내기
			// 버퍼드 스트림을 사용할 경우 습관적으로 flush()를 실행하자
			bout.flush();
			JOptionPane.showMessageDialog(null, "저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test07();

	}

}
