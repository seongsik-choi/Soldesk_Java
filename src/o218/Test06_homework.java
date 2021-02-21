package o218;

import java.util.Scanner;

public class Test06_homework {
	public static void main(String[] args) {
	
	System.out.println("교재 문 11~12) 단순 if문을  활용하여 두수의 + - * / % 연산을 수행하는 프로그램 작성");	
	/*	
	Scanner sc = new Scanner(System.in);
	double a, b; char c;	// 입력할 값 2개와 문자형 연산자
	
	System.out.print("첫번째 수를 입력하시오 : ");
	a = sc.nextDouble();
	System.out.print("연산자를 입력하시오. : ");
	c = sc.next().charAt(0);		// 문자(char) 입력의 경우
	System.out.print("두번째 수를 입력하시오 : ");
	b = sc.nextDouble();
	
	if (c == '+')
		System.out.printf("%7.2f + %7.2f = %7.2f 입니다. \n", a, b, a + b);	// 총 7자리까지 소수 둘째자리까지 표시ㅣ
	else if (c == '-')
		System.out.printf("%7.2f - %7.2f = %7.2f 입니다. \n", a, b, a - b);
	else if (c == '*')
		System.out.printf("%7.2f * %7.2f = %7.2f 입니다. \n", a, b, a * b);
	else if (c == '/')
		System.out.printf("%7.2f / %7.2f = %7.2f 입니다. \n", a, b, a / b);
	else if (c == '%')
		System.out.printf("%7.2f % %7.2f = %7.2f 입니다. \n", a, b, a % b);
	else
		System.out.println("연산자를 잘못 입력했어요.");
		sc.close();
	*/	
		
	System.out.println("교재 문 13)수식을 한줄로 띄어쓰기로입력하고 switch~case문을 활용해 연산");
	Scanner s = new Scanner(System.in);
	int a, b;
	char ch;			double bb;
	String[] str;	// 문자열 배열(수식을 str[0]~[]로 분리

	System.out.printf("수식을 한줄로 띄어쓰기로 입력하세요 : ");
	str = s.nextLine().split(" "); 	// nextline을 사용해 한줄로 입력받음
									// .spilt(" ")을 이용해 입력받은 문자열을 공백에서 분리  
	a = Integer.parseInt(str[0]); // 첫번째 숫자에 해당되는 문자열(str[0])을 정수로 변환해 a에 저장
	ch = str[1].charAt(0);			// 연산자는 str[1]에
	b = Integer.parseInt(str[2]);	// 두번째 숫자에 해당하는 문자열은 str[2]

	switch (ch) { // 입력한 연산자가 ~인경우
	case '+':		// + 인경우 
		System.out.printf("%d + %d = %d 입니다. \n", a, b, a + b);
		break;
	case '-':
		System.out.printf("%d - %d = %d 입니다. \n", a, b, a - b);
		break;
	case '*':
		System.out.printf("%d * %d = %d 입니다. \n", a, b, a * b);
		break;
	case '/':
		System.out.printf("%d / %d = %d 입니다. \n", a, b, a / b);
		break;
	case '%':
		System.out.printf("%d %% %d = %d 입니다. \n", a, b, a % b);
		break;
	default:
		System.out.printf("연산자를 잘못 입력했습니다. \n");
	}
	s.close();

	}
}
