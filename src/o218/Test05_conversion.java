/*
  0218 Test05
  1) 자료형 변환
   -> 자동형 변환
   -> 강제형 변환(casting연산)
 */
package o218;
public class Test05_conversion {
	public static void main(String[] args) {
	/*
	 자료형 변환 DataType Conversion
	 1) 자동형 변환 : 수의 범의에 따라 (작은 수 -> 큰수로) 시 형 변환
	  - 정수형 : byte <short < int < long 
	  - 실수형 : float < double
	 */
	 byte a = 3; 
	 int b = a;  // byte형 자료 a가 -> int형 b로 변환가능
	// byte c = b; // int형 자료 b가 -> byte형 c로 변환NO
	
	 /*
	 2) 강제형 변환(castiong 연산)
	  - 필요한 곳에서 일시적으로 변환
	  - ex) (자료형)값
	  */
	 System.out.println((int)3.5); 	// 3
	 System.out.println((double)4); // 4.0 
	 System.out.println((int)2.6 + (int)5.7);	// 7
	 System.out.println((int)(2.6+5.7));		// 8 (int)8.3
	
	// 정수값을 계산하면 정수형만 반환(소수점 필요시 원하는 형으로 변환하여 사용)
	System.out.println(5/3);	// 1
	System.out.println(5/3.0);	// 1.6
	System.out.println(5.0/3);	// 1.6
	System.out.println(5/3.);	// 1.6
	System.out.println(5/(double)3);	//1.6
	}
}
