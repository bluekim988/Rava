package day16.hw;

public class IncrepasIO {
	private String name;
	private String num;
	private String group;

	public IncrepasIO() {

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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("�̸�: ").append(name).append("\n��ȭ��ȣ : ").append(num).append("\n�� : ").append(group).append("\n");
		return buff.toString();
	}

}
