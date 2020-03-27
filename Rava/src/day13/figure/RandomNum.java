package day13.figure;

public class RandomNum {
	
	public static int randomNumber() {
		return (int)(Math.random() * 30) + 1;
	}
	
	public static int randomInit() {
		return (int)(Math.random() * 3) + 1;
	}
}
