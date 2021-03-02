/*
 Test05_interface   (interfaceA, interfaceB 사용)
 1. 클래스와 달리 객체 생성 no, 클래스에서 구현해야하는 작업 명세서
    - new 키워드를 사용해 객체 생성이 아닌, class가 구현
    - 객체가 다양한 자료형(타입)을 갖는 장점이 있음
    ex) interface A, B, C, D가 있는경우
    public class ImplementClass implements InterfaceA, B, C, D{}
    interfaceA ia = new ImplementClass();	// 생성
 */
package other1;

interface interfaceA {	// interface A
    public void funA(); // 선언만하고, 정의는 No
    // ex) 장난감 예제
    public void walk(); // 선언만하고, 정의는 No
    public void run(); // 선언만하고, 정의는 No
    public void alarm(); // 선언만하고, 정의는 No
    public void light(); // 선언만하고, 정의는 No
}
interface interfaceB {	// // interface B
    public void funB(); }

class ToyRobotClass implements interfaceA { // interace A 상속
    @Override	// 메소드 재정의(override)
    public void funA() {	}
    @Override
    public void walk() {
        System.out.println("robot can not walk"); }
    @Override
    public void run() {
        System.out.println("robot can not run");}
    @Override
    public void alarm() {
        System.out.println("robot has alarm"); }
    @Override
    public void light() {
        System.out.println("robot has no light");}
}

public class Test06_ImplementClass implements interfaceA, interfaceB { // extends와 달리 다형성 O
	// 생성자
	public Test06_ImplementClass(){
	     System.out.println("ImplementClass Constructor");}
	@Override
	public void funA() {        // Alt + Shift + enter로 생성된 메소드를 구현 필요
	    System.out.println("interface A의 Method");	 }
	 @Override
	   public void funB() {
	       System.out.println("interface B의 Method");	}
	 @Override
	 public void walk() {
	       System.out.println("airplane can not walk"); }
	 @Override
	 public void run() {
	       System.out.println("airplane can not run");   }
	@Override
	public void alarm() {
	      System.out.println("airplane has alarm");   }
	@Override
	public void light() {
	      System.out.println("airplane has no light");   }
	    
public static void main(String[] args) {
	 interfaceA ia = new Test06_ImplementClass();	// 인터페이스name 객체 = new implementname();
	 interfaceB ib = new Test06_ImplementClass();
	 ia.funA();	// implement에서 재정의된 메소드 
	 ib.funB();	// implement에서 재정의된 메소드 

	 // toy 예제 구현 implementclass = airplane / toyRobotClass = robot
	  interfaceA airplane = new Test06_ImplementClass(); // airplaneclaas
	  interfaceA robot = new ToyRobotClass();    		 // toyRobotClass
	  interfaceA toys[] = {airplane, robot};	// interface 배열 생성(객체1, 2)
	  System.out.println();
	  
	  for(int i = 0; i < toys.length; i++){
	  toys[i].walk(); // airplane can not walk  \n  robot can not walk
	  toys[i].run();  // airplane can not run   \n  robot can not run
	  toys[i].alarm(); // airplane has alarm    \n  robot has alarm
	  toys[i].light(); // airplane has no light \n  robot has no light
	  System.out.println();
	  }
}
}
