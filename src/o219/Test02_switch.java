/*
 0219 Test02
 1) 제어문 : 절차적인 언어, 프로그램의 흐름을 제어
 	-> 조건문 : if, switch~case
 	-> 반복문 : for문, while문, do~while문
 	-> break, continue
 */
package o219;

import java.util.Scanner;

public class Test02_switch {
	public static void main(String[] args) {
	/*
	 * switch ~ case문
	 * 목록중에서 동일한 값을 찾아서 수행할떄
	 * break문을 사용해 switch문을 종료
	 * switch(20) {	// 괄호 안에 있는 case num으로 이동해 수행
	   case 10 : System.out.println("COVID-19"); break;	// case 옆 Integer type
	   case 20 : System.out.println("COVID-20"); break;
	   case 30 : System.out.println("COVID-30"); break;
	   default : System.out.println("case num이 없는 경우"); break;	// 필수No
	}
	 */
	// 기본
	switch(10) {	// 괄호 안에 있는 case num으로 이동해 수행
	case 10 : System.out.println("A"); break;	// case 옆 Integer type
	case 20 : System.out.println("B"); break;
	case 30 : System.out.println("C"); break;
	}
	
	// default 포함
	switch(50) {	// 괄호 안에 있는 case num으로 이동해 수행
	case 10 : System.out.println("A"); break;	// case 옆 Integer type
	case 20 : System.out.println("B"); break;
	case 30 : System.out.println("C"); break;
	default : System.out.println("case num이 없는 경우"); break;	// 필수는NO
	}
	
	// case의 break가 없는 경우 하위 case문 수행(B,C 출력)
	switch(20) {	// 괄호 안에 있는 case num으로 이동해 수행
	case 10 : System.out.println("A"); break;	// case 옆 Integer type
	case 20 : System.out.println("B"); 
	case 30 : System.out.println("C"); break;
	}
	
	// 문제1. 평균점수에 따라서 A(90이상),B,C,D(60이상),F(60미만)학점을 출력하시오.
	// 100~0점까지 평균이 나올수있기에
	Scanner sc = new Scanner(System.in);
	int kor=0, eng=0, mat=0;
	int avr = 0;
	System.out.print("국어의 점수를 입력하시오 :");
	kor = sc.nextInt();
	System.out.print("영어의 점수를 입력하시오 :");
	eng = sc.nextInt();
	System.out.print("수학의 점수를 입력하시오 :");
	mat = sc.nextInt();
	int ave = (int)((kor+eng+mat)/3);
	System.out.println("평균은 : "+ave);
	switch(ave/10) {	// 괄호 안에 있는 case num으로 이동해 수행
	case 10 : System.out.println("A"); break;	// case 10 :도 가능. 밑에 case:9찍고 break
	case 9 : System.out.println("A"); break;
	case 8 : System.out.println("B"); break;
	case 7 : System.out.println("C"); break;
	case 6 : System.out.println("D"); break;
	case 5 : System.out.println("E"); break;
	default : System.out.println("F"); break;
	}
	System.out.println();
	
	// 문제2. 주민번호를 이용해서 나이와 성별을 출력하시오.
	Scanner sc2 = new Scanner(System.in);
	int first = 0;
	System.out.print("내가 태어난 년도를 입력하시오(8자리) :");
	first = sc2.nextInt();	
	int first1 = first/10000;
	System.out.printf("내가 태어난 년도는 : %d",first1); System.out.println();
	System.out.println("나의 나이는 : "+(2021-first1+1)+"입니다.");
	
	System.out.println();

	// 성별 파악
	int second = 1000001;
	int second1 = second/1000000;
	/*// if문으로 해석
	if(second1==1) 
		System.out.println("나의 셩별은 " + second1+ "로시작 하기에 남자");
	else if(second1==2)
		System.out.println("나의 셩별은 " + second1+ "로시작 하기에 여자");
	else if(second1==3)
		System.out.println("나의 셩별은 " + second1+ "로시작 하기에 외국남자");
	else
		System.out.println("나의 셩별은 " + second1+ "로시작 하기에 외국여자");
	*/
	switch(second1) {
	case 1 : System.out.println("뒷자리는 " + second1+ "로시작 하기에 남자"); break;
	case 2 : System.out.println("뒷자리는 " + second1+ "로시작 하기에 여자"); break;
	case 3: System.out.println("뒷자리는 " + second1+ "로시작 하기에 외국남자"); break;
	default : System.out.println("뒷자리는 " + second1+ "로시작 하기에 외국여자"); break;
	}
	
	
	
	}
}
