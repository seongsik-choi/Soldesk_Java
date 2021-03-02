/*
 * Test01_super
 * 1) 부모, 조상, super
 * 2) 부모 클래스 superclass
 * 3) 자식 클래스 subclass
 * -> this : 멤버변수(field)와 일반지역변수 비교 this.변수명 = 변수명;
 *    this() : 자신의 생성자함수가 자신의 생성자 함수 호출할때
 *    
 * -> super  : 자식 클래스에서 부모클래스의 멤버변수에 접근할 때
 *    super() : 자식 클래스의 생성자 함수가 부모클래스의 생성자 함수를 호출할 때
 */
package o302;
class School extends Object{	// 생략가능(최상위 class)
	String name="학교";
	public School() { // default Constructor
		System.out.println("School Constructor()");
	}
} //class end

class MiddleSchool extends School{
	public MiddleSchool() {
		// super();  -> 생략가능(상속 관계에서 내 생성자 호출전 -> 부모 생성자 호출)
		System.out.println("MiddleSchool Constructor()");
	}
} //class end

class HighSchool extends School{
	String name = "고등학교";
	public HighSchool() {
		super();		// 생략가능
		System.out.println("HighSchool Constructor()");
	}
	public void disp() {
		// 3종류의 name : name(super) / name(class name) / name(method name)
		String name ="종로고등학교";
		System.out.println("name : " +name);				// 지역변수(종로고등학교)
		System.out.println("this.name : " +this.name);		// 멤버변수(고등학교)
		System.out.println("super.name : " +super.name);    // 부모변수(학교)
	}
} //class end
public class Test01_super {
public static void main(String[] args) {
	
	// 1) 상속관계에서 생성자 함수 호출 순서(부모 -> 자식)
	MiddleSchool ms = new MiddleSchool();	// 부모클래스 생성자 호출 + 자신의 생성자 호출
	System.out.println();
	
	HighSchool hs = new HighSchool();	// 부모클래스 생성자 호출 + 자신의 생성자 호출
	hs.disp();							// disp()함수의 지역변수("종로고등학교")호출
}
}
