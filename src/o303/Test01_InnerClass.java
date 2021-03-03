/*
 * Test01_Inner Class(내부 클래스)
 * 1. Inner(내부) 클래스 : 클래스 안에 또 다른 클래스를 선언하는 것 
 */
package o303;
class OuterClass {		// Outerclass
    int num = 10;
    String str1 = "st1";
    static String str11 = "world";

    public OuterClass() {	// constructor
        System.out.println("OuterClass constructor");
    }
    void oDislay() {			// 외부 클래스 메소드
		System.out.println("OuterClass의 str1 값은 :  "+ str1);
	}
    	class InnerClas{            // 내부 클래스
    		int num = 100;
    		String str2 = "str2";
    		public InnerClas() {     // 내부 클래스 생성자
            System.out.println("InnerClass constructor");
    		}
    		void iDislay() {			// 내부 클래스 메소드
    			System.out.println("InnerClas의 str2 값은 : "+ str2);
    		}
    	}//InnerClas end
    	
    	static class InnerClas2{   // static 내부 클래스
        int num = 1000;
        String str3 = "str3";

        public InnerClas2() {     // S내부 클래스 생성자
            System.out.println("InnerClas2 constructor");}
        void iDislay2() {			// 내부2 클래스 메소드
			System.out.println("InnerClas2의 str3 값은 : "+ str3);}
    	}//SInnerClass end
    	
    	public void print() {		// OuterClass의 Method print()
    								// InnerClass에 대한 접근 전부 가능
    		System.out.println("\nOuterClass의 print()method ");
    		OuterClass out = new OuterClass();	// OuterClass 생성자 호출
    		out.oDislay();						// OuterClass의 str1 값은 :  st1
    		
    		InnerClas in = new InnerClas();		// InnerClass constructor(생성자 호출)
    		in.iDislay();						// InnerClas의 str2 값은 : str2
    		
    		InnerClas2 in2 = new InnerClas2();	// InnerClass2 constructor(생성자 호출)
    		in2.iDislay2();						// InnerClas2의 str3 값은 : str3
    	}// print() method end
}// OuterClass end
//-----------------------------------------------------------------------------------------------
// 안드로이드(모바일 플랫폼)기반 자파 코딩 시 IneerClass 사용
class R{
	static class id{ // 내부 클래스 많이 사용
		static String btn="버튼";
	}// class id end
}// class R end

public class Test01_InnerClass {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();   // OuterClass 선언
        System.out.println("oc.num : " + oc.num);	// 10
        System.out.println("oc.str1 : " + oc.str1);	// java
        oc.print();
        System.out.println();

        OuterClass.InnerClas in = oc.new InnerClas();   // OuterClass의 InnerClass 호출 
        												// OuterClass이름.InnerClas이름 In객체 = Out객체.new InnerClas이름();
        System.out.println("in.num : " + in.num);	// 100
        System.out.println("in.str2 : " + in.str2);	// srt2
        System.out.println();

        OuterClass oc2 = new OuterClass();   // OuterClass 선언
        OuterClass.InnerClas2 sin = new OuterClass.InnerClas2();   // Static InnerClass 선언(위와 같음)
        System.out.println("sin.num : " + sin.num);		// 100
        System.out.println("sin.str2 : " + sin.str3); 	// str3
        System.out.println();
        
//-----------------------------------------------------------------------------------------------
        // 안드로이드 Inner Class 접근 방법
        System.out.println(R.id.btn);	// 버튼  
	}
}
