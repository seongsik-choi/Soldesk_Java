/*
 0219 Test03
 1) 제어문 : 절차적인 언어, 프로그램의 흐름을 제어
 	-> 조건문 : if, switch~case
 	-> 반복문 : for문, while문, do~while문
 	-> break, continue, infinity loop
 */
package o219;

import java.util.Scanner;

public class Test03_for {
	public static void main(String[] args) {
	/*
	 * 1) for 반복문
	 * for(수행하고자 하는 command){ 수행 시 반복하고자 하는 명령어들 } 
	 * for(초기값; 종료값; 반복횟수;){ 수행 시 반복하고자 하는 명령어들 } 
	 * for(;;){}	// infinity loop
	 * for(in) for( : ) 등
	 */
	
	// 증감에 따른 반복(문자를 입력받아 for문동안 출력하기)
	Scanner sc = new Scanner(System.in);
	System.out.printf("값을 입력 :"	);
	String str = sc.next();
	int a;
	for(a =1; a<=3; a++) {	// a는 for문 내에서만 사용가능한 지역변수.
		System.out.printf("입력한 값은 \"%s\" 입니다.\n", str);
	}
		System.out.println(a);		// 4출력(for문 밖에 a를 전역변수로)
	// 감소에 따른 반복
	int b;
	System.out.printf("값을 입력 :"	);
	String str1 = sc.next();
	for(b =4; b>=1; b--) {	// a는 for문 내에서만 사용가능한 지역변수.
		System.out.printf("입력한 값은 \"%s\" 입니다.\n", str1);
	}
		System.out.println(b);	// 0(for문 밖에 a를 전역변수로)
		
	// 입력한 값 기반하여 구구단 구하기
	System.out.print("값을 입력하시오. : ");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	// 1. for문
	 for(int i= 1; i< 10; i++){
	 System.out.printf("%d * %d = %d\n", num, i, (num * i));
	 }
	 
	 // 구구단 4단
	 int dan = 4;
	 for(int i= 1; i<10; i++){
		 System.out.println(dan + " * " + i + " = " + dan*i );
	 }
	}
}
