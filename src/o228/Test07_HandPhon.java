package o228;
import java.io.*;
import java.util.Scanner;
/*
 * Test07_친구 연락처 관리 프로그램
 * 1. 파일처리를 위한 : FileReader, FileWriter, BufferedReader, BufferedWriter class
 * 2. method(메뉴화면) -> method(연락처 출력(view_juso()), 연락처 입력(add_juso()), 연락처 삭제(delete_juso())) 
 * 3. main : while 문 -> 종료 메소드 선택 시까지 loop -> 다른 메소드 호출시 동작(switch~case)
 */
public class Test07_HandPhon {
	
static String fname = "c:\\temp\\juso.txt";	// 연락처를 저장할 dic 경로
//연락처 클래스 지정(static)
	static class address {	
		String name;
		String age;
		String phone;
		String depart;
		String birth;
		address(String name, String age, String phone, String depart, String birth) {	
			// 매개변수 생성자(이름, 나이, 핸드폰번호, 학과, 생일)
			this.name = name;
			this.age = age;
			this.phone = phone;
			this.depart = depart;
			this.birth = birth;
		}
}
// main
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String select = "";			// 사용자가 선택한 번호를 저장하기 위한 변수(종료.4가 아닌 아무 값이나 가능)
		System.out.printf("\n### 친구 연락처 관리 프로그램 ###\n");
		while (select != "4") {	// 사용자 입력(종료.4가 아닌동안 반복)
			print_menu();		// 0) 사용자의 선택을 위한 메뉴 출력(print_menu) 호출
			select = sc.next();	// 1~4의 입력 값을 받음

			switch (select) {	// 입력값을 기준으로 함수 호출
			case "1":			
				view_juso();	// 1) 연락처 파일에서 기존 입력된 내용을 읽어서 출력(view_juso)
				break;
			case "2":
				add_juso();		// 2) 친구 연락처를 추가(add_juso)
				break;
			case "3":
				delete_juso();	// 3) 연락처 파일에서 선택한 연락처를 제거(delete_juso)
				break;
			case "4":			// 4) 종료
				return;
			default:
				System.out.printf("\n 잘못 입력했어요. 다시 선택하세요.\n");
			}
		}
	}

// 0) 사용자의 선택을 위한 메뉴 출력(print_menu)
	static void print_menu() {
		System.out.printf("\n");
		System.out.printf("1. 연락처 출력 \n");
		System.out.printf("2. 연락처 등록 \n");
		System.out.printf("3. 연락처 삭제 \n");
		System.out.printf("4. 끝내기 \n");
		System.out.printf("숫자를 입력하시오 :");
}

// 1) 연락처 파일에서 기존 입력된 내용을 읽어서 출력(view_juso)
	static void view_juso() throws IOException {	// 파일 관련 예외처리를 위한 IOException 추가
		String str = "";

		// 처음에 fname 파일이 없으면 빈 파일 생성
		File f = new File(fname);	
		if (!f.exists()) {	
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname));	// 파일이 없다면 생성(쓰기용)
			bw.close();
		}

		BufferedReader br = new BufferedReader(new FileReader(fname));	// 파일을 읽기용으로 열고 닫음
		int i;

		// 기존의 연락처를 모두 읽어서 출력
		for (i = 1;; i++) // i는 계속 1씩 증가하는 무한루프
		{
			if (!br.ready()) // 파일이 읽을 수 없으면
				break;
			else {
				str = br.readLine();
				System.out.printf("%2d:  %s\n", i, str); // 연락처의 순번(i)와 내용을 함게 출력
			}
		}
		// i가 1이면 실제 파일에는 내용이 없음
		if (i == 1)
			System.out.printf("\n ** 연락처 파일에 전화번호가 하나도 없어요. **\n");

		br.close();
}

// 2) 친구 연락처를 추가(add_juso)
	static void add_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		address adr = new address("", "", "", "", "");  // 주소를 입력받기 위한 adr Instance 선언후 초기화

		String wstr = "";

		// 파일을 추가 모드로 열기
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));	// FileWriter(파일명, true) 형식

		System.out.printf("이름을 입력 ==> ");	// adr Instance 변수에 입력
		adr.name = sc.nextLine();
		System.out.printf("나이를 입력 ==> ");
		adr.age = sc.nextLine();
		System.out.printf("전화번호를 입력 ==> ");
		adr.phone = sc.nextLine();
		System.out.printf("학과를 입력 ==> ");
		adr.depart = sc.nextLine();
		System.out.printf("생일을 입력 ==> ");
		adr.birth = sc.nextLine();

		// 입력된 5개의 값을 하나의 문자열로 만듦
		wstr = adr.name + "\t" + adr.age + "\t" + adr.phone + "\t" + adr.depart + "\t" + adr.birth;

		bw.write(wstr); // 파일에 문자열 쓰기
		bw.newLine();
		bw.close();
}

// 3) 연락처 파일에서 선택한 연락처를 제거(delete_juso)
	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		// 연락처 파일의 내용 전체를 저장하기 위한 문자열 배열
		String[] read_str = new String[50]; // 최대 연락처 개수를 50개로 가정
		String str = "";
		int del_line, i, count = 0;

		BufferedReader br = new BufferedReader(new FileReader(fname));

		// 연락처 파일이 없으면 돌아간다.
		if (!br.ready()) {
			System.out.printf("\n!! 연락처 파일이 없습니다. !!\n");
			return;
		}
		System.out.printf("\n삭제할 행 번호는 ? ");
		del_line = sc.nextInt();

		for (i = 0; i < 50; i++) // 파일에 있는 동안에 수행, 단 최대 50개
		{
			if ((str = br.readLine()) == null)
				break;

			if (i + 1 != del_line) // 삭제하는 행이 아니라면, 추가
			{
				read_str[count] = str;
				count++;
			} else
				System.out.printf("%d 행이 삭제되었습니다. \n", del_line);
		}
		br.close();

// 파일을 쓰기 모드로 열고, 새로운 내용을 쓴다.
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));	// 쓰기용으로 열면 파일의 기존내용 전부 삭제

		for (i = 0; i < count; i++) { // 읽은 개수 만큼 새로 기록
			bw.write(read_str[i]);
			bw.newLine();
		}

		bw.close();
	}

}