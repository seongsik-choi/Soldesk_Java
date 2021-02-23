package o223;
public class Test04_overload {
	/*
	 * Test04_method Overload 함수 중복 정의
	 * -> 함수명을 중복해서 사용할 수있다.
	 * -> 매개변수의 갯수가 달라야하며, 매개변수의 자료형이 달라야한다.
	 * 	public void getInfo()
	 *  public void getInfo(int a, int b)
	 *  public void getInfo(int a, String str)
	 */
    public static void hap(int a) {	
    	System.out.println(a);
    }
    public static void hap(int a, int b) {
    	System.out.println(a+b);
    }
    public static void hap(double d) {	
    	System.out.println(d);
    }
    public static void hap(int a, String str) {	
    	System.out.println(a + str);
    }
    /* Method를 오버로딩 시 Return Type 구분이아닌 매개변수로 구분
    public static int hap(double a) {	
    	System.out.println(a);
    }
    */
	public static void main(String[] args) {
		hap(2);
		hap(3, 5);
		hap(5.6);
		hap(2, "A");

		// 절대값 구하기(Math Class Overload)
		System.out.println(Math.abs(0)); // 기본 정수형(int)
		System.out.println(Math.abs(4L)); // 기본 정수형(long)
		System.out.println(Math.abs(5.6f)); // 기본 실수형(float)
		System.out.println(Math.abs(3.8d)); // 기본 실수형(double), d 접미사 생략가능
		
	}
}
