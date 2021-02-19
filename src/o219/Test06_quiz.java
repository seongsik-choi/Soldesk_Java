/*
 * 0219 Test06
 *  반복문 : for문, while문, do~while문
 	break, continue, infinity loop연습문제
 */
package o219;

import java.util.Scanner;

public class Test06_quiz {
	public static void main(String[] args) {
	// 문제1) 1~3까지 누적의 합을 구하시오
	int a = 0;
	int sum = 0;
	for(a=1; a<4; a++) {
		sum = sum + a ;
	} System.out.println("1부터 3까지의 누적합은 : " +sum);
			
	// 문제2) 1~5사이 중에서 홀수의 합를 구하시오.
	int b = 0;
	int sum1 = 0;
	for(b=5; b>0; b--) {
		if(b%2==1)
			sum1 = sum1 + b;
	}System.out.println("1부터 5사이의 홀수의 합은 : " +sum1);
	
	// 문제2.1) 1~5 사이 중에서 홀수의 개수를 구하시오.
	int cnt = 0;
	for(b=5; b>0; b--) {
		if(b%2==1)
			cnt = cnt + 1;
	}System.out.println("1부터 5사이의 홀수의 개수는 : " +cnt);
	
	
	// 문제3) 4!값을 구하시오
	int cnt2 = 1;	// 초기값을 1로 지정하여 4*1 부터 시작하게 해주기
	for(b=4; b>=1; b--) {
		cnt2 = cnt2 * b;
	}System.out.println("4!=" +cnt2);

	// 문제4) 
	
	
	/*
	Scanner sc = new Scanner(System.in);
	System.out.printf("값을 입력 :"	);
	String str = sc.next();
	int a;
	for(a =1; a<=3; a++) {	// a는 for문 내에서만 사용가능한 지역변수.
		System.out.printf("입력한 값은 \"%s\" 입니다.\n", str);
	} 
	 */
	}
}
