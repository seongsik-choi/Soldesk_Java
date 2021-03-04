/*
 * Test02_File
 * File I/O의 base
 * - File 클래스 : 파일과 관련된 정보, (파일명, 확장명, 파일타입, 파일크기~~)  
 */
package o304;
import java.io.File;	// File class에 대한 I/O
public class Test02_File {
public static void main(String[] args) {
	try {
	// 1) 경로명 + 파일명
		String fname = "C:/Temp/test1.txt";		// "C:\\temp\\test1.txt";
	// 2) File class에 담기
		File file = new File(fname);			// File class에 불러온 file 변수 in
		if(file.exists()) { 					// exits() : return이 boolean
			System.out.println("파일이 존재합니다.");
			System.out.println("file.getName() : " + file.getName());	//  파일 이름 가져오기
			System.out.println("file.length() : " + file.length());		// 파일 크기
			
			// 문제) file명과 확장자 명을 분리해서 출력하기
			// 출력결과) 파일명 : test1.txt		확장명 : txt
			// 1) 파일명 추출
			 int pos2 = fname.lastIndexOf("/");	//  pos2로 마지막 "/"위치값
			 System.out.println("마지막 \"/\" 위치 : " +pos2);
			 fname = fname.substring(pos2+1); //  fname.substring(pos2+1) pos이후의 문자열을 담는다
		     System.out.println("파일명 : " +fname+"\n");	
		     
		     //2) 파일의 확장자만 가져오기.		
		     int dot = fname.indexOf(".");	//  int dot으로 fname에서 "."의 위치값을 담는다
		     System.out.println("test1.txt에서 \".\"의 위치는 : " +dot); // .의 위치는 5
		     String ext = fname.substring(dot+1); //  pos2로 substring 썼던 방식으로 확장자만 잘라내서 ext에 넣어준다.	 
		     System.out.println("확장명 : " +ext+"\n"); 				//png만 잘라오게 되었다.
		     
		     // 3) 파일 삭제해보기
		     file.delete(); 				// delete() : boolean type
		     
		}else {
			System.out.println("파일이 존재하지 않아요.");
		}//if end
	}catch(Exception e) {						// Exception에 대한 설명
		System.out.println("File class 실패 : "+e);	
	}finally {
		System.out.println("Finally end");
	}System.out.println("Excpetion end");
	
}//main() end
}
