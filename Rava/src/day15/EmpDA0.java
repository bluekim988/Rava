package day15;

public class EmpDA0 {
	public Chamgo eSql ;
	
	public EmpDA0() {
		eSql = new Chamgo();
		//��� ȸ���� ������ ������ ���Ǹ�� ��������
		String sql = eSql.getSQL(eSql.SEL_ALL);
		System.out.println(sql);
	}
	public static void main(String[] args) {
		new EmpDA0();
	}
}
