/*
 * Test04_성적 프로그램
 */
package o222;

import java.util.Scanner;

public class Test04_achievement {
	public static void main(String[] args) {
// 성적 프로그램
		/*int[] kor= {100, 50, 95, 80, 60};
		int[] eng= {100, 55, 95, 85, 40};
		int[] mat= {100, 60, 35, 90, 30};
		*/
		 String[] name= {"라일락","진달래","개나리"};
	     int[] kor = new int[3];
	     int[] eng = new int[3];
	     int[] mat = new int[3];

	        Scanner scanner = new Scanner(System.in); // 사용자로 부터 값을 입력 받을때
	        System.out.printf("%s의 국어 점수를 입력하시오. : ", name[0]);
	        kor[0] = scanner.nextInt();
	        System.out.printf("%s의 영어 점수를 입력하시오. : ", name[0]);
	        eng[0] = scanner.nextInt();
	        System.out.printf("%s의 수학 점수를 입력하시오. : ", name[0]);
	        mat[0] = scanner.nextInt();
	        System.out.println();
	        
	        System.out.printf("%s의 국어 점수를 입력하시오. : ", name[1]);
	        kor[1] = scanner.nextInt();
	        System.out.printf("%s의 영어 점수를 입력하시오. : ", name[1]);
	        eng[1] = scanner.nextInt();
	        System.out.printf("%s의 수학 점수를 입력하시오. : ", name[1]);
	        mat[1] = scanner.nextInt();
	        System.out.println();
	        
	        System.out.printf("%s의 국어 점수를 입력하시오. : ", name[2]);
	        kor[2] = scanner.nextInt();
	        System.out.printf("%s의 영어 점수를 입력하시오. : ", name[2]);
	        eng[2] = scanner.nextInt();
	        System.out.printf("%s의 수학 점수를 입력하시오. : ", name[2]);
	        mat[2] = scanner.nextInt();
	        
	        // 평균 구하기
	        int[] aver = new int[3];
	        for(int i=0; i<name.length; i++) {
	        	aver[i]= (kor[i] + eng[i] + mat[i]) / 3;
	        	System.out.printf("%s 의 3과목 평균은 : %d\n", name[i], aver[i]); 
	        }
	        
	        // 등수 구하기
	        int[] rank1 = {1,1,1,1,1}; // 등수 배열 초기화
	    	for(int i=0; i<name.length; i++){
	    		for(int j=0; j<name.length; j++) {
	    			if(aver[i]<aver[j]) {
	    				rank1[i] = rank1[i] +1; 
	    			}
	    		}
	    	}
	    	for(int i=0; i<name.length; i++){
	    		System.out.println(name[i]+"는:"+rank1[i]+"등");
	    	}
	       
	    	//출력하기 + 문제2) 평균 10점당 *개씩
	    	for(int i=0; i<name.length; i++) {
	    		System.out.print(name[i] + " ");
	    		System.out.print("국어 :"+kor[i] + " ");
	    		System.out.print("영어 :"+eng[i] + " ");
	    		System.out.print("수학 :"+mat[i] + " ");
	    		System.out.print("평균 :"+aver[i] + " ");
	    		System.out.print("등수 :"+rank1[i]+"등" + " ");
	    		for(int star=0; star<=(aver[i]/11); star++) {
	    			System.out.print("★");
	    		}
	    		System.out.println();
	    	}
	    	
	    	// 문제1) 평균을 기준으로과락(합격(평균70이상,재시험없이), 재시험(한과목이라도 40점 미만), 불합격(평균 70미만))
	    	// 문제3) 평균 95점이상 장학생
	    	System.out.println();
	    	for(int i=0; i<name.length; i++) {
	    		
	    		if(aver[i]>=95) {
	    				System.out.println(name[i]+"는 합격이자 장학생입니다.");
	    		}
	    		if(aver[i]>=70) {
	    			if(kor[i]>40 || eng[i]>40 || mat[i]>40) {
	    				System.out.println(name[i]+"는 합격입니다.");
	    			}else {
	    				System.out.println(name[i]+"는 재시험입니다.");
	    			}
	    		}else {
		    		System.out.println(name[i]+"는 불합격입니다.");
	    		}
	    	}
 	
	}
}
