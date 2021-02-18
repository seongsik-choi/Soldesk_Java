/*
 0218 Test01
 1) Operator 연습문제1
*/
package o218;

import java.util.Scanner;

public class Test01_operator {
	public static void main(String[] args) {
	
	// 문제1 : 임의의 정수가 짝수인지 확인.
	int num1 = 4;		// byte, short, int, long
	if(num1%2== 0) // mod
		System.out.println("num1의 값은 짝수");
	else 
		System.out.println("num1의 값은 홀수");
	
	// 문제2 : 임의의 정수가 3의 배수인지 확인
	int num2;		// byte, short, int, long
	Scanner sc = new Scanner(System.in);
	System.out.print("num2의 값을 입력하시오 :");
	num2 = sc.nextInt();	// 자료형에 따라 입력받음, 한줄전체를 입력받음(nextLine)
	if(num2%3== 0) // mod
		System.out.println("num2는 3의 배수 입니다.");
	else 
		System.out.println("num2는 3의 배수가 아닙니다.");
	
	
	// 문제3 : 해당년도가 윤년(4의 배수)인지 확인하시오.
	int year;
	Scanner sc2 = new Scanner(System.in);
		System.out.print("year의 값을 입력하시오 :");
		year = sc.nextInt();	
		if(year%4== 0) // mod
		System.out.println("올해는 윤년 입니다.");
		else 
		System.out.println("올해는 윤년이 아닙니다.");

	
	// 문제4 : 지폐의 종류와 갯수를 구하시오.
		String sort = "";
		int paper = 0;
		System.out.print("지폐의 종류를 입력하시오 :");
		sort = sc.next();	
		System.out.print("지폐의 갯수를 입력하시오 :");
		paper = sc.nextInt();	
			System.out.printf("종류는 : %s 갯수는 : %d",sort, paper);
	
	// 문제5 : 지폐의 갯수를 구하기(만원5, 천원4, 백원3, 십원2)
		int money = 54320;
		System.out.println("만원의 갯수는 : " +money/10000 +"장");
		money= money%10000;
		System.out.println("천원의 갯수는 : " +money/1000+"장");
		money= money%1000;
		System.out.println("백원의 갯수는 : " +money/100+"장");
		money= money%100;
		System.out.println("십원의 갯수는 : " +money/10+"장");
		
	// 문제6 : 임의의 정수가 2의 배수이면서(AND) 5의 배수인지 확인
		int i = 10;
		System.out.println("i의 값은 조건이 " +(i%2==0&&i%5==0));
	// 문제6 : scanner로 풀기
		int i2;
		Scanner s3 = new Scanner(System.in);
			System.out.print("임의의 정수 i2를 입력하시오 : ");
			i2 = s3.nextInt();	
			System.out.println("조건은 : " +(i2%2==0&&i2%5==0) +"입니다.");		
		
	//문7) 국어점수가 80~89사이인지 확인하시오
		int kor = 83;
		System.out.println("kor의 값은 조건이 " +(kor>=80&&kor<=89));
		
	//문8) 임의의 정수가 3 또는 4인지 확인하시오
		int b = 4;
		System.out.println("b의 값은 조건이 " +(b==3||b==4));
				
	//문9) 임의의 문자가 'Y' 또는 'y'인지 확인하시오	
		char c = 'f';
		System.out.println("c의 값은 조건이 " +(c=='y'||c=='Y'));
	}
}
