/*
 * Test05_ print Format
 * user interface를 위한 format
 */
package o222;
public class Test06_printFormat {
	public static void main(String[] args) {
	/*
	 * 출력 서식(Print Format)
	   \n 줄바꿈	\t	
	   %d 10진정수형 	%f 실수형	 	%c 문자형
	   System.out.prinf("출력서식", 값);
	 */
		System.out.printf("정수: %d의 실수형 값은 : %f \n", 100, 100.0);
		System.out.printf("%c는 문자 %s는 문자열 %d는 정수, %f는 실수", 'A', "AB", 2 ,2.4);
	}
}
