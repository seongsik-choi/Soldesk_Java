/*
 * Test05_추상클래스  (AbstractClass와  AbstractClass2 사용)
 * 1) 미완성 클래스
 * 2) 추상메소드가 1개라도 있으면 추상클래스
 * 3) 추상메소드(미완성)와 일반메소드가 같이 선언 가능
 * 4) 객체 생성 No(new 연산자를 직접 사용할 수 없다)
 - 클래스의 공통된 부분을 뽑아서 별도의 클래스(추상클래스)로 만들어 놓고, 이것을 상속해 사용
 - 멤버 변수갖음, extends 키워드, 구현필요, 일반메서드 갖음, 생성자도 있음.
 
 - 추상메소드 작성) : public abstract void disp(); // 종결어미 ; 사용
 - 추상메소드 구현) : 상속받은 class에서 @override 후 구현
 
 <-> 인터페이스 : 추상 메소드 만 선언이 가능하다.(일반 메소드 불가능) 
 */
package o302;

// Abstract class1(생성자 + 일반함수 + 추상함수)
abstract class AbstractClass {   // 추상클래스 abstract 붙여줌
   
	int num;    // 멤버 변수 선언가능
    String str; // 멤버 변수 선언가능
// Constructor    
    public AbstractClass(){
        System.out.println("AbstractClass Constructor");
    }
// Parameter Constructor 갖음    
    public AbstractClass(int num, String str){ 
        System.out.println("AbstractClass Constructor");
        this.num = num; // 멤버변수 = 지역변수
        this.str = str;
        System.out.println("AbstractClass method로 num 값은 : "+num+ " str값은 : "+str);}
    
// 일반 메소드
    public void fun1(){    // 일반 메서드도 갖음
        System.out.println("fun1 method start");}
    
// 추상메소드(추상메서드는 상속하는 클래스에서 구현 필요!!!  {}가 아닌 ;로 종결)
    public abstract void fun2(int num);		
}

// 구현하는 Class
class AbstractClass2 extends AbstractClass {	// extends Ketword 사용
    public AbstractClass2(){	// 생성자
        System.out.println("AbstrartClass2 constructor");
    }
    public AbstractClass2(int i, String s){	// 매개변수 생성자 갖음
        super(i, s);						// 부모는 추상클래스 
    }
    @Override
    public void fun2(int num) {
        System.out.println("fun2() method Start num값은 : "+num);
    }
}

public class Test05_AbstractClass {
	public static void main(String[] args) {
	AbstractClass2 ex = new AbstractClass2(10, "JAVA");
    // AbstractClass2 클래스의 super(i, s)로 이동 -> super 키워드로 상위로 이동
    // AbstractClass 클래스의 매개변수 생성자로 이동
    ex.fun1();  	// fun1 method start(AbstractClass의 메소드 호출!)
    ex.fun2(100);  // fun2() method Start
    System.out.println();
    
    // 다형성 (자식클래스 -> 부모클래스)
    AbstractClass ex2 = new AbstractClass2(100, "JAVA");	// 추상클래스 생성자 호출 + 출력
    
	}
}
