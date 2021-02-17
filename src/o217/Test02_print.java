/*
  0217 Test02
  1) Console print 
 */
package o217;
public class Test02_print {
	public static void main(String[] args) {
		System.out.print(123);
		System.out.print(123);
		System.out.println();
		
		System.out.println("줄바꿈");
		System.out.println("456"); // 문자열 데이터 456
		
		// (" ' \)등 을 단순기호로 인식하고자 하는 경우 앞에 \와 같이 사용
		System.out.println("\"");	// "
		System.out.println("\'");	// '
		System.out.println("\\");	// \
		
		// operator
		int i = 10; int j = 11;
		System.out.println(10+"20"); // 1020 문자로 append 
		System.out.println(10+"문자"); // 10문자 append 	
		System.out.println("i + j 의 값은 :" + i+j); //1011 문자로 append
		System.out.println("i + j 의 값은 :" + (i+j)); // 21
		System.out.println("i - j 의 값은 :" + (i-j));	
		System.out.println("i * j 의 값은 :" + (i*j));
		System.out.println("i / j 의 값은 :" + (i/j));
	}
}
