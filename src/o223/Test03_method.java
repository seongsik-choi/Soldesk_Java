/*
 * Test03_method 이어서
 * - 재귀함수
 */
package o223;
public class Test03_method {
	
	public static void test() {
		test(); // 자신의 함수를 호출할수있다.
	}
	
	// 문) 3!를 재귀함수를 사용해 출력
	public static int fact(int a) {
		if(a==0) {
			return 1;
		}else {
			return a*fact(a-1);	// 재귀함수(무한루프로 갈수있음)
		} 
	}
	/*
	 if(3==0)
	 	else 3*fact(3-1)   3*fact(2) -> fact 부르러 호출
	 if(2==0)
	 	else 2*fact(2-1)   2*fact(1) -> fact 부르러 호출
	 if(1==0)
	 	else 1*fact(1-1)   2*fact(0) -> 출력 no
	 */
	
	public static void main(String[] args) {
	// 재귀적 함수 호출
	// ->자신이 자신의 함수를 호출 할수있다.
		
	System.out.println(fact(3));

	}
}
