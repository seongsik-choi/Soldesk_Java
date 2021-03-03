/*
 Test03_예외처리
 4. throws : 예외 발생 시 예외 처리를 직접 하지 않고 호출한 곳으로 넘김
  throws : method와 함게 나옴
 - e.getMessage() = 에러 이벤트와 함께 들어오는 메세지를 출력
 - e.printStackTrace() = 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
 */
package o303;
// 1) ThrowsClass class에 view(), disp() method는 각각 try catch 문 -> 비효율적인 구조
// tView(), tDisp() throws Exception을 활용한 method
class ThrowsClass{	
	/*
	public void view() {
		try {
			int a= 3/0;
		}catch(Exception e) {
			String str = e.getMessage();
			System.out.println("Exception msg : " + str);
		}System.out.println("Exception end");
	}//view() end
	public void disp() {
		try {
			int a = Integer.parseInt("KOREA");
		}catch(Exception e) {
			String str = e.getMessage();
			System.out.println("Exception msg : " + str);
		}System.out.println("Exception end");
	}//disp() end
	*/
	public void tView() throws Exception{
		int a= 3/0;
	}//tView() end
	
	public void tDisp() throws Exception{
		int a = Integer.parseInt("KOREA");
	}//tDisp() end
	
}//Test class end

public class Test03_throws {
public static void main(String[] args) {
    try{
    	ThrowsClass throwsClass = new ThrowsClass();
        throwsClass.tView(); // tView 메소드 호출 예외 발생
        throwsClass.tDisp(); // tDisp 메소드 예외상황이지만, 위에서 예외 발생하여 처리no
    }catch (Exception e){
        e.printStackTrace();	// 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
    } finally {             	// 예외처리와 상관없이 마지막에 항상 실행
        System.out.println("예외 발생 여부와 상관없이 항상 실행");
    }System.out.println("Exception end");
    
	}
}
