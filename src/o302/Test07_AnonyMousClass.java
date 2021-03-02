/*
 * Test07_AnoyMous(익명 클래스와 내부 클래스)
 * 1. Inner(내부) 클래스 : 클래스 안에 또 다른 클래스를 선언하는 것
 * 2. Anonymous(익명) 클래스 : 이름이 없는 클래스로 주로 메서드를 재정의(Override) 하는 목적으로 사용
      AnonymousClass의 method 재정의 -> 인터페이스나 추상클래스에 사용
 */
package o302;

class AnonymousClass {	// AnoyMous(익명 클래스) : 재정의(Override) 목적의 클래스
    public AnonymousClass(){
        System.out.println("AnonymousClass constructor");
    }
    public void anymousMethod(){	// Anonymousclass의 method
        System.out.println(" -- AnonymousClass method Start -- ");
    }
}

class OuterClass {		// Outerclass
    int num = 10;
    String str1 = "java";
    static String str11 = "world";

    public OuterClass() {	// constructor
        System.out.println("OuterClass constructor");
    }
    	class InnerClas {            // 내부 클래스
    		int num = 100;
    		String str2 = "str2";
    		public InnerClas() {     // 내부 클래스 생성자
            System.out.println("InnerClass constructor");
    		}
    	}// InnerClas end
    	
    	static class SInnerClass {   // static 내부 클래스
        int num = 1000;
        String str3 = "str3";

        public SInnerClass() {     // S내부 클래스 생성자
            System.out.println("SInnerClass constructor");
        }
    }
}
//-----------------------------------------------------------------------------------------------------------------
interface IMessage{
	public void msgprint();
}// interface end

public class Test07_AnonyMousClass {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();   // OuterClass 선언
        System.out.println("oc.num : " + oc.num);	// 10
        System.out.println("oc.str1 : " + oc.str1);	// java
        System.out.println();

        OuterClass.InnerClas in = oc.new InnerClas();   // OuterClass의 InnerClass 호출 
        												// OuterClass이름.InnerClas이름 In객체 = Out객체.new InnerClas이름();
        System.out.println("in.num : " + in.num);	// 100
        System.out.println("in.str2 : " + in.str2);	// srt2
        System.out.println();

        OuterClass.SInnerClass sin = new OuterClass.SInnerClass();   // Static InnerClass 선언(위와 같음)
        System.out.println("sin.num : " + sin.num);		// 100
        System.out.println("sin.str2 : " + sin.str3); 	// str3
        System.out.println();

        // AnonymousClass 메서드 Override(재정의)
        new AnonymousClass(){	
            @Override
            public void anymousMethod(){
                System.out.println(" -- AnonymousClass Override Method Start");
            };
        }.anymousMethod();	// override한 Method name
//-----------------------------------------------------------------------------------------------------------------
    	// 1) interface는 객체 생성 no
    	// new IMessage();
    	// 익명 객체 -> 필요한 곳에서 일시적으로 사용 + 이벤트(마우스 클릭 등) 발생할 때 사용
        // 모바일 웹, JavaScripts, JQuery 등에서 사용
        // ex) $("button").click()
        System.out.println();
        new IMessage() {
        	@Override
        	public void msgprint() {
        		System.out.println("익명 interface 객체");
        	}
        }.msgprint();	// // override한 Method name
        
	}
}
