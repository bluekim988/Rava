package day03;

import java.util.Scanner;
/*
	���� ��ɹ�
		: ������ �ְ� ������ �´� ���� ���� �ʴ� ��츦 �����ؼ� ó�����ִ� ��ɹ�
		
		����]
			1. if
				==> ������ �����ϰ� �� ���ǿ� �´� ��쿡�� ó���ϴ� ���ǹ�
				����]
					if(���ǽ�) {
						���๮
					}
				==> ���ǽ��� �´� ��쿡�� ���๮�� �����ϰ�
					�׷��� ���� ��쿡�� ���ǹ��� �ǳʶٴ� ���
			2. if ~ else
				==> ������ �����ϰ� ���ǿ� �´� ���� ���� �ʴ� ��� �ΰ����� ó���ϴ� ���ǹ�
				����]
					if(���ǽ�) {
						���๮1
					} else {
						���๮2
					}
				==> ���ǽ��� �´� ���� ���๮1�� �����ϰ�,
					�׷��� ���� ��� ���๮2�� �����ϴ� ���
			3. if ~ else if ~ else
				==> ������ �ΰ� �̻� �����ϰ� �� ���ǿ� �´� ��츦 ó���ϴ� ���ǹ�
				����]
					if(���ǽ�1) {
						���๮1
					} else if(���ǽ�2) {
						���๮2
					} else if(���ǽ�3) {
						���๮3
					...
					
					} else {
						���๮n
					}
				==> ���ǽ��� �������� �����ؼ� �� ���ǹ��� �´� ���๮�� �����ϴ� ���ǹ�
			4. switch ~ case
				==> ������ ó���ϴµ� �����͸� �������� �����ϰ�
					�� �����Ϳ� �´� ���̽��� ã�ư� ó�����ִ� ���
					
				����]
					switch(����) {
					case ������1 :
							���๮1
							break;
					case ������2 :
							���๮2
							break;
					...
					default:
							���๮n
					}
				==> ������ ���� ��ġ�ϴ� case���� ���๮�� ���� ó���ϴ� ���ǽ�
*/
public class Hw01 {
	public Hw01() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("### �Է¹޾� ó���� ��� 1, �����ϰ� ���� ó���Ұ�� 2");
		System.out.print("�Է� : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num == 1) {
			iFloor(sc);
		} else {
			rFloor();
		}
		

	}
	
	public void iFloor(Scanner sc) {
		System.out.print("���ڸ� ������ �Է��ϼ��� : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		int num = no - (no % 100);
		System.out.println("�Է��Ѽ� : [ " + no + " ] �� �����ڸ����� �ݿø��ϸ� [ " + num + " ] �Դϴ�");
	}
	public void rFloor() {
		int no = (int)(Math.random() * (999 - 100 + 1)) + 100;
		System.out.println("�����ϰ� �߻��� �� : " + no);
		no = no / 100 * 100;
		System.out.println("�����ڸ����� �ݿø� : " + no);
	}

	public static void main(String[] args) {
		new Hw01();
	}

}
