/*
 Test06_String Class
 1. 문자열을 다루는 String 클래스 (객체)는 데이터가 변화면 메모리상의 변화가 
    많아 속도가 느리다.
 - Sting str = "JAVA"; // 기존의 객체에서
 - str = str + "_8" // 문자열 변경(추가, 삭제) 시 기존의 객체를 버리고, 새로운 객체를 메모리에 생성
                     GC에 의해 회수되지만, 회수되기전 까지 메모리 낭비
 2. StringBuffer, StringBuilder 
    : String 클래스 단점 보완, 클래스로 데이터가 변경시 메모리에 기존 객체 재활용
  - StringBuffer sf = new StringBuffer("JAVA");
  - sf.append("_8"); // 문자열 추가시, 기존 객체에서 추가
    Buffer가 안정성 높음, Builder가 속도 빠름
 3. StringTokenizer
 */
package o225;
public class Test06_String {
public static void main(String[] args) {
// 1. 문자열을 다루는 String 클래스
	System.out.println("1. String Class");
    String str = new String("JAVA"); // String str = "JAVA";
    System.out.println("str : " +str);
    str =  str + "_8";
    System.out.println("str : " +str);
    System.out.println();
    
// 2. StringBuffer
    System.out.println("2. StringBuffer Class");
    StringBuffer sf = new StringBuffer("JAVA");
    System.out.println("sf : " +sf);
    
    sf.append("_8");					// 추가하기
    System.out.println("sf : " +sf);
    System.out.println("sf.length() : " +sf.length());

    sf.insert(sf.length(), "~~~");  // 문자열의 끝에 "" 안 문자열 추가
    System.out.println("sf : " +sf);

    sf.delete(4, 8);    // 문자열 4번째부터 8번째 열까지 삭제
    sf.delete(0, sf.length());	// 모든 문자 제거하기
    System.out.println("sf : " +sf);
    System.out.println();
    
// 2. StringBuilder  
    System.out.println("2. StringBuilder Class");
    StringBuilder sb = new StringBuilder("JAVA");
    System.out.println("sb : " +sb);
	
    String str1 ="Gone With The Wind";
    System.out.println(str1.charAt(0)); // 'G'	0번째 글자
    System.out.println(str1.charAt(1)); // 'o'  1번쨰 글자
    
    // 문제) 마지막 글자 출력하기
    System.out.println(str1.length());	// 18
    System.out.println(str1.charAt(str1.length()-1)); // 'd'
    
	}
}
