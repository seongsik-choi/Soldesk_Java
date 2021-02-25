/*
 * Test05_weapper(포장) 클래스
 * -> 기본자료형을 참조형화 해놓은 Class 들
 * -> 대부분 java.lang에 선언되어 있음.
 * 
 	1) 기본형 : boolean byte short int long float double char
 	2) Wrapper 클래스(참조형) : 
       Boolean Byte Short Integer Long Float Double Charater
 */
package o225;
import java.lang.*;	// java language(JAVA의 default package)
public class Test05_wrapper {
public static void main(String[] args) {
	boolean boo1 = true;	// 기본형
	Boolean boo2 = new Boolean(true);
	Boolean boo3 = new Boolean("false");
	System.out.println(boo1);
	System.out.println(boo2);
	System.out.println(boo3);
	
	Integer in1 = new Integer(0);
	Integer in2 = new Integer("7");
	Integer in3 = 9;
	System.out.println(in2.doubleValue()); // 7.0
	System.out.println(in2.longValue());	// 7L or 7
	
	System.out.println(Integer.toBinaryString(10)); // 1010
	System.out.println(Integer.toOctalString(10)); // 12
	System.out.println(Integer.toHexString(10)); // a
	
	System.out.println(Integer.max(2,4));  // 4
	System.out.println(Integer.min(2, 0)); // 0
	System.out.println(Integer.sum(2, 4));	// 6
	
	//★★★
	// "123" -> 123
	System.out.println(Integer.parseInt("123"));
	// System.out.println(Integer.parseInt("")); 	  NumberFormatException
	// System.out.println(Integer.parseInt("KOREA")); NumberFormatException
	// System.out.println(Integer.parseInt("123.45"));NumberFormatException
	System.out.println();
	
	long lo1=3L;		System.out.println(lo1);
	Long lo2=new Long(5);	System.out.println(lo2);
	Long lo3 = new Long("7");	System.out.println(lo3);
	Long lo4 = 9L;			System.out.println(lo4);
	
	// 문)
	double dou1 = 1.2;
	Double dou2 = new Double(3.4);
	Double dou3 = new Double("5.6");
	Double dou4 = 7.8;
	System.out.println((int)(dou1 + dou2 + dou3 + dou4));
	dou2.intValue();
	
	char ch1 = 'R';
	Character ch2 = new Character('r');
	Character ch3 = 'A';
	
	System.out.println(Character.isWhitespace(' '));	// blank 여부
	System.out.println(Character.toLowerCase(ch1));		// Lcase
	System.out.println(Character.toUpperCase(ch1));	 	// Ucase
}
}
