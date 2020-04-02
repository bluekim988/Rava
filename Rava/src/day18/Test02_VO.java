package day18;

//학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균
public class Test02_VO {
	private String name;
	private String num;
	private String cls;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;

	public Test02_VO() {
	}

	public Test02_VO(String name, String num, String cls, int kor, int eng, int math) {
		this.name = name;
		this.num = num;
		this.cls = cls;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setSum();
		setAvg();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setSum() {
		this.sum = kor + eng + math;
	}
	public void setAvg() {
		double inst = sum / 3.;
		this.avg = Double.parseDouble(String.format("%.2f",inst));
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(name).append("|").append(num).append("|").append(cls);
		str.append("|").append(kor).append("|").append(eng).append("|").append(math);
		str.append("|").append(sum).append("|").append(avg).append("|").append("\n");
		return str.toString();
	}

}
