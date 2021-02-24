package o224;
public class Test01_Constructor {
	/*
	1. default 생성자 : 컴파일 시점 자동 생성
    	Constructor obj = new Constructor(); // 객체 생성시 점에 -> 호출
    	publuc Constructor(){} // 디폴트 생성자 호출
    	
    2. 사용자 정의 생성자
    	Constructor obj2 = new Constructor(10);
    	public Constructor(String n, int[] iArr){
    	System.out.println("Constructor2()");
    	num = i;}
    	
     // 디폴트 생성자 호출
    3. 소멸자 : 객체가 GC에 의해 메모리에서 제거될때 finalize() 메서드가 호출
    4. this 키워드 : 현재 객체를 가리킬때 this 사용
	*/
	public Test01_Constructor(){ 	// 1.2 생성자가 없는 경우 컴파일 시 자동 생성
        System.out.println("--Constructor()--"); // 1. 객체 생성시
    }
    public Test01_Constructor(String s, int[] iArr){ // 2. 사용자 정의 생성자
        System.out.println("Constructor2()");
        System.out.println("S --> " +s);
        System.out.println("iArr --> " +iArr);
    } // 디폴트 생성자 호출

    // 3. 소멸자
    @Override
    protected void finalize() throws Throwable{
        System.out.println("--finalize() method --");
        super.finalize();
    }

    // 4. this 키워드
    public int x;
    public int y;
    
    public Test01_Constructor(int x, int y){
        this.x= x; // 앞에 x는 전역변수(public x) 뒤에 x는 지역변수(int x)
        this.y =y; // 나전체에 속해있는 y(전역) = 지역변수(int y)
    }
    public void getInfo(){
        System.out.println("x : " + this.x);
        System.out.println("y : " + this.y);
    }
    
	public static void main(String[] args) {
		// 1. 디폴트 생성자 호출
		Test01_Constructor obj1 = new Test01_Constructor(); 

		// 2. 사용자 정의 생성자
		int[] iArr = {10, 20, 30};
		Test01_Constructor obj2 = new Test01_Constructor("Hello", iArr);
		System.out.println();

		// 3. 소멸자
		Test01_Constructor obj3;
		obj3 = new Test01_Constructor();    // 첫 객채 생성 class
		obj3 = new Test01_Constructor();    // 소멸자 클래스 호출(첫 객체 소멸시 호출되는 소멸자)
		System.gc();                 // Gc 명령

	    // 4. this 키워드
		System.out.println();
		Test01_Constructor obj4 = new Test01_Constructor(10, 20);
		obj4.getInfo(); 
	}
}
