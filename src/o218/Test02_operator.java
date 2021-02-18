/*
  0218 Test02
 1) Operator 연습문제2
 */
package o218;
import java.util.Scanner;
public class Test02_operator {
	public static void main(String[] args) {
	
	// 1) 삼항 연산자
		int a = 3;
		System.out.println(-a);		//  단항 연산자
		System.out.println(a*-1);	//  이항 연산자
		System.out.println((4%2==1) ? "O" : "X");	// 삼항 연산자(조건 ? 참 : 거짓)
	// 절대값 구하기(삼항 연산자)
		int num = -5;
		int abs=(num<0) ? num*-1 : num;
		System.out.println(num+"절대값: "+abs);
	
	// 입력한 값이 홀수면 남자, 짝수면 여자를 출력하시오
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
			System.out.print("num2의 값을 입력하시오 :");
			num2 = sc.nextInt();	// 자료형에 따라 입력받음
			System.out.println(num2%2==0 ? "남자" : "여자");
		
	// 세개의 정수중에서 최대 값을 출력하시오
		int x=3, y=7, z=5;
		int max=(x<y) ? y : x;	// 3<7비교해서 참이면 7을 max에 대입
		max = (max<z) ? z : max;	// 5<7을 비교해서 false(max)값을 max에 저장
		System.out.println(x+","+y+","+z+"중 최대값은 : "+ max);
	
		
	// 2) 대입 연산자
		int aa = 3;
		aa+= 2; // a = a + 2;
		aa -= 2; aa *= 2; aa /= 2; aa %= 3;
		System.out.println(aa);
		
		
	// 3) 1증감 연산자
		int aaa=0;
		System.out.println("aaa :" +(++aaa));	// 1 	 전치연산
		aaa = 0;
		System.out.println("aaa :" +(aaa++));	// 0	 후치연산
		System.out.println("aaa :" +(aaa));		// 1	
	
	// 1증감연산자는 대입연산자와 계산식과 함께 사용하는경우 주의
		int ii=10, jj=20;
		int c= ii++;	
		System.out.println(c);	// 저장의경우 c는 10 그대로 
		System.out.println(ii);	// ii의 값은 11
		int d= --jj;	System.out.println(d);	// 전치연산에 의해 19
	}
}
