/*
 * Test05_Object
 * 1) 제일 위에 존재하는 super 클래스 
 * 2) 자바의 기본 패키지(java.lang)에 선언
 * 3) 자바의 모든 클래스는 무조건 Object 클래스를 상속.
 * 4) 자바의 모든 클래스는 Object클래스의 후손.
 * -> public class Class_Name extends Object {}	// extends Object 생략 가능
 */
package o226A;
class Jeju extends Object{	// extends Object 생략 가능
	@Override
	public String toString() {	// 함수에 쓰레기 값이 들어갔나 확인
		return "제주도";
	}
}// class end

class Suwon extends Object{	// extends Object 생략 가능
	private String id="soldesk";
	private String pw="1234";
	
// programming시 멤버변수가 가지고 있는 값을 확인하기위해 주로 사용(Ctrl + space) -> toSting()
	@Override
	public String toString() {
		return "Suwon [id=" + id + ",pw=" + pw + "]";
	}	
}// class end

class Inchun { // extends Object 생략 가능 
	private String name = "인천";
	private String phone= "5678";
	// source -> generate toString()
	@Override
	public String toString() {
		return "Inchun [name=" + name + ", phone=" + phone + "]";
	}
}// class end

class Daejun{}	// Override 안한 경우

public class Test05_Object extends Object {	// extends Object 생략 가능
	public static void main(String[] args) {
	Jeju je = new Jeju();
	System.out.println(je.toString()); // 제주도
	System.out.println(je);			   // 제주도(함수이름 생략가능)
	
	Suwon su = new Suwon();
	System.out.println(su.toString());	// Suwon [id=soldesk,pw=1234]
	System.out.println(su);				// Suwon [id=soldesk,pw=1234]

	Inchun in = new Inchun();
	System.out.println(in); 			// Inchun [name=인천, phone=5678]
	
	// Override 안한 경우
	Daejun da = new Daejun();
	System.out.println(da);				// o226A.Daejun@5d22bbb7
	}
}
