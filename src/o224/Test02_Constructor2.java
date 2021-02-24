package o224;
import java.util.GregorianCalendar;
/*
 Test02_생성자(Constructor)
 - 클래스명과 동일한 함수, 
 - new연산자와 함께 메모리 할당할 때 사용
 - Overloading이 가능
 - 소멸자 함수
 */
class School{
	// 멤버변수 field
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	// 1) 기본 생성자 함수 Constructor : 리턴형이 없다(public void school() {} 주의!!!
	public School() { //default constructor(자동 생성)
		System.out.println("--default School() constructor--");
	} 
	// 1) 매개변수 생성자 함수 Constructor : 매개변수 타입이 다르면 가능(오버로딩)
	public School(String s) { 
		System.out.println("--User School()1 constructor--");
		name = s;
	} 
	
	public School(int k, int e, int m) { 
		System.out.println("--User School()2 constructor--");
		kor = k;
		eng = e;
		mat = m;
	}
	public School(String s, int k, int e, int m) { 
		System.out.println("--User School()3 constructor--");
		name = s;
		kor = k;
		eng = e;
		mat = m;
	} 
	void calc() { 
		aver=(kor+eng+mat)/3;	
	} // calc() end
	public void disp() {		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println("평균점수 : " +aver);
	} // disp() end
	
	
} // School Class end
public class Test02_Constructor2 {
	public static void main(String[] args) {
	// ex) java.util의 GregorianCalendar Class 생성(new 키워드로 메모리 할당)
	/*
	GregorianCalendar today = new GregorianCalendar();	
	if(today.isLeapYear(2021)) { // 보통 접두어가 is로 시작되는 함수(boolean 반환)
		System.out.println("윤년입니다.");
	}else {
		System.out.println("윤년이 아닙니다.");
	}
	*/
//--------------------------------------------------------------------------
	School sc = new School();	// --School() constructor--
	School sc2 = new School("최성식");
	School sc3 = new School(100, 80, 80);
	School sc4 = new School("최성식", 100, 80, 80);
	
	sc.calc();
	sc.disp(); // 매개변수가 없는 sc변수는 disp()함수로 실행시 String 부분 = null, int 부분 = 0으로 들어감
	
	sc3.calc();
	sc3.disp();	// 매개변수가 int형 뿐인 sc3변수는 disp()함수로 실행시 String 부분 = null로 들어감
	System.out.println();
	
	sc4.calc();
	sc4.disp();
//------------------------------------------------------------------------------
	// null : 비어 있는 값
	String str = new String("HAPPY");	// String Class
	str =  str + "_8";		// 문자열 변경(추가, 삭제) 시 기존의 객체를 버리고, 새로운 객체를 메모리에 생성
    						// GC에 의해 회수되지만, 회수되기전 까지 메모리 낭비
	System.out.println(str);	// HAPPY_8
	System.out.println(str.length()); // 7
	
	String str1 = null;			// 메모리 할당은 하지않음
	String str2 = "";	
	System.out.println(str1);	// null
	// System.out.println(str1.length()); 	// Error(Null상태에서는 길이No NullPointerException
	System.out.println(str2);	// Blank 출력
	 
	
	
	}
}
