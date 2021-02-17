/*
0217 Test01
1) .java &  .class
 자바 언어 번역기 : javac.exe 
 자바 원시(Source) 프로그램 : 사람이 인식하는 신호로 구성된 프로그램(Hello.java)
 자바 목적(Object) 프로그램 : 컴퓨터가 인식하는 신호로 구성된 프로그램(Hello.class)
 -> 컴파일 : 실행 방법 : javac 자바파일명.java
 -> 실행 : .class 파일 -> 실행 방법 : java Hello(class파일명)
 
 2)  Compile & Execution
 - 글짜크기 ctrl + shift + +/-
   자동완성 ctrl + space
  -> 컴파일 : ctrl + s 저장으로 자동 컴파일
  -> 실행 : ctrl + F11로 클래스 실행
  
   3) 필수 문법
    - 명령어 : 대소문자 구분
    - 명령어 종결문자 ;(semicolon)
    - 식별자 : project, package, class, method, variable name
    - 식별자 작성 규칙 : 한글no, 숫자 시작no, 공백 no, 
    - 식별자 작성 : 의미있는 project, package, class name
      -> 프로젝트명 : basicJava / 패키지명 : o217 / 클래스명 : Test01_welcome
      -> Class name 첫 글자는 반드시 대문자 지정(소문자도 가능)
      
 */
package o217;	// 현재 클래스(Test01_welcome)가 있는 위치
public class Test01_welcome {
	public static void main(String[] args) {
		int i  = 10;
		int I = 12;	// 대소문자 구분
		System.out.println(1004); // syso typing + (ctrl + space)
		System.out.println("COVID-19");
		System.out.println("소문자 i의 값은 : " +i);
		System.out.println("대문자 I의 값은 : " +I);
	}
}
