package day19;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 	파일에
 		친구의 정보를 저장한다.
 		
 		정보
 			이름		String
 			나이 		int
 			신장		float
 			성별		char
 			전화		String
 			메일		String
 			
 	이처럼 자바의 데이터 타입을 그대로 보내고 받을 수 있는 스트림은
 	DataInputStream / DataOutputStream   이다.
 	주의 사항은 입력순에 맞게 그대로 꺼내야되고
 	읽을때도 DataInputStream 으로만 꺼내야 한다.
 */
public class Test08 {

	public Test08() {
		FileOutputStream out = null;
		DataOutputStream dout = null;
		try {
			out = new FileOutputStream("src/day19/etc/dataStream_test.txt");
			dout = new DataOutputStream(out);
			
			dout.writeUTF("김펭수");
			dout.writeInt(16);
			dout.writeFloat(180.5f);
			dout.writeChar('M');
			dout.writeUTF("010-1231-2255");
			dout.writeUTF("aaa@increpas.com");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				out.close();
			} catch (Exception e2) {

			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
