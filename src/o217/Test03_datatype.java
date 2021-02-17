/*
 0217 Test03
  - Datatype 자료형
  1) 숫자, 문자, 날짜
  2) 기본자료형 : 정수형, 실수형, 문자형, 문자열형, 논리형 등
    - 기본 자료형은 데이터가 변수에 직접 저장
  	정수형 : byte(1), short(2), int(4), long(8)
	실수형 : float(4), double(8)
	문자형 : char(2)
	문자열형 : String(4)	// 문자열형은 객체 메모리 주소가 변수에 저장
	논리형 : boolean(1)
  3) 참조자료형(클래스)
 */
package o217;
public class Test03_datatype {
	public static void main(String[] args) {
	System.out.println(3);		// 정수
	System.out.println(4.5);	// 실수
	System.out.println('R');	// 문자
	System.out.println("C");	// 문자열형
	
	String str = "COVID-19";
	System.out.println("str : " +str);	// 문자열형
	
	boolean b = true;   // true
    System.out.println("b = " +b);
    System.out.println("true"); // boolean type이 아닌 문자열형
	}
}
