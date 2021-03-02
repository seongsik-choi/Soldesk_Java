/*
 * Test04_Scanner 입력
- s.netx(); // 한 단어를 입력
- s.nextLine(); // 한 줄을 입력
- System.in.read() // 문자 1개를 입력받음(한글 No)
 문) 사용자 이름을 등록해 놓고, scanner로 등록된 이름 외 다른 이름 입력시 예외처리하는 문제
 */
package other2;
import java.io.IOException;
import java.util.Scanner;
public class Test04_ScannerTry {
	public static void main(String[] args) {
	String userName = "hanbit";	// 사용자 이름을 고정
	String input = "";			// 입력받을 input 변수 지정.
	int key;
	try {		// 예외처리
		System.out.print("이름 ==> ");
		while ((key = System.in.read()) != 13) { 	// 입력한 key가 Enter(Ascii 13)이 아니면 무한
			input += Character.toString((char)key); // 정수형key를 문자열로 뱐걍해 input에 증가
		}
		if (userName.equals(input))
			System.out.println(input + "님 어서오세요 ~~");
		else
			System.out.println(input + "님 등록이 안되었습니다 ~~");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
