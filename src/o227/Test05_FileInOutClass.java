/*
Test05_입력과 출력(FileInputStream  FileOutputStream)
 1. 입/출력 : 다른 곳의 데이터를 가져오는것(입력) / 다른 곳으로 내보내기(출력)
   - 스트림(stream) : 입/출력 연결
   - 입/출력 기본 클래스 : 1byte 단위로 데이터를 전송하는 InputStream,OutputStream
  InputStream <-> OutputStream
   - FileInputStream : read();  // 1byte 씩 읽고
                       read(byte[]); // []의 크기만큼 한번에 읽기
     FileOutputStream : write(byte[] b);  // 전체 쓰기
                        write(write(byte[], inf off, int len);  // off(시작점), len(길이)
 */
package o227;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;
public class Test05_FileInOutClass {
	public static void main(String[] args) throws Exception {	
	// FileInputStream의 예외를 처리하기 위해 thorwos Exception문 추가

//1) FileInputStream		
// 1. 파일 읽기
	FileInputStream fis = new FileInputStream("C:/temp/data1.txt");	// FileInputStream(읽기)
	// FileOutputStream fis = new FileOutputStream("C:/temp/data1.txt") (쓰기)
// 2. 파일 처리	
	int ch;
	while ((ch = fis.read()) != -1)	// 파일에서 문자 하나를 read() 읽어오기, 끝인경우 -1 반환
		System.out.print((char) ch);	// 문자 출력	
										// File Read Sampleìëë¤(1byte씩 읽어서 2byte 한글 깨짐)
// 3. 파일 닫기
	fis.close();
	System.out.println();
//------------------------------------------------------------------------------------------
// 1. 파일 읽기
	FileInputStream fis1 = new FileInputStream("c:/temp/data1.txt");
// 2. 파일 처리		
	int ch1;
	byte[] bt = new byte[1024];	// 1024 크기의 byte 배열 생성
	int i = 0;					// 배열 첨자용 i(증감 용)
	while ((ch1 = fis1.read()) != -1) {	// 파일에서 문자 하나를 read() 읽어오기, 끝인경우 -1 반환
		bt[i] = (byte) ch1;				// 읽어온 1바이트를 배열에 저장
		i++;	
	}
	System.out.println(new String(bt));	// byte 배열 -> String 형식으로 출력
// 3. 파일 닫기	
	fis1.close();	
	
//------------------------------------------------------------------------------------------
//1) FileOutputStream		
// 1. 파일 쓰기
	FileOutputStream fos = new FileOutputStream("C:/temp/data3.txt");
	int ch2;
	
	System.out.println("기록할 문자를 입력하시오 : ");
	while ((ch2 = System.in.read()) != 13)	// 아스키 코드 값(13) 입력할때까지 키보드에서
								// 문자 하나를 read()한다.
		fos.write((byte) ch2);				// 입력한 문자를 파일에 기록
	fos.close();							// 파일 닫기
//------------------------------------------------------------------------------------------
// 1. 파일 쓰기(파일에 한 줄 씩 작성)
	Scanner sc = new Scanner(System.in);	// Scanner
	FileWriter fw = new FileWriter("C:/temp/data4.txt");	// FileWriter 형식으로 fw 변수
	String str;

	while (!(str = sc.nextLine()).equals(""))	// 입력한 행이 비어 있는 행이 아니면 11행을 처리. enter는 종료
		fw.write(str + "\r\n");	// 입력한 문자열과 "\r\n"을 붙임

	fw.close();
	sc.close();
	}
}
