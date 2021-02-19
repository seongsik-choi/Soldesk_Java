/*
 0219 Test05
 1) 제어문 : 절차적인 언어, 프로그램의 흐름을 제어
 	-> 조건문 : if, switch~case
 	-> 반복문 : for문, while문, do~while문
 	-> break, continue, infinity loop

 */
package o219;
import java.util.Scanner;

public class Test05_while {
	public static void main(String[] args) {
	
	/* 1) while 반복문
	   while(조건) { 조건이 true이면 수행}
	   while(true){ } infinity loop
	*/	
	int a=1;
	while(a<=3) {
		System.out.println("JAVA");	// 3번출력
		a=a+1;
	}
	
	/*
	  2) do~while문
	   do {
		  	조건이 true이면 수행
	   	  } while(조건);
	 */
	int b = 1;
	do {
		System.out.println("PYTHON");	// 3번출력
		b=b+1;
	}while(b<=3);

	int c=3;
	do {
		System.out.println("HTML");	//  3<=0 조건동안 -> 조건이 밑에 있기에 한번은 출력
		c=c+1;
	}while(c<=0);
	
	// while문 사용 구구단	
	Scanner sc = new Scanner(System.in);
	System.out.print("값을 입력하시오. : ");
	int num1 = sc.nextInt();
	int i = 1;  // while 문 바깥에 선언 및 초기화
		while (i < 10){
			System.out.printf("%d * %d = %d\n", num1, i, (num1 * i));
	        i++;
	     }
			
	}
}
