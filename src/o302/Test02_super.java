/*
 * Test02_super
 * 1) 간단한 예제
 */
package o302;
class Parent{
	int one, two;	// package	
	public Parent() {}
	public Parent(int one, int two) {
		this.one =one;		// 멤 = 지
		this.two =two;		// 멤 = 지
	}
}//class end

class Child extends Parent{
	int three; 
	public Child() {		// 부모클래스의 one, two 변수 사용가능
		super(); // 생략가능
		System.out.println("Child Constructor()");
	}
	public Child(int a, int b, int c) {
		// 1) 부모 클래스의 변수, 자신 클래스의 멤버변수 접근 방법)
		// System.out.println(super.one=a);		// 부모 클래스의 one변수 <- 지역변수(a)
		// System.out.println(super.two=b);		// 부모 클래스의 two변수 <- 지역변수(b)
		// System.out.println(this.three=c);	// 자신 클래스의 멤버 three변수 <- 지역변수(c)
		
		// 2) 상속받은 멤버변수(one, two)에 값 전달
		super(a, b);	// 부모의 매개변수 생성자 사용
		this.three=c;	// 자식클래스.멤버(three 변수) = 지역변수(c)
	}
}//class end

public class Test02_super {
public static void main(String[] args) {
	Child ch = new Child(10, 20, 30);
	System.out.println(ch.one);
	System.out.println(ch.two);
	System.out.println(ch.three);
	
	}
}

