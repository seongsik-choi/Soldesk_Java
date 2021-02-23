package o223;

import java.util.Arrays;
public class Test05_method {
	/*
	 * Test05_method 배열값을 전달
	 */
	public static void test1(int a, int b) {
		System.out.println(a);	// 10
		System.out.println(b);	// 30
	}//test1 end
	
	public static void test2(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);	// 10 20 30
		} System.out.println(a);		// [I@2401f4c3 래퍼런스
	}//test1 end
	
	public static void test3(String a, String b) {
		System.out.println(a);	// 무궁화
		System.out.println(b);	// 개나리
	}//test3 end
	
	public static void test4(String[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);	// 무궁화 진달래 개나리
		}
	}//test4 end
	
	public static void test5(int a, int b) {
		System.out.println(a);	
		System.out.println(b);	
	}//test5 end
	
	public static int[][] su = {{1,3,5},{2, 4, 6}};
	public static void test6(int a, int b) {
		for(int i=0; i<su.length; i++) {
			int col=su[i].length;
			for(int j=0; j<col; j++) {
				System.out.println(su[i][i]);
			}
		}
	}//test5 end
	
	public static void main(String[] args) {
	
	int[] num = {10, 20, 30};
	
	//1) Call by value : 값에 의한 호출방식
	test1(num[0], num[2]); //10 , 30
	
	//2) Call by reference : 주소에 의한 호출 방식
	// reference(가리킨다) : 생성한 객체의 주소를 변수에 저장하는 것
	// 동적생성(객체는 메모리에서 동적 생성, 필요없으면 GC에 의해 제거)
	test2(num);	// 배열요소가 저장되어 있는 주소(배열 전체값)
	
	//3) 
	String[] name= {"무궁화", "진달래", "개나리"};
	test3(name[0], name[2]); // "무궁화", "개나리"
	test4(name);
	
	int[][] su = {{1,3,5},{2, 4, 6}};
	test5(su[0][0], su[1][1]);		// 1 4
	// test6(su);	
	
	
	/*
	 * 정렬(sort)
	 * - 오름차순 : ascending asc 1->10
	 * - 내림차순 : descending desc 10->1 
	 * https://docs.oracle.com/javase/8/docs/api/index.html (제공되는 클래스(API))
	 */
	int[] lotto = {10, 32, 51, 17, 9, 22};
	Arrays.sort(lotto);						// 배열 정렬
	for(int i=0; i<lotto.length; i++) {
		System.out.print(lotto[i] + " ");
	}
	
	
	}
}
