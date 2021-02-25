/*
 * Test02_final
 * - final Variable : 변수를 상수화
 * - final Method	: 더이상 reform(@override) no
 * - final class	: 종단 class -> 부모 class가 될수 없다. 
 */
package o225;
// 1) final class 와 normal class
class Animal{}// class end
final class Fanimal{}// final class end

class Elephant extends Animal {}// final이 아닌 Animal class는 상속 가능
// class Pig extends Fanimal {}// final class인 Fanimal class는 상속 no

// 2) final method
class Fruits{	
	void view() {}
	final void disp() {}	// Child Class에서 @Override 불가능
}// class end

class Apple extends Fruits{	// extends Parent Class
	
	@Override		// annotation 중 (재정의) 의미
	void view() {}
	
	/* 에러. final 메소드는 더이상 override할수 없다.
	@Override		
	void disp() {}
	*/
}// class end 

public class Test02_final {
	public static void main(String[] args) {
	
	int a=3;	a=5;	// 변수는 다른 값으로 대입이 가능하다.
	final int b =2; // 변수를 상수화(대입 불가능)
	// b = 4; Error
	/*  Calendar Class처럼 System에서 제공해주는 API는 static으로 변수 및 함수 구성
		 class Calendar {	
	 	static final HOUR = 10;
	 	static final MINUTE = 12;
	 	static final SECOND = 13;  }
	 */
	}
}
