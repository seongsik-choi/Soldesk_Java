/*
 Test01_예외처리
 1. 예외 : 프로그램에 문제가 있는 것, 예외로 인해 시스템 동작이 멈추는 것을 막는 것(예외처리)
 
 - Exception(Error는 개발자가 대처가능) vs Error(Error는 개발자가 대처할 수 없음)
 -> Checked Exception : 예외처리를 반드시 해야하는 경우(네트워크, 파일 시스템)
 -> UnChecked Exception : 예외처리를 개발자의 판단에 맞기는 경우(데이터 오류 등)
 
 2. Exception 클래스 :
  NullPointerException, : 객체를 가리키지 않고 래퍼런스를 이용할 때
  NumberFormatException : 숫자데이터에 문자 데이터 등을 넣었을 때
  ArrayIndexOutofBoundException : 배열에서 존재하지 않는 인덱스 가리킬 때
  
 3. try ~ catch : 개발자가 예외처리하기 쉽고, 많이 사용되는 방법
  try {
    예외가 발생할 수 있는 코드
  } catch (Exception e) {
    예외가 발생했을 때 처리할 코드
  }
  
 4. 다양한 예외처리 : Excpetion 및 하위 클래스를 이용해서 예외처리를 다양하게 할 수 있다.

 5. throws : 예외 발생 시 예외 처리를 직접 하지 않고 호출한 곳으로 넘김
 */
package other2;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
class ThrowsClass { //  5. throws : 예외 발생 시 예외 처리를 직접 하지 않고 호출한 곳으로 넘김
    public void First() throws Exception{
        Second();}
    public void Second() throws Exception{
        Third();    }
    public void Third() throws Exception{
        System.out.println("10 / 0 = " + (10/0));   // 오류
    }
}

public class Test01_ExceptionClass {
public static void main(String[] args) {
	int i = 10; int j = 0; int r = 0;
// 1. 기본적인 연산에 대한 예외처리
	System.out.println("Exception BEFORE");
    try {
        r = i / j;      // 예외 발생(10/0)
    } catch (Exception e){
        String msg = e.getMessage();
        System.out.println("Exception : " + msg);   // 예외 메시지 출력(Exception : / by zero)
    }
    System.out.println("Exception AFTER");	System.out.println();

// 4. 다양한 예외처리
    Scanner sc = new Scanner(System.in);
    int a, b;
    ArrayList<String> list = null;
    int[] iArr = {0, 1, 2, 3, 4};
    System.out.println("Exception BEFORE");
    
// 윗 예외구문에서 예외 발생시 밑에 예외구문은 실행 NO
    try {   
        System.out.println("input a : ");
        a = sc.nextInt();
        System.out.println("input b : ");
        b = sc.nextInt();
        System.out.println("a / b = " + (a/b));

        for(int k =0; k<6; k++){
            System.out.println("iArr["+ k +"] : " + iArr[k]);
        }
        System.out.println("list.size() : " + list.size());

    } catch (InputMismatchException e){
        e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e){		// 배열에서 존재하지 않는 인덱스 가리킬 때
        e.printStackTrace();
    } catch (Exception e){
        e.printStackTrace();
    } finally {             // 예외처리와 상관없이 마지막에 항상 실행
        System.out.println("예외 발생 여부와 상관없이 항상 실행");
    }
    System.out.println("Exception AFTER"); System.out.println();
	
    
//  5. throws
    ThrowsClass throwsClass = new ThrowsClass();
    try{
        throwsClass.First(); // First 메소드 호출 -> Thorws로 Third 메소드로 예외 발생
    }catch (Exception e){
        e.printStackTrace();
    } finally {             // 예외처리와 상관없이 마지막에 항상 실행
        System.out.println("예외 발생 여부와 상관없이 항상 실행");
    }

}
}
