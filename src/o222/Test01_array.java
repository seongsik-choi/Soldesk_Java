/*
  0222 Test01_배열
  - Array 배열 : 
  1) 하나의 변수에 1개 이상의 동일한 자료형의 값을 저장할 수있는 공간
  2) 연속성, 열거형
  3) element 요소(1 column을 의미) -> 접근방법 kor[0] // 변수명[번지수]
  4) index, 순서, 색인
  5) 행(row, 줄) / 열(column, field, 칸) 
  6) 1차원 배열 : [열]		/ 2차원 배열 : [행][열] 	/ 3차원 배열 : 자바에는 없는 문법
  7) new 연산자 : 메모리 할당 연산자
  ex) int[] arr = new int[5]; // arr[0] ~ arr[4] 
  ex) int[] arr = {1, 2, 3, 4, 5}; arr[0] = 1
 */
package o222;
import java.util.Scanner;

public class Test01_array {
	public static void main(String[] args) {

		int[] arr1 = new int[5]; // arr[0]~ [4]
        arr1[0] = 100;			// arr1[0] 번지에 100 숫자 저장
        System.out.println("arr1[0] : " + arr1[0]); // 0~4 index 모두 초기화 해주기

        // 배열 선언과 초기화를 동시에
        int [] arr2 = {10, 20, 30, 40, 50};
        System.out.println("arr2[0] : " + arr2[0]); // 10
        System.out.println("arr2[] 배열의 길이는 : "+arr2.length); // 배열이름.length = 5
        
        // 점수 입력 받아 평점 구하는 프로그램
        String[] name = {"김", "이", "박"};
        int[] score = new int[3];

        Scanner scanner = new Scanner(System.in); // 사용자로 부터 값을 입력 받을때
        System.out.printf("%s의 점수를 입력하시오. : ", name[0]);
        score[0] = scanner.nextInt();
        System.out.printf("%s의 점수를 입력하시오. : ", name[1]);
        score[1] = scanner.nextInt();
        System.out.printf("%s의 점수를 입력하시오. : ", name[2]);
        score[2] = scanner.nextInt();

        System.out.printf("%s 점수 : %.2f\n", name[0], (double)score[0]); // 소수 두번째짜리 까지 입력
        System.out.printf("%s 점수 : %.2f\n", name[1], (double)score[1]);
        System.out.printf("%s 점수 : %.2f\n", name[2], (double)score[2]);

        double avg = (double)(score[0] + score[1] + score[2]) / 3;
        System.out.printf("\n평점 : %.2f", avg);
        scanner.close();    // 스캐너 할당 후 close	
	}
}
