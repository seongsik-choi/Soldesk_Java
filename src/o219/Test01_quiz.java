/*
 0219 Test01
 1) 제어문 : 절차적인 언어, 프로그램의 흐름을 제어
 	-> 조건문 : if, switch~case
 	-> 반복문 : for문, while문, do~while문
 	-> break, continue
 */
package o219;

import java.util.Scanner;
public class Test01_quiz {
	public static void main(String[] args) {
	// 연습문제 / 1년(365.2422~일) / 출력결과(365일 ?시간 ?분 ?초)
	// 1분 60초, 1시간 3600초, 1일 : 86400초, 1년 : 31556926초
	double d = 365.2422;
	
	double i = (365.2522*86400);	
	System.out.println("1년의 초값 : "+(int)i +"초");	// 정수부분만 남기기
	
	double ii = (24*3600);
	System.out.println("1일의 초값 : "+(int)ii +"초");
	
	double iii = (60*60);
	System.out.println("1시간의 초값 : "+(int)iii +"초");
	
	double iiii = (60);
	System.out.println("1분의 초값 : "+(int)iiii +"초");
	
	int tot = (int)(i+ii+iii+iii);
	System.out.println("1년 365.2422일의 초값은 : " +tot);
	
	System.out.println();
	
	double year=365.2422;
	int total= (int)(year*86400);	// 1년이 몇초인지?
	
	int day=total/86400;
	
	total=total%86400;
	int hour=total/3600;

	total=total%3600;
	int min=total/60;

	int sec=total/60;

	System.out.println(day+"일 "+hour+"시간 "+min+"분 "+sec+"초" );
	
	/*
	Scanner sc2 = new Scanner(System.in);
	int kor=0;
	System.out.print("국어의 점수를 입력하시오 :");
	kor = sc2.nextInt();	
	System.out.printf("국어는 : %d",kor);
	*/
	
	}
}
