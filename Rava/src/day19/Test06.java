package day19;
/*
 	예제 6]
 		doc 폴더안의 파일의 목록을 알아내자.
 */
import java.io.*;
import javax.swing.*;

public class Test06 {

	public Test06() {
		// 1. 목록을 알아내고싶은 폴더를 파일로 만든다.
		File dir = new File("doc");
		
		/*
		String[] list = dir.list();
		
		for(int i = 0; i<list.length; i++) {
			String fname = list[i];
			System.out.println(fname);
		}
		*/
		
		/*
		File[] flist = dir.listFiles();
		for(int i=0; i<flist.length; i++) {
			File fileInfo = flist[i];
			String fileName = fileInfo.getName();	// 파일 이름 꺼내기
			long len = fileInfo.length();			// 파일 크기 꺼내기
			String folder = fileInfo.getParent();	// 폴더 꺼내기
			
			//출력하기
			System.out.println(fileName+" | "+ folder + " | " + len);
			
		}
		*/
		
		// 특정 폴더에 있는 파일 중에서 확장자가 txt인 파일만 골라서 출력해보자.
		// 이러한 경우에는 파일목록을 가져올 때 필터를 입력해줘야 하는데
		// 이 필터는 사용자의 목적에 따라서 조금씩 달라질 것이다.
		// 따라서 필터는 인터페이스로 제공을 해주고 있다.
		String[] fileList = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// 매개변수의 역할
				// File dir : 현재 파일의 정보를 알려준다.
				// String name : 현재 파일의 이름만 알려준다.
				// 이 함수는 자동 호출되는 함수이다.
				// 목록을 구하는 파일을 하나씩 발견할 때마다 이 함수가 호출된다.
				// 따라서 이 함수의 반환값이 true 이면 목록에 포함시키고
				// 반환값이 false 이면 목록에서 제외를 시킨다.
				
				return name.endsWith("txt");
			}
		});
		String str = "";
		int cnt = 0;
		for(String s : fileList) {
			str += s+"\r\n";
			cnt++;
		}
		JOptionPane.showMessageDialog(null, str);
		JOptionPane.showMessageDialog(null, "파일 수 : " + cnt);
		
	}
	public static void main(String[] args) {
		new Test06();
	}
}
