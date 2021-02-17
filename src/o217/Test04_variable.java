/*
 0217 Test04 
 1) 상수와 변수
  - 상수(constant) : 고정 불변의 값
    ex) 3, 4.5, COVID-39
    
  - 변수(variable) : 변하는 값, JAVA에서 선언은 필수
    -> 식별자 규칙에 의해 의미부여와 금칙어 no
    ex) int i; // 변수 선언		i = 10; // 변수 초기화
		System.out.println("i = " + i);	// 출력
		int j = 10; // 변수 선언과 초기화 한번에
		System.out.println("j = " + j);	// 출력
		int i = 10; // 10진수 : 10 or 2진수 1010
 */
package o217;
public class Test04_variable {
	public static void main(String[] args) {
		// Variable
		int z; 	// 변수 선언 Type 지정 필수		
		z = 10; // 변수 초기화
		System.out.println("int 형 z = " + z);	// 출력
		
		int j = 10; // 변수 선언과 초기화 한번에 + 10진수 : 10 or 2진수 1010
		System.out.println("j = " + j);	// 출력
		
		// 기본 자료형
		// 1) 정수형 : byte(1), short(2), int(4), long(8)
		byte b = 1; short s = 1; int i = 1; long l = 1;
		
		// 2) 실수형 : float(4), double(8)
		// double 접미사 d 생략가능
		float f = 1.5f; 	// float 접미사 f 필수
		double d = 1.444d; // double 접미사 d 생략가능, 기본적으로 사용
		System.out.println(f); System.out.println(d);
		System.out.println(f+d);
		
		// 3) 문자형 : char(2)
		char c = 'c'; System.out.println("문자형 c의 값은 : "+ c);
		char ch = '가'; System.out.println("문자형 ch의 값은 : "+ ch);
		
		// 4) 문자열형 : String(4)	// 문자열형은 객체 메모리 주소가 변수에 저장
		String str = "COVID-19"; System.out.println("문자열형 str : "+ str);
	}
}
