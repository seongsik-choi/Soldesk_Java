/*
Test03_Lamda formula
 - 익명(anonymous) 함수를 이용해 익명 객체를 생성하기 위한 식
 - 객체지향이 아닌 함수지향적 프로그래밍
 - interface 타입의 변수 -> 람다 Expressions 으로
 - 객체 생성 필요없이, 파라미터, 실행문 만으로 결과를 도출
 */
package o227;
// interface로 Lamda Formula 생성
interface LamadaInterfaceA {
    public void method(String s1, String s2, String s3);}
interface LamadaInterfaceB {
    public void method(String s1);}
interface LamadaInterfaceC {
    public void method();}
interface LamadaInterfaceD {
    public int method(int x, int y);}

public class Test03_Lamda {	// implements로 받지 않음
	public static void main(String[] args) {
// 매개변수와 실행문만으로 작성(접근자, 반환형, return 키워드 생략)
        LamadaInterfaceA li1 = (String s1, String s2, String s3)	// interfacaA
        -> { System.out.println(s1 + " " + s2 + " " + s3); };
        li1.method("매개","변수","여러개인 경우");
        System.out.println();

// 매개변수가 1개이거나 타입이 갖을때 데이터 타입을 생략가능
        LamadaInterfaceB li2 = (s1) -> { System.out.println(s1); };	 // interfacaB
        li2.method("매개변수 1 개인 경우");
        System.out.println();

// 실행문이 1개인 경우 {} 괄호 생략 가능
        LamadaInterfaceB li3 = (s1) ->  System.out.println(s1); ;   // interfacaA
        li3.method("실행문이 1개인 경우 {} 괄호 생략 가능");
        System.out.println();

// 매개변수가 1개이고, 실행문이 1개인 경우 (), {} 괄호 생략 가능
        LamadaInterfaceB li4 = s1 ->  System.out.println(s1); ;
        li4.method("매개변수가 1개이고, 실행문이 1개인 경우 {} 괄호 생략 가능");
        System.out.println();

// 매개변수가 없는 경우 ()만 작성
        LamadaInterfaceC li5 = () ->  System.out.println("매개변수 없는 경우"); ;
        li5.method();
        System.out.println();

// 반환값이 있는 경우
        LamadaInterfaceD li6 = (x, y) ->  {
            int result = x + y;
            return result;
        }; System.out.printf("li6.method(10, 20) : %d\n",li6.method(10, 20));

        li6 = (x, y) -> {
            int result = (x * y);
            return result;
        }; System.out.printf("li6.method(10, 20) : %d\n",li6.method(10, 20));

        li6 = (x, y) -> {
            int result = (x / y);
            return result;
        }; System.out.printf("li6.method(10, 20) : %d\n",li6.method(100, 20));		
	}
}
