/*
 * 0219 Test07
 * 이중반복문
 */
package o219;
public class Test07_for {
	public static void main(String[] args) {
	// 이중반복문(for(){ for(){ } }
	for(int a=1; a<3; a++) {
		System.out.println("JAVA");
		for(int b=1; b<4; b++) {
			System.out.println("PYTHON");
		}
	}  // JAVA PYTHON PYTHON PYTHON JAVA PYTHON PYTHON PYTHON
	
	// 구구단 i, j를 사용한 1~9단까지
	 for(int i= 1; i< 10; i++){
		 System.out.println("구구단 " +i+ "단");
		for(int j=1; j<10; j++) {
		 System.out.println(i+"X"+j+"="+(i*j));
		 }
	 }
	
	}
}
