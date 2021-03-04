/*
 * Test03_FileInput
 * ex) 메모장 파일 내용 읽어오기
 * - FileReader(파일 자체 읽기) / 
 * - BufferedReader(cursor역할, 내용 읽기) -> readLine()
 * - finally{자원반납}
 */
package o304;
import java.io.BufferedReader;
import java.io.FileReader;
public class Test03_FileReader {
public static void main(String[] args) {
// 1) 메모장 파일 내용 읽기(.java)
	String filename = "C:/Temp/hello1.java";	// file 이름 가져오기
// 2) 파일을 읽어오기 위한 객체 생성	
	FileReader fr = null;		
	BufferedReader br = null;	// cursor
	
// 1) 파일 가져오기(내용이 아닌 파일 그자체)
	try {
	fr = new FileReader(filename);	// FileReader 클래스의 (fr 변수 <- hell1.java 파일)
// 2) 파일내용 읽기(cursor 필요 = db와 같은 맥락)
	br = new BufferedReader(fr);	// BufferedReader(Reader in) : BufferedReader의 부모는 Reader,  
									// br -> fr 구조의 다형성
//3) 자료 불러오기
	int num = 0;	// 라인별로 행 번호 를출력하기
	while(true) {
		// Enter(\n)를 기준으로 한줄 씩 가져오기
		String line = br.readLine(); // readLine() : 한 줄씩 가져오기
		if(line==null) { // 파일의 끝(End of File)인지?
			break;
		}//if end
		// System.out.println("hello.java file의 내용은 : " +line);	// ▶ 파일 내용 읽기
		System.out.printf("%3d. %s \n", ++num, line);				// ▶ 라인 별로 행번호를 출력하기
	
		// ▶ 2행 마다 밑줄긋기
		if(num%2==0) {
			System.out.println("----------2행이 끝----------");			// 라인 별로 행번호를 출력하기
		}//if end
	}//while end
	
// 4) 파일 오류시 처리
	}catch(Exception e) {
		System.out.println("File Read Fail.. : "+e);
		// Error 시) File Read Fail.. : java.io.FileNotFoundException
// 5) 자원 반납
	}finally {
		// 파일 입출력과 관련된 자원 반납(순서 주의)  
		// FileReader -> BufferedReader 순으로 들어옴, 자원 반납은 Stack(BR -> FR)
		// try{	if(bR이 null이 아닌경우) 자원 반납(); } catch(){}	
		try {		
			if(br!=null) {br.close();}
		}catch(Exception e) {e.printStackTrace();}	// 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
		
		try {
			if(fr!=null) {fr.close();}
		}catch(Exception e) {e.printStackTrace();}
	}System.out.println("Exception end");
	
}//main() end
}
