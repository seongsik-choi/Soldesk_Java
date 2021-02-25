package o225;

class Number{
    // 멤버변수
	static int num = 0; //클래스 필드(continue)
    int num2 = 0; //인스턴스 필드(stack)
    
    static void print() { 	// 클래스 메소드
    	System.out.println("static Method");
        }
    void print2() { 		// 인스턴스 메소드
    	System.out.println("Instance Method");
        }
}
public class Test01_static {
	/*
	 * Test01_static
	 * - class들의 할당, GC관여 X, 모든 객체간의 메모리 공유
	 * - 메모리 생성 1번, 소멸도 1번
	 * - new 연산자 이용해 별도의 객체 생성없이 사용
	 * - 클래스 명으로 직접접근 가능 ex) Number.함수() Number.변수
	 * 1) Method 앞 
	 * 2) Variable(클래스변수 or 정적변수 or Static 변수) 앞
	 */
	public static void main(String[] args) {
	Number number1 = new Number(); //첫번째 number
    Number number2 = new Number(); //두번쨰 number
    	
    number1.num++; //클래스 필드 num을 1증가시킴
    number1.num2++; //인스턴스 필드 num을 1증가시킴
    
    System.out.println(number2.num); // 두번째 number의 클래스 필드 출력(1)
    								 // number1.변수에서++했지만 메모리 공유로 number2.변수 출력해도 공유
    System.out.println(number2.num2); //인스턴스가 생성될 때마다 생성되므로 인스턴스마다 각기 다른 값(0)	
    
    // 1) Static Method(new 키워드 없이 바로 접근)
    Number.print(); // //클래스 메소드
    
    // 2) Instance Method(new 키워드로 객체 생성수 접근)
    Number number3 = new Number();
    number3.print2();
	}
}
