/*
 * Test03_Polymorphism(다형성)
 * 1) OOP(Object-Oriented Programming) 5특성 : 캡슐화, 추상화, 다형성, 정보은닉, 상속, + 재사용성
 *  - 다형성 : Polymorphism 
 *   1) 상속관계에서의 다형성(다양한 형태)
 *   2) 부모 클래스의 입장에서 형태가 여러가지
 * 	 3) class 들 간의 형 변환을 위해 사용
 *   4) 동일한 인터페이스에 대해 서로 다른 방식으로 구현가능한 특성(동적 <-> 상속(정적))
 */
package o302;
class Father extends Object{
	// Filed(멤버 변수)
	public String name = "아버지";
	public String addr ="주소";
	
	// Constructor(생성자 함수)
	public Father() {}
	public Father(String name, String addr) {
		this.name = name;		// 멤버변수 = 지역변수
		this.addr = addr;		// 멤버변수 = 지역변수
	}
	// Method(멤버 함수)
	public void disp() {
		System.out.println(this.name);	// 멤버변수
		System.out.println(this.addr);	// 멤버변수
	}
}//class end

class Son extends Father{		// 자식 class
	public Son() {}
	public Son(String name, String addr) {	
		this.name = name;		// 멤버변수(부모) = 지역변수
		this.addr = addr;		// 멤버변수(부모) = 지역변수
	}
}//class end

class Daughter extends Father{	// 자식 class
	String friend="절친";
	public Daughter() {}
	public Daughter(String name, String addr) {
		super(name, addr);
	}
}//class end

public class Test03_polymorphism {
	public static void main(String[] args) {
	// 1) 일반적인 방식으로 객체 생성(new)
	// POJO방식(new방식) : Plain Old Java Object
	Father father = new Father();						father.disp();	// 아버지 \n 주소
	Son son = new Son("손흥민", "대한민국");					son.disp();
	Daughter daughter = new Daughter("김연아", "대한민국");	daughter.disp();
	System.out.println();
	
	// 2) 다형성(Polymorphism)을 이용한 객체 생성
	// 자식 클래스가 -> 부모클래스에 대입가능(부모클래스는 자식의 모양으로 변함)
	Father fa = new Son("개나리", "일산");	fa.disp();	// 부모클래스는 자신의 Filed를 버리고 대입한 자식클래스 변수로 변경
	fa = new Daughter("진달래","일산");		fa.disp();	// 부모클래스는 자신의 Filed를 버리고 대입한 자식클래스 변수로 변경
	
	// 3) 자식 클래스에 추가된 Field는 다형성 대상이 No!!
	// fa.friend	 error.
	
	// 4) 부모클래스 -> 자식클래스에 대입가능(but. 조건)
	// 조건) 자식클래스의 모양으로 형 변환이 필요!!
	Father father2 = new Father();
	Son son2 = new Son();
	father2 =son2;
	// son2 = father2;    	error.
	son2 = (Son)father2;	// 자식 클래스의 모양으로 형변환
	
	
	// 5) 자바클래스의 최고 조상 : Object클래스
	Object obj = new Integer(3);
	Integer inte = (Integer)obj;
	obj = new Father();
	}
}
