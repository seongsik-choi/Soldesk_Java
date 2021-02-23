package o223;
public class Test06_main {
	/*
	 * Test06_main
	 * main()함수가 호출되는 시점과 값 전달하는 예제
	 */
	public static void test() {}
	//main(); 에러
	/*
	 * main()함수는 사용자가 임의로 호출할 수없다.
	 * Java Virtual machine(JVM) .java -> .class
	 * main()함수를 먼저 호출하고 나머지가 동작.
	 * 
	 * 1) oop0223 패키지에 있는 test06_main.java와 
	 * 2) Defalut 패키지에 있는 MainTest.java (doc창 test)
	 * 3) public class MainTest {
			public static void main(String[] args) {
	
			System.out.println("KOREA");
		
			for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
			}
		}
		}
	 * 
	 * C:\tools\workspace\basicJava\src>java MainTest  seoul jeju busan
		KOREA
		seoul
		jeju
		busan	
	   
	   4) .class파일 실행시 전달값은 main()함수의 매개변수가 받는다.
	 */

	public static void main(String[] args) {

	}
}
