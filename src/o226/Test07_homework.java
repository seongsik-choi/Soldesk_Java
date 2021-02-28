/*
 * Test07_homework
 * 문제1) 다중 상속(interface와 Abstract class)
 */
package o226;

import java.util.Scanner;

// 문제1)
interface Mammal  { // 포유류
	abstract void bear();}  // 새끼를 낳음 

abstract class Fish { // 어류
	void swim() {
		System.out.println("물고기는 헤엄치며 움직입니다.");}}

class Whale extends Fish implements Mammal {	// 추상클래스(Fish)와 interface(Mammal)를 다중 상속
	public void bear() {	// // Alt + Shift + enter로 생성된 메서드(interface의 메서드)를 구현 필요
		System.out.println("고래는 새끼를 낳습니다.");
	}
}

public class Test07_homework {
public static void main(String[] args) {
	// 문제1) main
	Whale whale1 = new Whale();	
	whale1.swim();	whale1.bear();
	System.out.println();
	
	// 문제2) 대소문자 구분하여 출력하기(Character Class 사용)
	String str = "Gone With The Wind";
	char[] arrChar = str.toCharArray();	// 입력받은 문자열을 문자형 배열에 대입
	int len = arrChar.length;
	for(int i=0; i<len; i++){
		if(Character.isUpperCase(arrChar[i]) == true) 				// 1) 문자의 경우 
			System.out.print(Character.toLowerCase(arrChar[i]));	// A) 소문자로 변환
		else if(Character.isUpperCase(arrChar[i]) == false) 		// 1) 대문자가 아닌 경우(소문자의 경우)
			System.out.print(Character.toUpperCase(arrChar[i]));	// A) 대문자로 변경
	}System.out.println();
	
	// 문제3) 이메일 주소에 @문자가 있으면 @글자 기준으로 분리해서 출력, @문자 없다면 이메일 주소 틀림을 출력
	String email = "tonny1225@naver.com";

	if(email.indexOf("@")!=-1){	// indexOf("@")가 -1이 아니라면, 문자열이 @문자가 존재
		String[] em = email.split("@");	// String 배열 em에 "@"을 기준으로 썰은 문자열을 배열의 원소로 넣는
		for(int k =0; k<em.length; k++){
			System.out.println(em[k]);
		}		
	}else{
		System.out.println("이메일주소 틀림");					
	}System.out.println();
	
	// 다른 풀이)
	int pos=email.indexOf("@"); //lastIndexOf도 있음 알아서 찾기
	System.out.println("@이의 위치는 : "+pos); //9번째에 @가 있다.
		
	if(pos==-1){ //해당 문자열이 전체 문자열 중에 있나 판별
		System.out.println("이메일주소 틀림");
		} else {
		System.out.println("이메일주소 맞음");
		String id = email.substring(0,pos);
		String server = email.substring(pos+1);
		System.out.println(id+","+server);
	} System.out.println();
	
	// 문제4) 2) 주민번호를 이용해서 아래와 같이 출력하시오
	/*
	생년월일 : 2015년 12월 30일
	성별: 여자
	나이: 4
	주민번호 각 숫자의 전체 합 : 37
	 */
     String jungmin = "1512304123456";
   
     //생년월일(주민번호숫자를 substring(a,a+1)로 한글자씩 잘라서 가져와 참조형인 String을 Integer.parseInt로 변환)
     String year = 20+(jungmin.substring(0,2));
     String month = jungmin.substring(2,4);
     String date = jungmin.substring(4,6);
     		
     //성별코드 가져와서 정수형변환
     int code = Integer.parseInt(jungmin.substring(6,7));
     		
     //주민번호에서 생년월일 가져오기
     int myYear = Integer.parseInt(jungmin.substring(0,2));
     int myMonth = Integer.parseInt(jungmin.substring(2,4));
     int myDate = Integer.parseInt(jungmin.substring(4,6));
     		
     //태어난 년도 완성하기
     switch(code){
     case 1:
     case 2: myYear = myYear+1900; break;
     case 3:
     case 4: myYear = myYear+2000; break;
     }
     		
     //성별출력하기
     String gender = "";
     switch(code%2){
     case 0 : gender ="여자"; break;
     case 1 : gender ="남자"; break;
     }
     		
     //나이 출력하기
     int myAge = 2019-myYear;
     						
     System.out.println("생년월일: "+myYear+"년 "+myMonth+"월 "+myDate+"일");
     System.out.println("성별: "+gender);
     System.out.println("나이: "+myAge);

     //주민등록번호 숫자 합
     int hap = 0;
     for(int a =0; a<jungmin.length(); a++){
     	hap = hap+Integer.parseInt(jungmin.substring(a,a+1));
     }
     System.out.println("주민등록번호 숫자의 합은: "+hap);
     System.out.println();
    
     // 문제5)
     /*
      * 파일이 이미지 파일(.gif .jpg .png)인지 확인하시오.
      * 출력결과:
     	파일명: sky
     	확장명 : .png
     	맞으면: "파일이 전송되었습니다."
     	틀리면: "파일을 다시 선택해주세요"
      */
   //1) filename 맨 끝의 파일명을 가져오기.
     String filename="C:/Users/tonny/a.png";
     System.out.println(filename.indexOf("/")); 	// 2가 나옴.
     System.out.println(filename.substring(15)); 	// a.png가 나옴.
     System.out.println(filename.lastIndexOf("/")); // 14(a.png 앞)
     		
     // a.png 잘라오기
     int pos2 = filename.lastIndexOf("/");	//  pos2로 마지막 "/"위치값
     filename = filename.substring(pos2+1); //  filename.substring(pos2+1) pos이후의 문자열을 담는다
     System.out.println(filename);
     		
     //2) 파일의 확장자만 가져오기.		
     int dot = filename.indexOf(".");	//  int dot으로 filename에서 "."의 위치값을 담는다
     System.out.println(dot); // .의 위치는 3
     String ext = filename.substring(dot+1); //  pos2로 substring 썼던 방식으로 확장자만 잘라내서 ext에 넣어준다.	 
     System.out.println(ext); 				//png만 잘라오게 되었다.
     		
     //3) .gif .jpg .png 중 하나인지 확인하기.
     //확장자 대,소문자를 한꺼번에 처리해야하는 경우가 있음.
     //확장자를 전부 소문자로 바꾼 다음 || 연산자로 확인하기.
     ext = ext.toLowerCase();
     if(ext.equals("png")||ext.equals("jpg")||ext.equals("gif")){ //String 비교는 equals를 많이 쓴다.
     	System.out.println("파일명은: " + filename);
     	System.out.println("확장명 : "+ ext);
     	System.out.println("파일이 전송되었습니다.");
     }else {
     	System.out.println("파일을 다시 전송해주세요.");
     }
}
}
