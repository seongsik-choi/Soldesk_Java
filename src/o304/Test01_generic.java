/*
 * Test01_Generic
 * 데이터를 수집하는 경우 자료형을 제한 가능.
  <E>		: Element
  <K, V>   : Key, Value
 ex) ArrayList<String> list = new ArrayList<String>();	// <type>generic 사용 
 ex) HashMap<Integer, String> map = new HashMap<Integer, String>();  // <key값, 데이터 값>

  - class, interface에도 Generic 선언이 가능.
 */
package o304;
import java.util.*;
// class의 data 값들을 Generic으로 사용하는 
class Mountain{
	String name;
	int height;
	public Mountain() {}
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	void disp() {
		System.out.println("산이름은 : "+ name + "높이는 : " + height);
	}
}// class end

public class Test01_generic {
	public static void main(String[] args) {
// int Type 데이터만 num 변수에 대입 가능
	int[] num = new int[3];
	
// Generic을 사용한 경우
	Vector<String> vec = new Vector<String>();	// <String> 자료형만 모음
	vec.add("가"); 	// .add(String e) : String으로 generic을 지정했기에 문자열형만 가능
	vec.add("나");	vec.add("다");	vec.add("라");
	// vec.add(2);  Errror. 
		
// Generic을 사용하지 않는 경우와 사용하는 경우 차이
	ArrayList list = new ArrayList(); 	//제네릭을 사용하지 않는경우
	list.add("test");
	String temp = (String) list.get(0); //타입변환이 필요

	ArrayList<String> list2 = new ArrayList<String>(); //제네릭을 사용하는 경우
	list2.add("test");
	temp = list2.get(0); //타입변환이 필요no

// Generic을 사용하는 HashMap
	HashMap<Integer, String> map = new HashMap<Integer, String>();  // <key값, 데이터 값>
	map.put(5, "Hello"); map.put(6, "JAVA");
	// map.put("key값", "Data 값");		Error. Key값이 Integer
	String str = map.get(5); // key값이 5인 데이터 추출
	System.out.println(str);

//---------------------------------------------------------------------------------------
// Mountain class를 이용한 generic
	Mountain one = new Mountain("한라산", 1950);
	Mountain two = new Mountain("관악산", 1989);
	Mountain three = new Mountain("일산", 1996);
	// ex) data 값들이 DB에 저장되어있는 경우
	// one, two, three 객체에 저장되어있는 data값들 한번에 가져와서 전달해줌 
	// 비슷한 맥락으로 ArrayList에 저장해보기
	// 1) Stroe
	ArrayList<Mountain> moun = new ArrayList<Mountain>();
	moun.add(one);	moun.add(two);	moun.add(three); // 문자열형만 저장가능   moun.add("문자열형") Error.
	
	// 2) Open
	for(int i=0; i<moun.size(); i++) {
		Mountain dto = moun.get(i); 	// Mountain 클래스의 dto 변수에 값을 가져옴
		System.out.println(dto.name);
		System.out.println(dto.height);
	}//for end

	}
}
