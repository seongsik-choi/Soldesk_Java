/*
 * Test03_this2
 * - this와 this()
 * this : 클래스 자신을 가리키는 대명사 / 일반 지역변수와 멤버변수 구분
 * this() : 생성자 함수 간의 호출
 */
package o225;
class Sungjuk{
	// Member Variable
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	// Default Constructor Method
	public Sungjuk() {
		// 생성자함수가 자신의 생성자 함수를 호출할 수있다.
		// Sungjuk("개나리"); Error
		this("개나리");	
	}
	// Parameter Constructor Method Overload(인자, 자료차이) <-> Override(재정의)
	public Sungjuk(String name) {
		this.name = name; // Member.name = local.name;
	}

	public Sungjuk(int kor, int eng, int mat) {
		this("진달래");  // 생성자 함수(Sting name) 호출(무조건 첫줄에서!!)
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		// this("진달래");  // 에러.(생성자 함수 호출은 무조건 첫줄에서!!)
	}
	
	public Sungjuk(int aver) {
		disp(); // 생성자 함수에서 일반 메서드 호출 가능!
	}
	
	// Member Method
	void disp() {
		// this(85); // 에러.(일반 메서드에서는 생성자 함수 호출 No)
	}// disp() end
	
}
public class Test03_this2 {
	// this() : 생성자 함수 간의 호출
	// -> 자신의 생성자함수가 자신의 생성자 함수를 호출할 때
public static void main(String[] args) {
	}
}
