/*
 Test02_예외처리
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
  } finally{
  	예외가 발생하거나, 발생하지 않거나 무조건 실행
  }
 
 4. throws : 예외 발생 시 예외 처리를 직접 하지 않고 호출한 곳으로 넘김
 
 - e.getMessage() = 에러 이벤트와 함께 들어오는 메세지를 출력
 - e.printStackTrace() = 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력

 */
package o303;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test02_ExceptionClass {
public static void main(String[] args) {
// 1) 예외 처리 하지않은 경우
	/*
	System.out.println(1);
	// Exception이 발생되면 프로그램이 정상적으로 종료되지 않음
	System.out.println(2/0);	// Exception(ArithmeticException) : by zero
	System.out.println(3);		
	System.out.println("END");
	*/
	
// 2) 예외처리를 한경우(try~catch)
// Exception 발생하더라도 정상적으로 프로그램은 종료시켜야 함
// try {} catch() {}//end
	System.out.println("Exception Before");
    try {						// 예외 발생이 예상되는 코드 작성
        System.out.println(2);
        System.out.println(2/0);
    } catch (Exception e){		// 예외가 발생했을 때 처리할 코드
        String msg = e.getMessage();
        System.out.println("Exception은 : " + msg);   // 예외 메시지 출력(Exception : / by zero)
    } System.out.println("Exception end\n");	

// 3) 실수가 많은 예외처리(배열)
    try {
    	System.out.println(1);
    	int[] num= new int[3];	// 0 1 2
    	num[5]= 1;
    }catch(Exception e) {
    	String msg2 = e.getMessage();
    	System.out.println("Exception은 : "+ msg2);	// Exception은 : Index 5 out of bounds for length 3
    } System.out.println("Exception end\n");

// 4) 실수가 많은 예외처리    
    try {
    	System.out.println(1);
    	Integer.parseInt("KOREA"); // int형으로 형변환 
    	System.out.println(2);		// 출력 X
    }catch(Exception e) {		// NumberFormatException
    	String msg3 = e.getMessage();
    	System.out.println("Exception은 : "+ msg3);	// Exception은 : For input string: "KOREA"
    } System.out.println("Exception end\n");
    
// 5) 실수가 많은 예외처리
    try {
    	System.out.println(1);
    	Integer inte = null;
    	System.out.println(2/inte);  // 2/null
    	System.out.println(2);		// 출력 X
    }catch(Exception e) {			// NullPointerException
    	String msg4 = e.getMessage();
    	System.out.println("Exception은 : "+ msg4);	
    	// Exception은 : Cannot invoke "java.lang.Integer.intValue()" because "inte" is null
    } System.out.println("Exception end\n");

// 6) 다중 catch 문 + finally
    try {
    	System.out.println(1);
    	int a = 2/0;
    	int b=Integer.parseInt("KOREA");
    	int[] num = new int[3];		num[5]=7;
    	Integer inte = null;		System.out.println(2/inte);		// 2/null
    	System.out.println(2);		// 출력 X
    }catch(ArithmeticException e) {		
    	System.out.println(e);			// java.lang.ArithmeticException: / by zero
    }catch(NumberFormatException e) {
    	System.out.println(e);
    }catch(ArrayIndexOutOfBoundsException e) {
    	System.out.println(e);
    }catch(NullPointerException e) {
    	System.out.println(e);
    }finally {             // 예외처리와 상관없이 마지막에 항상 실행
        System.out.println("예외 발생 여부와 상관없이 항상 실행");
    }System.out.println("Exception end\n");
    
 // 6) 6번 문제 개선(다형성 접근) + finally
 // 예외처리 조상 class인 Exception class 사용
    try {
    	System.out.println(1);
    	int a = 2/0;
    	int b=Integer.parseInt("KOREA");
    	int[] num = new int[3];		num[5]=7;
    	Integer inte = null;		System.out.println(2/inte);		// 2/null
    	System.out.println(2);		// 출력 X
    }catch(Exception e) {			// catch 문 하나로 Excpetion class 사용
    	String msg = e.getMessage();		// 
        System.out.println("Exception : " + msg);
    }finally {             // 예외처리와 상관없이 마지막에 항상 실행
        System.out.println("예외 발생 여부와 상관없이 항상 실행");
    }System.out.println("Exception end\n");
        
 // 8) Scanner 입력을 통한 try~catch
    Scanner sc = new Scanner(System.in);
    int a, b;
    ArrayList<String> list = null;
    int[] iArr = {0, 1, 2, 3, 4};
    System.out.println("Exception BEFORE");
    try {   
        System.out.print("input a : ");
        a = sc.nextInt();
        System.out.print("input b : ");
        b = sc.nextInt();
        System.out.println("a / b = " + (a/b));

        for(int k =0; k<6; k++){			// Excpetion 발생ㅌ
            System.out.println("iArr["+ k +"] : " + iArr[k]);
        }
        System.out.println("list.size() : " + list.size());	// 출력 no(만약 위 k변수가 5였다면 list가 예외)
        // Exception : Cannot invoke "java.util.ArrayList.size()" because "list" is null
    } catch (Exception e){
    	String msg = e.getMessage();
        System.out.println("Exception : " + msg);	// Exception : Index 5 out of bounds for length 5
    } finally {             // 예외처리와 상관없이 마지막에 항상 실행
        System.out.println("예외 발생 여부와 상관없이 항상 실행\n");
    }System.out.println("Exception AFTER"); 

}
}
