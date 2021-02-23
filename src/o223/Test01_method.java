/*
 * 0223 Test01_method
 * - 함수 : Function
 * 1) 일정한 기능을 가지고 있는 것
 * 2) 작성법 : 리턴형 함수명 () {  함수의 기능  }
 * 3) 식별자 : project, package, class, method, variable name 등 특성에 맞게 의미부여
 * 4) "test"  : String constants   / test   : variable	/ test() : method
 * 5) User defined method(사용자 정의 함수)   
 * 6) 작성 유의사항 : 매개변수(parameter), 리턴값
 * 7) 동작 : 정의 된 함수를 호출함으로써 수행
 */
package o223;
public class Test01_method {
	
	public String name; 	// 멤버변수
    public String gender;	// 멤버변수
    public int age;			// 멤버변수
    
    public Test01_method(){ // 생성자
        System.out.println("--생성자--");
    }
    
    //1) 전달값(argument value)이 없는 경우
    public static void test1() {
    	System.out.println("--test1 method--");
    }//test() end
    
    public static void test2() {
    	System.out.println("--test2 method--");
    	return;		// 호출한 곳으로 return
    }
    //2) 전달값이 있는 경우
    public static void test6(char n, byte num) {
    	System.out.printf("입력값 char형 :%c, 입력값 byte형 :%d",n, num);
    	return;
    }
    
    public void setInfo(String n, String g, int a){ // 매개변수(parameter) 있는 메서드
        System.out.println("--setInfo() Start");
        name = n;
        gender = g;
        age = a;
    }
    public void getInfo(){  // 매개변수(parameter) 없는 메서드
        System.out.println("--getInfo 1() Start");
        System.out.println("name : " + name);
        System.out.println("gender : " + gender);
        System.out.println("age : " + age);
    }
    public void getInfo(int x, int y){  // getInfo 중복 메서드(오버로딩)
        System.out.println("--getInfo 2() Start");
        System.out.printf("입력 값 --> x : %d, y : %d\n", x, y);
    }
    private void mySecret (){  			 // 클래 밖에서는 접근 no(private)
        System.out.println("--Mysecret()--");
    }

	public static void main(String[] args) {
		Test01_method me = new Test01_method();   // 생성자 호출
		test1();			// 함수 호출
		me.name = "최성식";
		me.gender = "남";
		me.age = 25;
		me.getInfo(); // getInfo 1 메소드 호출

		me.getInfo(1,2); // getInfo 2 메소드 호출
		me.setInfo("오","남",25);
		me.mySecret();	
		byte num =100;
		me.test6('#', num);
	}
}
