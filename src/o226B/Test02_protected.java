/*
 * Test02_protected
 * 1. protected를 사용해 같은 클래스, 패키지 내 접근.
 */
package o226B;
class Car {
	protected String color;	// protected(패키지 내 접근)
	int speed;
}
class Sedan extends Car {
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void setColor(String color) {
		 this.color = color;
	}
}
public class Test02_protected {
	public static void main(String[] args) {

		Sedan sedan1 = new Sedan();
		sedan1.setSpeed(300);
		sedan1.setColor("빨강");
		System.out.println("승용차 속도 ==> " + sedan1.speed);
		System.out.println("승용차 색상 ==> " + sedan1.color); // color 변수 사용 가능한것은
															// 같은 패키지 안에 클래스가 존재하기 때문에
		Car mycar1 = new Car();
		mycar1.color = "red";
		
	}
}
