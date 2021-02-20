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
	int sum1 = 0;
	for(a=5; a>0; a--) {
		if(a%2==1)
			sum1 = sum1 + a;
	}System.out.println("1부터 5사이의 홀수의 합은 : " +sum1);
	
	// 문제2.1) 1~5 사이 중에서 홀수의 개수를 구하시오.
	int cnt = 0;
	for(a=5; a>0; a--) {
		if(a%2==1)
			cnt = cnt + 1;
	}System.out.println("1부터 5사이의 홀수의 개수는 : " +cnt);
		
	// 문제3) 4!값을 구하시오
	int cnt2 = 1;	// 초기값을 1로 지정하여 4*1 부터 시작하게 해주기
	for(a=4; a>=1; a--) {
		cnt2 = cnt2 * a;
	}System.out.println("4!=" +cnt2);

	// 문제4) 1~100사이 중에서 짝수의 합, 홀수의 합을 각각 구하시오.
	int sum2 = 0, sum3=0;
	for(a=1; a<=100; a++) {
		if(a%2==0) 	// 짝수 구하기		= while(b<100)
			sum2=sum2+a;
		else 		// 홀수 구하기
			sum3=sum3+a;

		}	
	System.out.println("짝수의 합은 : "+ sum2);
	System.out.println("홀수의 합은 : "+ sum3);
	
	// 문제4) boolean로 해결
	int even= 0; // 짝수 값 
	int odd=0;  // 홀수 값
	boolean flag = false; // 시작값을 false로
	
	for(a=1; a<=100; a++) {
		if(flag) {		// 홀수 부분
			even= even +a;
			flag =false;
		}else {			// 짝수부분
			odd = odd + a;
			flag =true;		
		}
	}System.out.println("짝수의 합은 : "+ even);
	System.out.println("짝수의 합은 : "+ odd);
	/*
	 1 if(false) else {flag=true}
	 2 if(true) {flag=false}
	 3 if(false) else {flag=true}
	 */
	
	// 문제5) x값이 10으로부터 x를 여러번 뺸후 ★★★★★★★★★★★★★★★
	// 		결과가 음수가 되면 x를 몇번 뺏는가 계산	
	int num =10;
	int x = 3;
	int cnt3 = 0;
	while(true) {
		cnt3++;
		num=num-x; // 10-3=
		if(num<0) {
			break;
		}
	} System.out.println(cnt3);
	
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
