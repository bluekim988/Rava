package day19;

import java.io.*;
import javax.swing.*;

/*
 	김소월의 진달래 꽃을 저장해보자.
 */
public class Test09 {

	public Test09() {
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day19/etc/poem.txt");
			// 참고] 이 스트림은 보조스트림이다. 하지만 내부적으로 기본 스트림이 구성되어있어 
			//직접 장치에 연결하여 사용한다.
			ps.println("*** 진달래 꽃 ***");
			ps.println("				김 소 월");
			ps.println();
			ps.println("나보기가 역겨워 가실때에는");
			ps.println("말없이 고이 보내 드리오이다.");
			ps.println();
			ps.println("생략...");
			ps.println();
			
			ps.flush();
			// 내부적으로 Buffer의 기능을 가지고 있다
			JOptionPane.showMessageDialog(null, "저장 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				// close() 함수는 내부적으로 flush() 기능을 포함 하고 있다.
				// 따라서 close() 함수가 호출되면 자동적으로 flush()도 호출된다.
			} catch (Exception e2) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test09();

	}

}
