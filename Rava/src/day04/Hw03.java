package day04;
/*
 	2 ~ 100 ������ ���� �Ҽ��� ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	comm ]
 		�� ������ ����� ã�Ƴ� �Ҽ��� ī��Ʈ�� ���� �������� ����ϼ���.
 */

public class Hw03 {
	

	public static void main(String[] args) {
		
		int count = 0;
		int o = 0;
		oot :
		for(int i=2; i<=100; i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					continue oot;
				}
			}
			String str = ", ";
			if(i==2) {
				str="";
			}
			System.out.print(str+ i);
			
			count +=1;
		}
		System.out.println();
		System.out.println("100���� �Ҽ� ī��Ʈ : " + count);
	}

}
