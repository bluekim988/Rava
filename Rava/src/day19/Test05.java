package day19;
import java.io.*;
import javax.swing.*;

/*
 	예제 5]
 		1. day19/etc 에 폴더하나를 강제로 만든다.
 			day19/etc/snue
 		2. 경로상에 없는 폴더까지 한꺼번에 만든다
 			day19/etc/zzz/abc
 			
 		3. 만들어진 파일중 하나를 삭제한다.
 			(폴더 도 삭제 가능, 파일도 삭제 가능)
 			
 		4. 특정 파일의 이름을 다른 이름으로 변경하자.
 */
public class Test05 {

	public Test05() {
		// 만들고 싶은 폴더(없어도 상관 없다) 파일클래스로 만들어보기
		// 1
//		File file = new File("src/day19/etc/snue");
//		file.mkdir();
		
		// 2
		/*
		File file = new File("src/day19/etc/zzz/abc");
		boolean bool = file.mkdirs();
		if(bool == true) {
			JOptionPane.showMessageDialog(null, "생성완료");
		}
		*/
		
		// 3
		/*
		File file = new File("src/day19/etc/zzz/abc");
		file.delete();
		*/
		
		// 4
		File ofile = new File("src/day19/etc/sample.txt");
		File nfile = new File("src/day19/etc/sample.increpas");
		ofile.renameTo(nfile);
		
	}

	public static void main(String[] args) {
		new Test05();

	}

}
