/*
 * Test04_추상클래스  (AbstractClass와  AbstractClass2 사용)
 - 클래스의 공통된 부분을 뽑아서 별도의 클래스(추상클래스)로 만들어 놓고, 이것을 상속해 사용
 - 멤버 변수갖음, extends 키워드, 구현필요, 일반메서드 갖음, 생성자도 있음.
 */
package o226;
// Abstract class1
abstract class AbstractClass {   // 추상클래스 abstract 붙여줌
    int num;    // 멤버 변수 선언가능
    String str; // 멤버 변수 선언가능
    public AbstractClass(){ // 생성자 갖음
        System.out.println("AbstractClass Constructor");
    }
    public AbstractClass(int num, String str){ // 매개변수 생성자 갖음
        System.out.println("AbstractClass Constructor");
        this.num = num; // 멤버변수 = 지역변수
        this.str = str;
        System.out.printf("AbstractClass method로 num 값은 : %d, str값은 : %s\n",1,"AbstractClass");
    }
    public void fun1(){    // 일반 메서드도 갖음
        System.out.println("fun1 method start");
    }
    public abstract void fun2(int num); // 추상메서드는 상속하는 클래스에서 구현 필요!!!
}

// Abstract class2
class AbstractClass2 extends AbstractClass {	// extends Ketword 사용
    public AbstractClass2(){	// 생성자
        System.out.println("AbstrartClass2 constructor");
    }
    public AbstractClass2(int i, String s){	// 매개변수 생성자 갖음
        super(i, s);
    }
    @Override
    public void fun2(int num) {
        System.out.println("fun2() method Start num값은 : "+num);
    }
}

public class Test04_AbstractClass {
	public static void main(String[] args) {
	AbstractClass2 ex = new AbstractClass2(10, "JAVA");
    // AbstractClass2 클래스의 super(i, s)로 이동 -> super 키워드로 상위로 이동
    // AbstractClass 클래스의 매개변수 생성자로 이동
    ex.fun1();  // fun1 method start(AbstractClass의 메소드 호출!)
    ex.fun2(100);  // fun2() method Start
	}
}
