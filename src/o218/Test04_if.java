/*
 0218 Test04
 1) 제어문 : 절차적인 언어, 프로그램의 흐름을 제어
 	-> 조건문 : if, switch~case
 	-> 반복문 : for문, while문, do~while문
 	-> break, continue
 */
package o218;
import java.util.Scanner;
public class Test04_if {
	public static void main(String[] args) {
	/*
	 1) if (조건) { 조건이 true일때 처리 }
	 
	 2) if (조건) { 조건이 true일때 처리 }
	 	else { 조건이 false인 경우 처리 }
	 		
	 3) if (조건) { 조건1이 true일때 처리 }
	 	else if { 조건2가 true 일때 처리 }
	 	else { 그 외 조건 처리(선택 사항) }
	*/
	
	//문제) if문을 사용하는 성적 프로그램
		String name="최성식";	int kor=35; int eng=90; int mat=100;
		int avr=(kor+eng+mat)/3;
		System.out.println("이름 : "+ name + "평균 : "+ avr + "점");
		
	//문1) 평균이 95점 이상이면 장학생 출력
		if(avr>=95) 
			System.out.println("최성식 학생은 장학생");
		else	System.out.println("최성식 학생은 장학생이 NO"); 
		
	//문2) 국c어점수가 70점 이상이면 국어:합격	 아니면 국어:불합격
		if(kor>=75) 
			System.out.println("국어 점수 :"+kor+"로 합격");
		else	System.out.println("국어 점수 :"+kor+"로 불합격"); 
	
	//문3) 평균이 70이상 이면서 한과목이라도 40 미만이 없어야지 합격)
		name=""; kor=0;  eng=0; mat=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름를 입력하시오 : ");
		name = sc.next();
		System.out.print("국어점수를 입력하시오 : ");
		kor = sc.nextInt();
		System.out.print("수학점수를 입력하시오 : ");
		mat = sc.nextInt();
		System.out.print("영어점수를 입력하시오 : ");
		eng = sc.nextInt();
		int total = (kor+eng+mat)/3;
		
		// AND 조건
		/*if(total>=70 && kor>=41 && mat>=41 && eng>=41) 
			System.out.println("평균 : " +total+ " 과락 과목없이 합격입니다.");
		else System.out.println("과락입니다.");
		*/
		// OR조건
		 if(total>=70){
		 	if(kor<40 || mat<40 || eng<40){
		 		System.out.println("결과 : 재시험"); // 70넘지만 과락
		 	}else {
		 		System.out.println("결과 : 과락없이 합격");	// pass
		 	}
		 }else {
			 System.out.println("결과 : 불합격"); // 70미만
		 }
		 
	//문3) 수학점수 90점 이상이면 수학:A학점	 80점 이상이면 수학:B학점  70점 이상이면 수학:C학점
	//    60점 이상이면 수학:D학점 아니면 수학:F학점   
		mat = 0;
		System.out.print("수학점수를 입력하시오 : ");
		mat = sc.nextInt();
		if(mat>=90) {
			System.out.println("수학 점수 :"+mat+"로 A");
		}else if(mat>=80) {
			System.out.println("수학 점수 :"+mat+"로 B");
		}else if(mat>=70) {
			System.out.println("수학 점수 :"+mat+"로 C");
		}else if(mat>=60) {
			System.out.println("수학 점수 :"+mat+"로 D");
		}else {System.out.println("수학 점수 :"+mat+"로 F");}
	           		
	//문) 이름, 국, 영, 수 점수 입력하여 출력
		Scanner sc2 = new Scanner(System.in);
		String name1 = "";
		int kor1=35; int eng1=90; int mat1=100;
		System.out.print("이름을 입력하시오 :");
		name1 = sc2.next();	
		System.out.print("국어의 점수를 입력하시오 :");
		kor1 = sc2.nextInt();	
		System.out.print("영어의 점수를 입력하시오 :");
		eng1 = sc2.nextInt();
		System.out.print("수학의 점수를 입력하시오 :");
		mat1 = sc2.nextInt();
			System.out.printf("이름은 : %s 국어는 : %d 영어는 : %d 수학는 : %d",name1, kor1, eng1, mat1);
	}
}
