package day17;
import java.util.*;
public class Test07 {
/*
 	����]
 		������ ���ڸ� 10���� �߻��ϰ�
 		�� ���ڸ� �л��� �����̶�� �����Ѵ�.
 		���߿� 80 ~ 100 ������ ������ ���� �̾Ƽ� �����ϰ��� �Ѵ�.
 		��, �ߺ� ������ ���� ������ �Ѵ�.
 */
	public Test07() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random rnd = new Random();
		for(int i=0; i<10; i++) {
			set.add(rnd.nextInt(101));
		}
		
		TreeSet<Integer> tmpSet = (TreeSet<Integer>)set.subSet(80, 100);
		
		ArrayList<Integer> list = new ArrayList<Integer>(tmpSet);
		
		for(int s : list) {
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		new Test07();

	}

}
