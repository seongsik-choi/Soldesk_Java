/*
 * Test05_FileOutputStream
 * 1. 입/출력 : 다른 곳의 데이터를 가져오는것(입력) / 다른 곳으로 내보내기(출력)
   - 스트림(stream) : 입/출력 연결
   - 입/출력 기본 클래스 : 1byte 단위로 데이터를 전송하는 InputStream,OutputStream
   - FileOutputStream : write(byte[] b);  // 전체 쓰기
                        write(write(byte[], inf off, int len);  // off(시작점), len(길이)
     파일이 없으면(create) -> 있으면(overwrite) -> 또는 추가(append)
   
   - FileWriter : PrintWriter class를 이용해 기록
     autoFlush : true -> 버퍼 클리어 
     PrintWriter out = new PrintWriter(fw1, true); 
     // PrintWriter(File, true or false)
     // true(append : 추가) or false(overwrite : 덮어쓰기)
	 out.println("무궁화,45,60,100");
 */
package o304;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Test05_FileOutputStream {
public static void main(String[] args) throws Exception {	// FileInputStream의 예외를 처리하기 위해 thorwos Exception문 추가	
// 1. 파일 쓰기
		FileOutputStream fos = new FileOutputStream("C:/temp/data99.txt");
		int ch2;
		
		System.out.printf("기록할 문자를 입력하시오 : ");
		while ((ch2 = System.in.read()) != 13)	// 아스키 코드 값(13) 입력할때까지 키보드에서
									// 문자 하나를 read()한다.
		fos.write((byte) ch2);					// 입력한 문자를 파일에 기록
// 5) 자원 반납
		fos.close();							// 파일 닫기	
/*
// 1. 파일 쓰기(파일에 한 줄 씩 작성) : FileWriter + Scanner
		Scanner sc = new Scanner(System.in);	// Scanner
		FileWriter fw = new FileWriter("C:/temp/data999.txt");	// FileWriter 형식으로 fw 변수
		String str;
		
		while (!(str = sc.nextLine()).equals(""))	// 입력한 행이 비어 있는 행이 아니면 11행을 처리. enter는 종료
			fw.write(str + "\r\n");	// 입력한 문자열과 "\r\n"을 붙임
		fw.close();
		sc.close();		
*/			
// + 다른 방식
		String filename = "C:/temp/sungjuk.txt";
		try {
			FileWriter fw1 = new FileWriter(filename);	  // FileWriter 형식으로 fw 변수
			// autoFlush : true -> 버퍼 클리어 
			PrintWriter out = new PrintWriter(fw1, true); // PrintWriter(File, ture(append) or false(overwriter)
				out.println("무궁화,45,60,100");
				out.println("개나리,95,50,90");
				out.println("진달래,34,25,70");
				out.println("최성식,100,100,100");
				out.println("라일락,25,20,20");
			System.out.println("sunjuk.txt데이터 파일 완성!!");
			out.close();
			fw1.close();
		}catch(Exception e) {
			System.out.println("파일 쓰기 실패 :"+e);
		}	
	}// main() end
}
