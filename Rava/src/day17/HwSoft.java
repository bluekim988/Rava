package day17;

import java.util.*;
public class HwSoft implements Comparator {
	// �̹� ���ı����� �ִ� Ŭ������ ������ ���ı������� ������ �ϰ����� ��
	// Comparator �������̽��� �����ؼ� ���ı������� ����� Ŭ������ ������ָ� �ȴ�.
	// Comparator �� compare() �� �߻��Լ��� ������ �ְ�
	// ������ �ϰԵǸ� �� �Լ��� �ݵ�� �������̵� �ؾ��Ѵ�.
	// ������ �� sort()�� ȣ��Ǹ� �� �Լ��� ���ı������� ����� Ŭ������ compare()��
	// �ڵ� ȣ���ؼ� ������ �ϰ� �ȴ�.
	public HwSoft() {
	
	}

	@Override
	public int compare(Object o1, Object o2) {
		Sagak s1 = (Sagak) o1;
		Sagak s2 = (Sagak) o2;
		int result = (s1.getWidth() - s2.getWidth());
		// 0�̸� �ٲ��� �ʰ�
		// �����̸� �ڸ��� �ٲٰ�
		return result;
	}

}
