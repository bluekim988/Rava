package day12.increpas;

/*
 ���� 2]
	
	�л��� �̸�, java, db, html, js, css, ����, ���
	�� ������ Ŭ������ �����
	5�л��� �����͸� �Է��ؼ� ����ϼ���.
	��, ������ ����ȭ��Ű����.
	
 */

public class ScoreInfoDto {
	private String name;
	private int java, db, html, js, css;
	private int sum;
	private double avg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getJs() {
		return js;
	}

	public void setJs(int js) {
		this.js = js;
	}

	public int getCss() {
		return css;
	}

	public void setCss(int css) {
		this.css = css;
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
		sum = java + db + html + js + css;
	}

	public void setAvg(int sum) {
		avg = sum / 5.;
	}

}
