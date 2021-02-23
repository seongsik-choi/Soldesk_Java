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
		System.out.printf("%c는 문자 %s는 문자열 %d는 정수, %f는 실수 \n", 'A', "AB", 2 ,2.4);
		
		System.out.printf("#%5d\n", 123);     //#  123  		5칸확보후 123
		System.out.printf("#%-5d#\n", 123);	  //#123  #			5칸확보 앞에서부터 123
		System.out.printf("#%05d#\n", 123);	  //#00123# 		5칸확보 입력값보다 공간남을시 0으로
		
		System.out.printf("#%6.2f#\n", 7.8);	//#  7.80#		6칸확보 소수 둘째자리까지
		System.out.printf("#%-6.2f#\n", 7.8);	//#7.80  # 		6칸확보 소수 둘째자리까지(앞에서부터)
		System.out.printf("#%.2f#\n", 7.8);		//#7.80#		확보 no 소수 둘째자리까지
		
		System.out.printf("#%5c#\n", 'R');		//#    R#		5칸확보 
		System.out.printf("#%-5c#\n", 'R');  	//#R    #		5칸확보(앞에서부터)
		
		System.out.printf("#%8s#\n", "HAPPY");	//#   HAPPY#	8칸확보 
		System.out.printf("#%-8s#\n", "HAPPY");	//#HAPPY   #	8칸확보(앞에서부터)
		
		System.out.println(String.format("%.4f", 10/3.0));	// "3.333" String형으로 형 변환
}
