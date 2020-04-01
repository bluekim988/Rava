package day16;

import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test02 {

	public Test02() {
		Calendar cal = Calendar.getInstance();
		String curTime = getStr(cal.getTime());
		JOptionPane.showMessageDialog(null, curTime);
	}
	
	// Date 타입의 데이터를 입력하면 형식에 맞도록 문자열로 반환해주는 함수
	public String getStr(Date d) {
		String result = "";
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 \n a hh시 mm분 ss초 \nM월 W주차입니다 \n화이팅~~~~~!");
		result = form.format(d);
		return result;
	}

	public static void main(String[] args) {
		new Test02();

	}

}
