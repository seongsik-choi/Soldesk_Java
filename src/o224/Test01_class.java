package o224;	
import java.awt.*;	  // awt 클래스 안에 있는 모든 기능을 사용(GUI)
import javax.swing.*; // swing 클래스 안에 있는 모든 기능을 사용(GUI)
import java.util.Arrays; // Arrays 클래스만 지정할 수도 있음.
import java.io.*;
import java.sql.*;

class Sungjuk {	// package class Sungjuk(package 생략가능)
	/*
	 * 1) Access Modifier 접근제어, 접근 수정
	 * - private(내부, 은닉)
	 * - package(생략, 현재패키지 내에서만 ex)o224 내에서만)
	 * - protected(상속 관계에 있는 클래스가 다른 패키지에 있는경우 접근 가능 ex)extends)
	 * - public(외부 접근 가능  ex) basicjava 프로젝트 내에서 전부 접근 가능)
	 */
	// 2) 멤버변수 field
	public String name;	// 클래스 외부에서 접근 가능
	int kor, eng, mat;	// package가 생략되어있다.
	private int aver;	// 가장많이 사용하는 멤버변수 속성(private) / 클래스(Sungjuk) 내부에서만 접근가능
		
	// 3) 멤버함수 Method(3종류)
	private void view() {} // view() end
	
	void calc() { // package(생략)
		// 클래스 내부의 멤버들 간에는 Access Modifier와 상관없이 접근 가능하다.
		aver=(kor+eng+mat)/3;	// 멤버변수 중 private로 선언된 aver변수는 클래스 내부(Sungjuk)에서 사용가능
	} // calc() end
	
	public void disp() {		// basicJava 프로젝트 내에서 전부 접근 가능
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println("평균점수 : " +aver);
	} // disp() end
	
}//class end

public class Test01_class {
	/*
	 * Test01_Class(클래스)
	 * 1) 클래스 첫 글자는 대문자로 한다.
	 * 2) 구성멤버 : 멤버변수(filed) + 멤버함수(method)
	 */
public static void main(String[] args) {
	// new 연산자
	// -> 클래스를 사용하려면 메모리(RAM)을 할당하고 사용한다.
	// -> 메모리 할당 형식) new 생성자함수() <- 객체(Object)라고 한다.
	
	int a = 3; // 4byte 정수형(default 자료형)
			   // RAM의 heap영역에 메모리가 할당되고 주소값이 발생.
	
//--------------------------------------------------------------------------
	
	// 객체 지향 자료형 프로그램(Object Oriented Program)
	//new Sungjuk();	// 객체 Object
	//sj 참조변수(reference)
	// -> 캡슐화, 추상화, 다형성, 정보 은닉, 
	Sungjuk sj = new Sungjuk(); // #100번지를 sj 참조변수에 저장
	
	// . 연산자 : 참조변수를 통해 객체에 접근한다
	sj.name="최성식";
	sj.kor=90;
	sj.eng=80;
	sj.mat=70;
	//sj.aver=90;  private 속성으로 정의된 aver 변수는, 클래스 외부에서 접근 불가능
	System.out.println(sj.name);
	System.out.println(sj.kor);
	System.out.println(sj.eng);
	System.out.println(sj.mat+"\n");
	
	// sj.view();  // Sunjuk 클래스 내 private로 정의된 view 함수(클래스 외부에서 접근 불가능)
	sj.calc();
	sj.disp();
	System.out.println();
	
	Sungjuk sj2 = new Sungjuk();	// #100번지가 아닌 새로운 주소에 sj2 참조변수 저장
	sj2.name="최성식2";
	sj2.kor=100;
	sj2.eng=100;
	sj2.mat=100;
	sj2.calc();
	sj2.disp();
	
//------------------------------------------------------------------------
	//1) 참조변수가 가지고있는 객체의 주소값(다름)
	System.out.println("sj 변수의 주소 : " +sj.hashCode());		// 123961122
	System.out.println("sj2 변수의 주소 : " +sj2.hashCode());	// 1227229563
	
	//2) 참조변수가 가지고있는 객체의 주소값을 매칭
	// tmp 임시변수 생성 -> tmp 변수도 Sungjuk Class로 타입지정
	Sungjuk tmp = sj;
	System.out.println("sj 변수의 주소 : " +sj.hashCode());		// 123961122
	System.out.println("tmp 변수의 주소 : " +tmp.hashCode());	// 123961122
	}
}
