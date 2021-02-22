/*
 배열 quiz
 */
package o222;
import java.util.Arrays;
public class Test03_quiz {
	public static void main(String[] args) {
	 
// 문제1) 모음의 갯수를 구하시오.
	char[] ch = {'S','o','l','D','e','s','k'};
	int cnt = 0;
	for(int i=0; i<ch.length; i++) {
		if(Character.isUpperCase(ch[i])==true) {
			cnt++;
		}
	}System.out.println("대문자의 갯수는 : " +cnt+"개");

	
	int[] num = {7, 8, -9, 5, 6};
// 문제2) num 배열 요소중 음수의 갯수를 구하시오.
	int cnt1 = 0;
	for(int i=0; i<num.length; i++) {
		if(num[i]<0) {
			cnt1++;
		}
	}System.out.println("음수의 갯수는 : " +cnt1+"개");	
	
// 문제3)	num 배열 요소중 최솟값, 최대값을 각각 구하시오.
	int max = num[0]; //최대값
	int min = num[0]; //최소값
			
	for(int i=0;i<num.length;i++) {	// <5
	    if(max<num[i]) {	// if(7<8) -> max=8값 넣기
		//max의 값보다 array[i]이 크면 max = num[i]
		max = num[i];
	    }		
	    if(min>num[i]) {
		//min의 값보다 array[i]이 작으면 min = array[i]
		min = num[i];
	    }
	}
	System.out.println("최대값 : "+max);
	System.out.println("최소값 : "+min);
	
// 문제4) num[4]요소의 등수를 구하시오.(숫자 기준 큰 수가 높은등수)
// int[] num = {7, 8, -9, 5, 6};
	int rank = 1;
	/* 해석
	  if(num[4]<num[0]		-> 6<7  -> r=1+1
	  if(num[4]<num[1]		-> 6<8  -> r=2+1
	  if(num[4]<num[2]		-> 6<-9
	  if(num[4]<num[3]		-> 6<5
	  if(num[4]<num[4]		-> 6<6
	 */
	for(int i=0; i<num.length; i++) {
		if(num[4]<num[i]) {
			rank++;
		}
	}System.out.println(num[4]+"의 등수는 : "+ rank +"등");
	
// 문제5) num배열 요소의 각각의 등수를 모두 구하시오.
	/* 해석 : 문제4)와 비교해(num[4] * 5개 element 비교) + ... (num[0] * 5개 element 비교)
	 */
	int[] rank1 = {1,1,1,1,1}; // 등수 배열 초기화
	for(int i=0; i<=4; i++){
		for(int j=0; j<=4; j++) {
			if(num[i]<num[j]) {
				rank1[i] = rank1[i] +1; 
			}
		}
	}
	for(int i=0; i<rank1.length; i++){
		System.out.println(num[i]+"는:"+rank1[i]+"등");
	}
	
	
// 문제6) 대각선 방향의 각 요소의 합을 구하시오!!!!!!
	// 		 대각선 ↘ 방향의 합 (4, 9, 7)
	//		 대각선 ↗ 방향의 합 (2, 9, 6)
	/*
	  su[0][0] + su[1][1] + su[2][2]
	  su[0][2] + su[1][1] + su[2][0]
	 */
	int[][] su = {	{4,3,2},
					{5,9,1},
					{6,8,7}};
	int hap1 = 0, hap2 = 0;
	for (int i = 0; i < su.length; i++) {
		for (int b = 0; b < su[i].length; b++) {
			if (i == b) {
				hap1 = hap1 + (su[i][b]);
				// System.out.println(su[i][b]); // 4 9 7 ㅜ출력
			}
		}
	}
	System.out.println("대각선 ↘ 방향의 합은: " + hap1);
	
	for (int i = 0; i < su.length; i++) {
		for (int b = su[i].length - 1; b >= 0; b--) {
			if ((i + b) == su[i].length - 1) {
				hap2 = hap2 + (su[i][b]);
			}
		}
	}
	System.out.println("대각선 ↙ 방향의 합은: " + hap2);
	
	}
}
