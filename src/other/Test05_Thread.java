/*
 * Test05_Thread
 * - 프로세스 내에서 여러 쓰레드가 동시에 작업
 * ex) 메신저의 경우 채팅하면서 파일을 다운로드 받거나 음성대화를 나눌 수 있는 것이 가능한 이유가 바로 멀티쓰레드로 작성
 * - 작성법
  1) Thread 클래스 상속 : Thread클래스를 상속받으면 다른 클래스를 상속 no
  2) Runnable 인터페이스 구현 :  재사용성이 높고 코드의 일관성을 유지 할 수 있다는 장점이 있기 때문에 보다 객체지향적인 방법
 */
package other;
public class Test05_Thread {
public static void main(String[] args) {
	
// 1) Thread 클래스 상속
/*
class Car extends Thread { // Thread 클래스 상속
		String carName;		// 멤버변수
		Car(String carName) {	// 생성자
			this.carName = carName;}
		
		public void run() {		// run() 메소드 필용(동작)
			for (int i = 0; i < 3; i++) { // 0, 1, 2까지 3회 반복하여 메시지 출력
				try {	
					Thread.sleep(10);	// 10ms(1/1000)초간 실행을 위해 멈춤
					System.out.println(carName + "~~ 달립니다.");

				} catch (Exception e) {
				}
			}
		}
	}	
	Car car1 = new Car("$자동차1");	// 인스턴스 생성
	car1.start(); 		// 인스턴스.start(); 메소드 호출시 run() 메소드 실행

	Car car2 = new Car("@자동차2");
	car2.start();

	Car car3 = new Car("*자동차3");
	car3.start();
*/
	
// 2) Runnable 인터페이스 구현
	class Car {			// Car class 생성. Truck 클래스의 super class로 사용
		String carName;}	
	
	class Truck extends Car implements Runnable {	// Car class 상속, Runnable interface 구현(Thread)
		Truck(String carName) {
			this.carName = carName;
		}
		public void run() {				// run 메소드 구현
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(10);
					System.out.println(carName + "~~ 달립니다.");
				} catch (Exception e) {
				}
			}
		}
	}

	Truck car1 = new Truck("$트럭1");	 	// Truck Instance 생성
	Thread  truck1 = new Thread(car1);	// Thread Instance 생성 + 초기값을 Truck Instance(car1)로 사용
	truck1.start();						// Thread Instance start() -> run() 메소드 호출

	Truck car2 = new Truck("@트럭2");
	Thread  truck2 = new Thread(car2);
	truck2.start();

	Truck car3 = new Truck("*트럭3");
	Thread  truck3 = new Thread(car3);
	truck3.start();

	}	
}
