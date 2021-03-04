/*
 * Test04_FileInputStream, FileOutputStream(입력과 출력)
 * 1. 입/출력 : 다른 곳의 데이터를 가져오는것(입력) / 다른 곳으로 내보내기(출력)
   - 스트림(stream) : 입/출력 연결
   - 입/출력 기본 클래스 : 1byte 단위로 데이터를 전송하는 InputStream,OutputStream
   
   InputStream <-> OutputStream
   - FileInputStream : read();  // 1byte 씩 읽고
                       read(byte[]); // []의 크기만큼 한번에 읽기
   - FileOutputStream : write(byte[] b);  // 전체 쓰기
                        write(write(byte[], inf off, int len);  // off(시작점), len(길이)
 */
package o304;
import java.io.FileInputStream;
import java.io.FileReader;
public class Test04_FileInputStream {
public static void main(String[] args) throws Exception {	// FileInputStream의 예외를 처리하기 위해 thorwos Exception문 추가
// ▷ FileInputStream : read();  // 1byte 씩 읽고 -> 2bte(한글) 깨짐
// 1) 메모장 파일 내용 읽기(.java)
	FileInputStream fis = new FileInputStream("C:/Temp/hello1.java");	// FileInputStream(읽기)
	// FileOutputStream fis = new FileOutputStream("C:/temp/data1.txt") (쓰기)
	try {
		
// 2. 파일 처리 : read();  // 1byte 씩 읽고 -> 2bte(한글) 깨짐
		int ch;								// 정수형 문자 ch 지정
		while ((ch = fis.read()) != -1)		// 파일에서 문자 하나를 read() 읽어오기, 끝인경우 -1 반환
			System.out.print((char) ch);	// 문자 출력	
											// File Read Sampleìëë¤(1byte씩 읽어서 2byte 한글 깨짐)		
		
// 2. 파일처리	:  read(byte[]); // []의 크기만큼 한번에 읽기
		int ch1;
		byte[] bt = new byte[1024];	// 1024 크기의 byte 배열 생성
		int i = 0;					// 배열 첨자용 i(증감 용)
		while ((ch1 = fis.read()) != -1) {	// 파일에서 문자 하나를 read() 읽어오기, 끝인경우 -1 반환
			bt[i] = (byte) ch1;				// 읽어온 1바이트를 배열에 저장
			i++;	
		}System.out.println(new String(bt));	// byte 배열 -> String 형식으로 출력
	
// 2. 파일처리 : FileReader : char(2byte) 기반 -> 한글 안깨짐
		FileReader fr = new FileReader("C:/Temp/hello1.java");
		while(true) {
			int data = fr.read();
			if(data==-1) {
				break;
			}System.out.printf("%c", data);
		}fr.close();
			
// 3) 파일 오류시 처리											
	}catch(Exception e) {
		System.out.println("File Read fail.. : "+e);
// 5) 자원 반납	
	}finally {
		try {		
			if(fis!=null) {fis.close();}			// 
		}catch(Exception e) {e.printStackTrace();}	// 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
	}System.out.println("\nException end");
	
}//main() end
}
