/*
 Test04_Collections = 자료형
 - JAVA Collections Framework : 자료를 모아서 저장할 수 있는 클래스 들
 - 배열 : 자료를 여러개 모아놓을 수있음
   int[] num = new int[3];
   int[] num = {1, 2, 3};
   
- interface의 종류(import java.util)
  1) List 계열 : Array와 비슷, 인덱스 이용, 데이터 중복이 가능
 			 List <-구현-> ArrayList,  Vector, , LinkedList	   
  2) Set 계열  : 인덱스 없음,
 			 Set, HashSet ~~
  3) Map 계열  : 인덱스 없음, Key를 이용해 데이터를 관리, key 중복 no, 데이터 중복 가능, key = 유일성
 	         HashMap, Map, HashTable, Properties ~~
  
  interface List{}		// List 계열
  class Vector implements List{}
  class ArrayList implements List{}
 	         
  interface Set{}		// Set 계열
  class HashSet implements Set{}
  
  interface Map{}		// Map 계열
  class HashMap implements Map{}
  
  // interface의 다형성 적용(객체 생성에도 적용)
  Vector vec = new Vector();
  List vec = new Vector(); 		// 다형성(부모<-자식)
  List list = new ArrayList();
  Set set = new HashSet();
  Map map = new HashMap();
 */
package o303;
import java.util.*;
public class Test04_List {
public static void main(String[] args) {
// 1) List 계열 : Array와 비슷, 인덱스 이용, 데이터 중복이 가능
	Vector vec = new Vector();
	vec.add(3);		// 권고. <>generic 사용 
	vec.add(2.5);
	vec.add('R');
	vec.add("KOREA");
	System.out.println("vec.size() : "+vec.size());	// 4
	for(int i=0; i<vec.size(); i++) {
		System.out.print(vec.get(i)+"\t");	// i번째 요소 가져오기
	}System.out.println();
	
// 1) List 계열(다형성)	+ generic(generic을 사용해 Type 고정)
	List<String> listt = new ArrayList<String>(); // 다형성(부모(List)<-자식(ArrayList))
	listt.add("가");
	listt.add("나");
	// listt 자료들 전부 삭제하기(remove 사용)
	for(int i=listt.size()-1; i>=0; i--) {			// size-1에서 >=0까지
		listt.remove(i);
	}System.out.println(listt.size()); // 1(전부 지워지지않음)
									   // 0번째 인덱스 remove시, 1번째 인덱스 -> 0번째 인덱스
										// 기존 배열 for문 loop시 지워지지 않음(반대로)
	System.out.println("////////////////");		
//제네릭을 사용하지 않을경우
	ArrayList list0 = new ArrayList(); 
	list0.add("test");
	String temp = (String) list0.get(0);  // 타입변환이 필요함

//제네릭을 사용할 경우
	ArrayList<Character> list00 = new ArrayList<Character>();
	list00.add('A');
	list00.add('B');
	Character temp1 = list00.get(0); 				// 타입변환이 필요없음, 0번째 요소 가져오기('A')	
	System.out.println("Character Type list00의 값은 : " + temp1+"\n");

// 1) ArrayList 객체 생성 : 데이터 관리에 사용
    ArrayList<String> list = new ArrayList<String>();	// <type>generic 사용 
    // 데이터 추가
    list.add("Hello");	list.add("JAVA");	list.add("World");
    
    System.out.println("list.size : " + list.size());   // list.size : 3
    System.out.println("list : " +list);    // list : [Hello, JAVA, World]

    list.add(2, "Programming"); // 두번째 인덱스에 "" 넣기
    System.out.println("list : " +list);    // list : [Hello, JAVA, Programming, World]

    list.set(1, "C");   // 데이터 변경
    System.out.println("list : " +list); // list : [Hello, C, Programming, World]

    String str = list.get(2); // 데이터 추출
    System.out.println("list.get(2) : " +str);  // list.get(2) : Programming
    System.out.println("list : " +list);    // list : [Hello, C, Programming, World]

    str = list.remove(2); // 데이터 제거
    System.out.println("list.remove(2) : " +str); // list.remove(2) : Programming
    System.out.println("list : " +list);    // list : [Hello, C, World]

    list.clear(); // 데이터 전체 제거
    System.out.println("list : " +list);    // list : []

    boolean b = list.isEmpty(); // 데이터 유무
    System.out.println("list.isEmpty() : " +b); // list.isEmpty() : true
    System.out.println();
    
// 2. Map 인터페이스 : Key를 이용해 데이터를 관리
// Generic : <Key, Value>
// Key(이름표, 중복 허용 no) / Value(값, 중복 O)
    HashMap<Integer, String> map = new HashMap<Integer, String>();
           // <key값, 데이터 값>
    System.out.println("map.size() : " +map.size()); // map.size() : 0

    // 데이터 추가
    map.put(5, "Hello");
    map.put(6, "JAVA");
    map.put(7, "World");
    System.out.println("map : " +map);      // map : {5=Hello, 6=JAVA, 7=World}
    System.out.println("map.size() : " +map.size());    // map.size() : 3

    // 데이터 교체
    map.put(7, "Area");
    System.out.println("map : " +map);  // map : {5=Hello, 6=JAVA, 7=Area}

    // 데이터 추출
    str = map.get(5); // key값이 5인 데이터 추출
    System.out.println("map.get(5) : " + str);  // map.get(5) : Hello

    // 데이터 제거
    map.remove(8);
    System.out.println("map.remove(8) : " +map);    // map.remove(8) : {5=Hello, 6=JAVA, 7=Area}

    // 특정 데이터 포함 유무
    b = map.containsKey(7); // 7번째 key값의 유무
    System.out.println("map.containsKey(7) : " +b); // map.containsKey(7) : true

    b = map.containsValue("World"); // Key값이 아닌 데이터 값의 유무
    System.out.println("map.containsValue(\"World\") : " +b);   // map.containsValue("World") : false

    // 데이터 전체 제거
    map.clear();
    System.out.println("map : " +map);  // map : {}

    // 데이터 유무
    b = map.isEmpty();
    System.out.println("map.isEmpty() : " +b); // map.isEmpty() : true
    System.out.println();
    
// 3. Set(인덱스 No) : Iterator 클래스 사용
    Set set = new HashSet();
    set.add(3);  // (Obejct e) : 모든 type 허용
    set.add(3.5); set.add("BUSAN"); set.add(new Integer(9)); set.add('r'); 
    System.out.println("set.size() : "+ set.size());
// Index 대신 Cursor를 사용해 데이터 추출
// Cursor : 가리킬 요소가 있으면 true, 없으면 false
// Cursor = Iterator
    Iterator iter = set.iterator(); // intr 변수 <- set 변수
    
    while(iter.hasNext()) {			// 다음으로 가리킬 대상이 있는지 = hasNext()
    	//cursor가 가리키는 요소 가져오기
    	Object obj = iter.next();
    	System.out.println("set변수의 값은 : "+obj);  // r, 3, BUSAN, 9, 3.5가 순서엇이 나옴
	}//while end  
}
}