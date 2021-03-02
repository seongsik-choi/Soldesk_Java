/*
 * Test04_private로 선언된 멤버변수 상속받아 사용하기
 */
package o226;
class ParentClass1{
	private String name = "private 최성식";	// 멤버변수(priva
	public ParentClass1() {}	// Constructor

// 부모클래스에서 private으로 선언된 멤버변수 사용하기!!!(getter와 setter로 선언)
// setName에 문자를 넣고, getName() 호출하면 문자를 가져온다는 뜻
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}// class end
public class Test04_PrivateExtends extends ParentClass1 {	// extends
	public Test04_PrivateExtends() {}		// Constructor
	public void set() {
		// name = "private 최성식";		부모클래스의 private로 선언된 name 변수는 사용 no
		// 1) setName method로 문자를 넣어주기
		setName("오");					
	}
public static void main(String[] args) {
	Test04_PrivateExtends m = new Test04_PrivateExtends();
	m.set();								// m.set()메소를 호출
	System.out.println(m.getName());		// m.set()호출한것을 m.getAge()화면에 출력
	}
}
