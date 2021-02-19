/*
  0218 Test03
1. 피연산자 : 단항(+, - !, |) 이항(x=y, x<y, x!=y) 삼항(조건1: true ? false)
2. 산술 연산자 : +, -, *, /, %
3. 복합 대입 연산자 : +=, -=
4. 관계 연산자 : (>, <, >=, <=, ==, !=)인경우 True
5. 증감 연산자 : ++ --
6. 논리 연산자 : &&(AND, 모두 참이어야 참), ||(OR, 하나만 참이어도 참), !(not 논리 부정)
7. 비트연산자 : 많이 쓰이지는 않음 &(and, 모두 1이면 1), |(or, 하나만 1이어도 1), ^(XOR, a,b 같지않으면 1)
 */
package o218;
public class Test03_bit {
	public static void main(String[] args) {
		int x = 10;     int y = 20;   x = y;
        System.out.println("x = " + x); // x = 20
        System.out.println("x += 10 : " + (x += 10)); // x += 10 : 30
        System.out.println("x>y is TRUE? " +(x>y)); // x>y is TRUE? true

        int a = 10;
        System.out.println("a = " + (a++)); // a = 10
        System.out.println("a = " + (++a)); // a = 12
        int b = 10;
        System.out.println("b-- = " + (b--)); // b-- = 10
        System.out.println("b = " + b); // b = 9

        boolean b1 = true;   boolean b2 = false;
        System.out.println("b1 && b2 = " +(b1 && b2)); // false
        System.out.println("b1 || b2 = " +(b1 || b2)); // true
        System.out.println("!b1 = " +!b1); // false

        int res = 0; int aa = 10; int yy =20;
        res = (aa > yy)? 100 : 200;
        System.out.println("res = " +res); // res = 200

        int aaa = 2; // 0010
        int bbb = 3; // 0011
        System.out.println("aaa & bbb = " +(aaa & bbb)); // 2(0010)
        System.out.println("aaa ^ bbb = " +(aaa ^ bbb)); // 1(0001)
	}
}
