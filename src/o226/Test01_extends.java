/*
 Test01_Extend 
 1. Method override : 부모 클래스의 기능을 자식 클래스에서 재정의 해서 사용
 2. 자료형(타입) : 클래스도 자료형으로 사용
 3. 모든 클래스의 최상의 클래스는 오브젝트 클래스
 4. super : 상위 클래스를 호출할 때 사용
 - 부모클래스의 private 접근자의 속성과 메서드는 사용 NO!
 */
package o226;

class ParentClass{
	private String name = "private 최성식";	// 멤버변수
	public String panme = "public 최성식";
	
	public ParentClass() {}	// Constructor
	
	public void parentFun(){		// 부모클래스의 Public Method
	        System.out.println("Parent Method");
	    }
	public static String parentFun1(int x){		// 부모클래스의 Public Method
        if(x>0) {
        	return "1보다 수가 큼";
        } else {
        	return "1보다 수가 작음";
        }
    }
	private void privateFun(){		// 부모클래스의 Private Method
	        System.out.println("privateFun Method");
	    }
}

public class Test01_extends extends ParentClass {	// extends
	
	public Test01_extends() {}		// Constructor
	
	@Override
	public void parentFun(){ // 부모 클래스의 makeFood 메소드 재정의
        System.out.println("Override public Parent Method");
    }
	public void privateFun(){ // 부모 클래스의 makeFood 메소드 재정의
        System.out.println("Override private Parent Method");
    }
	
	public static void main(String[] args) {
	Test01_extends t = new Test01_extends();
	t.parentFun();	// Override public Parent Method
	t.privateFun();	// Override private Parent Method
	
	String i = parentFun1(1);
	System.out.println(i);
	}
}
