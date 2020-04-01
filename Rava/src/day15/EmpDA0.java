package day15;

public class EmpDA0 {
	public Chamgo eSql ;
	
	public EmpDA0() {
		eSql = new Chamgo();
		//모든 회원의 정보를 죄하할 질의명령 가져오기
		String sql = eSql.getSQL(eSql.SEL_ALL);
		System.out.println(sql);
	}
	public static void main(String[] args) {
		new EmpDA0();
	}
}
