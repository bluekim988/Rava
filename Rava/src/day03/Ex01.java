package day03;

public class Ex01 {
/*
 	1 ~ 100까지의 정수 세개를 랜덤하게 만들어서
 	세 수가 큰수부터 차례로 출력되게 하세요.
 */
	int max;
	int mid;
	int min;
	int tmp;
	public Ex01() {
		for(int i = 0; i < 10; i++)	{	
			random();
			ban(max, mid, min);
			System.out.println(max + " " + mid + " " + min +"\n");
		}
	
	}
	public void random() {
		max = (int)(Math.random()*(100 - 1 + 1)) +1;
		mid = (int)(Math.random()*(100 - 1 + 1)) +1;
		min = (int)(Math.random()*(100 - 1 + 1)) +1;
		
	}
	public void ban(int no1, int no2, int no3) {
		if((max>mid && max>min)) {
			if(mid > min) {
					
			} else {
				tmp = mid;
				mid = min;
				min = tmp;
			}
		}	else if (mid>max && mid>min) {
				if(max>min) {
					tmp = max;
					max=mid;
					mid=tmp;
				}	else {
					tmp=max;
					max=mid;
					mid=min;
					min=tmp;
				}	
		}	else if (min>max && min>mid) {
				if(max>mid) {
					tmp=mid;
					mid=max;
					max=min;
					min=tmp;
				}	else {
					tmp=max;
					max=min;
					min=tmp;
				}
		}
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
