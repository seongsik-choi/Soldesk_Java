/*
 * Test01_static
 * - class들의 할당, GC관여 X, 모든 객체간의 메모리 공유
 * - 메모리 생성 1번, 소멸도 1번
 * - new 연산자 이용해 별도의 객체 생성없이 사용
 * - 클래스 명으로 직접접근 가능 ex) Number.함수() Number.변수
 * 1) Method 앞 
 * 2) Variable(클래스변수 or 정적변수 or Static 변수) 앞
 */
package o225;
class Sawon{	// ex) 사원 월급 구하기 클래스
	String sabun;	// 사원번호
	String name;	// 이름
	int pay;		// 급여
	
	public Sawon() {}	
	// menu -> source -> Generate Construction using filed
	// Default Constructor -> variable Constructor

	public Sawon(String sabun, String name, int pay) {
		this.sabun = sabun;		// 멤버변수(sabun) = 지역변수(sabun)
		this.name = name;
		this.pay = pay;
		System.out.println("사번 : "+sabun + ", 이름 : "+ name +", 급여 : " + pay);
	}
	
	// Class(static) 변수
	static String COMPANY = "Inc.Soldesk";
	static int SUDNAG =10;
	static double TAX =0.03;
	
	// 1) Static Method(new 키워드 없이 바로 접근)
	static void line() {
		System.out.println("--------------------");
	}
	// 2) Instance Method(new 키워드로 객체 생성수 접근)
	void line2() {	}
	
}// Class end

public class Test01_static {
public static void main(String[] args) {
//----------------------------------------------------------------
// 1. class Sawon 
    Sawon.line();						// static Method
    System.out.println(Sawon.COMPANY);	// static Variable
    System.out.println(Sawon.TAX);		// static Variable
    System.out.println(Sawon.SUDNAG);	// static Variable
    System.out.println();
//----------------------------------------------------------------
    // 1) static 특징을 적용하지 않는 경우(비추천)
    // new 생성자함수() -> Object 생성
    Sawon sa = new Sawon("1010","개나리",300);	// 인스턴스 변수
    double myTax = sa.pay * sa.TAX;
    // 나의 총 지급액 = 급여 - 세금 + 수당
    int total = (int)(sa.pay-myTax+sa.SUDNAG);
    System.out.printf("나의 총 지급액 : %d \n",total);
//---------------------------------------------------------------- 
    // 2) static 특징을 적용한 경우(추천)
    Sawon sa2 = new Sawon("1002", "최성식", 400);
    myTax = sa2.pay * Sawon.TAX;
    // 나의 총 지급액 = 급여 - 세금 + 수당
    total = (int)(sa2.pay-myTax+Sawon.SUDNAG);
    System.out.printf("나의 총 지급액 : %d \n",total);
	
//---------------------------------------------------------------- 
	// 3) static 변수의 연산(continue)
	// 생성과 소멸 각각 1번(주소 공유)
	Sawon kim= new Sawon("1003", "무궁화", 300);
	Sawon lee= new Sawon("1004", "봉선화", 400);
	System.out.println(kim.SUDNAG);	// 10(static 변수 공유)
	System.out.println(lee.SUDNAG);	// 10(static 변수 공유)
	
	kim.SUDNAG= kim.SUDNAG+1;
	System.out.println(kim.SUDNAG);	// 11
	
	lee.SUDNAG = lee.SUDNAG+1;		// 다른 변수 사용해
	System.out.println(lee.SUDNAG);	// 12
	
	Sawon.SUDNAG = Sawon.SUDNAG +1;
	System.out.println(Sawon.SUDNAG);	// 13
	}
}
