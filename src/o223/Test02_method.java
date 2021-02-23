/*
 * Test02_method 이어서
 * 3) return 값이 있는경우
 */
package o223;
public class Test02_method {

    /*  3) Return이 있는 경우
    *  void 자리에 리턴값의 자료형(sum의 자료형은 int) 쓰기
    *  리턴값은 1개값만 리턴     
    */
    public static int test1(int a, int b) {		
    	int sum = a+b;
    	// return ; 	// 리턴값이 없다
    	return sum;	// 리턴값의 자료형을 void 자리에 쓴다.
    }
    
   /* 4) Return이 있는 경우
    * return값이 String 형인 경우  
    */
    public static String test2(int a) {	
    	if(a%2==0) {
    		return "짝수";
    	}else {
    		return "홀수";
    	}
    }
    
    // 문제1) 팩토리얼값을 구하시오(4!)
    public static long fact(int b) {
    	long sum = 1;		// 곱셈
    	while(b>0) {			// for(int a=b; a>0; a--)
    		sum = sum *b;
    		b--;
    	} return sum;
    }
    
    // 문제2) 윤년 계산하기
    public static String leap(int c) {
    	if(c%4==0) {		
    		return "운년입니다.";
    	}else {
    		return "윤년이 아닙니다.";
    	}
    }
    
	public static void main(String[] args) {
    int result = test1(3, 5);			// sum값이 Return 되어 8이 들어옴
    System.out.println(result); 	// 위에 선언한 전역변수(result)에 sum값 대입 / 8출력
    System.out.println(test1(2,4));	// 이런방법도 출력가능 / 8
    
    String str = test2(7);				
    System.out.println(str);		// 홀수
    System.out.println(test2(8));	// 이런방법도 출력가능 / 짝수

    // 문제1) 팩토리얼값을 구하시오(4!)
    long gop = fact(4);
    System.out.println("4!의 값은 : " +gop);
    
    // 문제2) 윤년 계산하기
    String yun = leap(2012);
    System.out.println("2012년은 : "+ yun);
	}
}
