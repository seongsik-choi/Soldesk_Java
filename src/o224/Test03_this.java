package o224;
class Score { // OuterClass 생성 	
	/*
	 * Test03_this
	 * this 키워드 : 현재 객체를 가리킬때 this 사용
	 * this와 this()
	 * this : 클래스 자신을 가리키는 대명사 / 일반 지역변수와 멤버변수 구분
	 * this() : 생성자 함수 간의 호출
	 */
	// 멤버변수 field
	private String name="최성식";
	private int kor;	private int mat;
	private int	eng;  	private int aver;
	
	// 생성자 함수(Constructor)
	// 기본 생성자 함수는 Overloading 시 자동생성 No 
	// So 기본 생성자 함수는 수동으로 생성할 것을 강추
	public Score() {}
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.aver=(kor+eng+mat)/3;
	} // end
	
	public void disp() {	// 지역변수 > 멤버변수의 우선순위!!!
		String name="오";	// 지역변수 name;
							// 위의 메버변수들은 Score Class 내부에서만 사용가능
							// - 우선순위 : 멤버변수 < 지역변수(local)
		System.out.print(this.name);			// this.name(멤버)	"최성식" 출력
		System.out.println(this.name = name);	// this.name(멤버) = name(지역) "오" 출력
		System.out.println(aver);
	} // disp() end

}
public class Test03_this {
	public static void main(String[] args) {
	
	// Outer Class(Score Class)
		
	Score sc1 = new Score();
	sc1.disp();		
	// 최성식		오		0    출력
	System.out.println();
	
	Score sc2 = new Score("오오",100,200,300);
	sc2.disp();		
	// 오오	   오		200		출력	
	System.out.println();
//--------------------------------------------------------------------------------------	
	
	/*
	Score kim = new Score("개나리",300,300,300);
	Score lee = new Score("진달래",200,200,200);
	Score park = new Score("라일락",100,100,100);
	*/
	// 객체[] 배열로 한번에 선언 가능
	Score[]	score = {
			new Score("개나리",300,300,300),
			new Score("진달래",200,200,200),
			new Score("라일락",100,100,100)};
	int size = score.length;	// 3
	score[0].disp();
	score[1].disp();
	score[2].disp();
	
	}
}
