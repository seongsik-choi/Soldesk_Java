/*
 0219 Test04
 1) 제어문 : 절차적인 언어, 프로그램의 흐름을 제어
 	-> 조건문 : if, switch~case
 	-> 반복문 : for문, while문, do~while문
 	-> break, continue, infinity loop
 */
package o219;
public class Test04_continue {
	public static void main(String[] args) {
	// continue와 break 		
	// for문과 continue 문의 차이점
		
	for(int a=1; a<10; a++) { 	// a == 1 ~10까지 for문 반복
		if(a==5) break;			//  a == 5가 되면 break;
		System.out.println(a + " ");	// 1 2 3 4 출력
	}
	System.out.println(); // 줄바꿈
	
	for(int a=1; a<10; a++) { 	// a == 1 ~10까지 for문 반복
		if(a==5) continue;		// a == 5가 되면 continue만나 반복문으로 올라감(5제외)
		System.out.println(a + " "); // 1 2 3 4 6 7 8 9 출력(5제외)
	}

	}
}
