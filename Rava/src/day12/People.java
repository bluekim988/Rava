package day12;
/**
 *	�� Ŭ������ ����� ������ ������ Ŭ�����̴�.
 * @author	������
 * @since	2020.03.24
 * @version	v.1.0
 *
 */
public class People {
	//�� Ŭ������ �ּҷϿ� ����� ����� ������ ����� �뵵�� Ŭ�����̴�.
	//���� ����� �������� ����� �������� ��������� �Ѵ�.
	
	String name;
	String addr;
	String tel;
	String mail;
	String birthday;
	String gen;
	String cop;
	
	// �׷��� �� Ŭ������ ��ü�� �� ���� 
	// ��� ������ ��� �غ�Ǽ� �ԷµǸ� ���ҳ������� ���� ���̴�.
	// �׷��� � ������ �⺻������ ������ �Ǿ�� �� ������ ������ ���̴�.
	
	// ������ �Լ� ����
	// �⺻�������Լ�
	public People() {
		
	}
	
	public People(String cop, String name, String tel, String mail, String gen, String birthday, String addr) {
		this.cop = cop;
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.gen = gen;
		this.birthday = birthday;
		this.addr = addr;
	}
	
	public People(String name, String tel, String mail, String gen, String birthday, String addr) {
		this("increpas", name, tel, mail, gen, birthday, addr);
	}
}
