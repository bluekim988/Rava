package day16.hw;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat form = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");
		cal.clear(cal.DATE);
		
		
		
		
		String str = form.format(cal.getTime());
		
		
		System.out.println(str);

	}

}
