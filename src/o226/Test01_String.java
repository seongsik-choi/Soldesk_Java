/*
 * Test01_String 보충
 */
package o226;
public class Test01_String {
	public static void main(String[] args) {
	String str = "Gone With The Wind";	
	// 문제1) "The"출력하기
	System.out.println("\"The\" 출력하기 : "+str.substring(10, 13));
	
	// 문제2) 첫번째문자 출력하기(공백 포함)
	System.out.println("첫번 째 문자 출력하기 : "+str.substring(0, 1));
	
	// 문제3) 마지막 문자 추출하기
	System.out.println("마지막 문자 출력하기 : "+str.substring(17, 18));
	System.out.println(str.substring(str.length()-1, str.length()));
	System.out.println(str.substring(str.length()-1));
	
	// 특정 문자를 기준으로 문자열 분리하기
	String[] word = str.split(" " );
	for(int i =0; i<word.length; i++) {
		System.out.println(word[i]);	// Gone \n With \n The \n Wind
	}
	
	// 문자열 좌우 끝에 있는 공백 제거
	System.out.println("#"+ "  s  k    y   ".trim()+"#");	// #s  k    y#
	
	// 과제) StringTokenizer 사용해 보기
	
	}
}
