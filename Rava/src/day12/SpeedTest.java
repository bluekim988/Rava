package day12;

public class SpeedTest {

	public SpeedTest() {
		Car car = new Car();
		car.speedUp();
		System.out.println("Car speed : " + car.speed);
		
		Mini mini = new Mini();
		mini.speedUp();
		System.out.println("Mini speed : " + mini.speed);
		
		Lotze euns = new Lotze();
		euns.speedUp();
		euns.speedUp(20);
		System.out.println("euns speed : " + euns.speed);
		
		Car lotze = new Lotze();
//		System.out.println("lotze color : " + lotze.color);
//		System.out.println("lotze used : " + lotze.used);
		System.out.println("lotze speed : " + lotze.speed);
		lotze.showColor();
		
//		Mini m1 = (Mini) lotze;	==> 문법상 오류는 없지만 논리적 오류가 발생해 이러한 방향으로 코딩을 하지 않는다.
		
		Lotze car2 = (Lotze) new Car();
		System.out.println(car2.speed);
		
		
	}
	public static void main(String[] args) {
		new SpeedTest();

	}

}
