/*
  0217 Test05
  1) Operator(연산자) : 연산자가 많을수록 이식성 높음
   -> 1) 산술 연산자 : + - / *
   -> 2) 비교 연산자 : == <> <= >=  !=  
   -> 3) 논리 연산자 : &&(AND) ||(OR) !(NOT) 
  
 */
package o217;
public class Test05_operator {
	public static void main(String[] args) {
	// 1) 산술 연산자
	System.out.println("5+3= "+ 5+3);
	System.out.println("5-3= "+ (5-3));
	System.out.println("5*3= "+ 5*3);
	// 정수형으로만 몫을 구하면 정수형으로만 결과가 반환
	System.out.println("5/3= "+ 5/3); 	// quotient
	System.out.println("5%3= "+ (5%3)); // mod
	
	// 실수형으로 반환
	System.out.println("3/5.0= "+ 3/5.0);	// 0.6
	System.out.println("3/5.= "+ 3/5.);		// 0.6
	
	// 2) 비교 연산자(관계연산자) -> 결과값이 논리형(boolean)으로 반환
	System.out.println("5<3 " + (5<3));
	System.out.println("5>3 " + (5>3));
	System.out.println("5<=3 " + (5<=3));
	System.out.println("5>=3 " + (5>=3));
	System.out.println("5==3 " + (5==3));
	System.out.println("5!=3 " + (5!=3));
	
	// 3) 논리연산자(판단) -> 결과값이 논리형(boolean)으로 반환
	System.out.println("5<3 && 5>3 " + (5<3&&5>3)); // 2 조건 모두 참이어야 true
	System.out.println("5<3 || 5>3 " + (5<3||5>3));	// 2 조건 중 1개만 참이어도 true
	System.out.println("true! " + !true); // true의 not 값은 false
	}
}
