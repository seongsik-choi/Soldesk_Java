/*
 Test02_Collections = 자료형
 - List 계열 : Array와 비슷, 인덱스 이용, 데이터 중복이 가능
   List <-구현-> ArrayList,  Vector, , LinkedList
 - Map 계열 : Key를 이용해 데이터를 관리, key 중복 no, 데이터 중복 가능
   HashMap : key = 유일성
 */
package other2;

import java.util.ArrayList;
import java.util.HashMap;

public class Test02_CollectionsClass {
public static void main(String[] args) {

// 1. ArrayList 객체 생성 : 데이터 관리에 사용
    ArrayList<String> list = new ArrayList<String>();
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
	}
}
