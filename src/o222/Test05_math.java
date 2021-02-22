/*
 * Test05_ math class
 */
package o222;
public class Test05_math {
	public static void main(String[] args) {
	/*
	 * Math 수학 관련 클래스
	 */
	int[] i = {1,2,3,4};
	System.out.println(Math.abs(-3)); 	// 3
	System.out.println(Math.abs(2.4)); // 2.4
	
	System.out.println(Math.max(i[0], i[2]));	// 3(i[2]
	System.out.println(Math.min(20, 30));	// 20
	
	System.out.println(Math.max(20, Math.max(2, 4))); // 오른쪽 max 함수 계산 후, 왼쪽 max함수와 비교
	
	System.out.println(Math.ceil(1.3)); 	// 소수점 아래 올림 2.0
	System.out.println(Math.floor(1.3));	// 소수점 아래 버림 1.0
	System.out.println(Math.round(1.3));	// 반올림 1
	
	System.out.println(Math.PI);

//-------------------------------------------------------------------------------------
	/* 난수 : random값, 무작위로 발생(JAVA Compiler에 의해)
	 * 난수 발생 범위 : 0.0 <= r < 1.0
	 */
	System.out.println(Math.random());
	System.out.println(Math.random()*3+"\n");
	System.out.println((int)(Math.random()*2));	// 0 or 1
	System.out.println((int)(Math.random()*4)); // 0 1 2 3 
	System.out.println((int)(Math.random()*6)); // 0 1 2 3 4 5
	System.out.println((int)(Math.random()*45)); // 0~45
	

//-------------------------------------------------------------------------------------
	// 문제) 주사위 수의 1~6 발생시키기
	System.out.println((int)(Math.random()*6)+1); // 0 1 2 3 4 5
	
	// 문제) 로또번호 범위
	System.out.print((int)(Math.random()*45)+1 +"\t"); 
	System.out.print((int)(Math.random()*45)+1 +"\t"); 
	System.out.print((int)(Math.random()*45)+1 +"\t"); 
	System.out.print((int)(Math.random()*45)+1 +"\t"); 
	System.out.print((int)(Math.random()*45)+1 +"\t"); 
	System.out.print((int)(Math.random()*45)+1 +"\t"); 
	
	}
}