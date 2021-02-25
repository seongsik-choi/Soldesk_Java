/*
 * Test04_getter & setter
 * setter & getter : 멤버 변수를 외부에서 변경할 수 있도록 하는 메서드
 * 함수명 작성 규칙
   is~~~() 대부분 boolean형으로 반환
   to~~~() to뒤의 갓으로 반환
   get~~~() 대부분 리턴 값이 존재
   set~~~() 원하는 값으로 세팅할 때
  
   getter & setter 함수명 작성 규칙
   -> get, set 멤버 변수의 첫글자 대문자로 바꾼 후 함수명
     ex) getMethod(){}  setMethod(){}
   -> private로 선언된 Member Variable를 
      Method get set을 public으로 선언 해 사용
 */
package o225;
class Bbs{
	private int bbsno; // 글 번호
	private String writer; // 글 작성자
	private String subject; // 글 제목
	
	public Bbs() {} // default
	public Bbs(int bbsno, String writer, String subject) {
		this.bbsno = bbsno;
		this.writer = writer;
		this.subject = subject;
	}
	public void getInfo() {
		System.out.println("--Bbs Class getInfo() method--");
		System.out.println("글 번호 : " +bbsno);
		System.out.println("글 작성자 : " +writer);
		System.out.println("글 제목 : " +subject);
	}
	// setter, getter을 사용해 static으로 선언된 bbsno, writer, subject 변수를 public으로
	// 1) 글번호 bbsno에 대한 get set
	public int getBbsno() {				// getter는 반환형 있게
		return bbsno;
	}
	public void setBbsno(int bbsno) {	// setter는 void형!!!
		this.bbsno = bbsno;
	}
	
	// 2) 글 작성자 writer에 대한 get set
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	// 3) 글 제목 subject에 대한 get set
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}

class Member { // 자동 getters setters 생성
	private int memberno; 	// 일련 번호
	private String id; 		// 아이디
	private String passwd; // 비밀번호
	private String email; //  이메일
	public Member() {}
	// 자동 getter setter 생성
	// -> source -> Generate getters setters
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

public class Test04_getset {
public static void main(String[] args) {
// 1. Bbs Class를 이용한 Test    
    Bbs b = new Bbs(100, "작성자", "제목");
    b.getInfo();
    b.setBbsno(10);
    b.getInfo();
    
    System.out.println();
// 2.     
    
	}
}
