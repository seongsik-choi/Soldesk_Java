/*
 * Test07_homework
 * 문제1) 다중 상속(interface와 Abstract class)
 */
package o226B;

import java.util.Scanner;

// 문제1)
interface Mammal  { // 포유류
	abstract void bear();}  // 새끼를 낳음 

abstract class Fish { // 어류
	void swim() {
		System.out.println("물고기는 헤엄치며 움직입니다.");}}

class Whale extends Fish implements Mammal {	// 추상클래스(Fish)와 interface(Mammal)를 다중 상속
	public void bear() {	// // Alt + Shift + enter로 생성된 메서드(interface의 메서드)를 구현 필요
		System.out.println("고래는 새끼를 낳습니다.");
	}
}
public class Test07_MultiExtends {
public static void main(String[] args) {
	// 문제1) main
	Whale whale1 = new Whale();	
	whale1.swim();	whale1.bear();
	System.out.println();

}
}
