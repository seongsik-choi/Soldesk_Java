/*
 * Test02_Scanner, Exception 활용 Cal
 */
package o303;
import java.util.Scanner;
public class Test02_ScannerException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, result = 0;	// 데이터값 a, b와 결과값

		System.out.printf("첫번째 수를 입력하세요 : ");
		a = s.nextInt();
		System.out.printf("계산할 연산자를 입력하세요(* / + -) : ");
		char ch = s.next().charAt(0);	// 연산자를 입력받음(문자형)
		System.out.printf("두번째 수를 입력하세요 : ");
		b = s.nextInt();

		try {	// 오류 발생에 대한 예외처리 구문
			switch (ch) {	// 연산자 비교를 통한 switch 문)
			case '+':	result = a + b;		break;
			case '-':	result = a - b;		break;
			case '*':
						if (a == 0 || b == 0)
							throw new Exception("0으로 곱하면 어차피 0입니다.");
						result = a * b;		break;
			case '/':			// 	/ 연산자 이후 두번째 값으로 0을 입력한 경우 
						if (b == 0) 
							throw new Exception("0으로 나누면 안됩니다.");
						result = a / b;		break;
			}
			if (result < 0)
				throw new Exception("결과가 음수입니다.");
			
			System.out.printf("결과 값==> %d", result);
			
		} catch (Exception e) {
			System.out.print("발생 오류 ==> ");
			System.out.println(e.getMessage());	// 발생한 오류에 대한 값 return
		} 	
		s.close();
	}
}
