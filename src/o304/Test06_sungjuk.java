/*
 * Test06_sungjuk
 * 문제) sungjuk.txt 저장 후, 결과파일 result.txt file 만들기
   - 성적프로그램
   -> 성적 결과 파일 완성하기
	1) 입력 파일	  : sungjuk.txt
	2) 출력 결과 파일 : result.txt
	             ---------------------------------------------------
                 이름   국어     영어    수학    평균 등수      결과
                 ---------------------------------------------------
                 무궁화 100  100  100  100  1    합격   ********** 장학생
                 홍길동  20   50   30   33  5    불합격  ***
                 개나리  90   95   90   91  2    합격   *********
                 진달래  70   80   60   70  4    합격   *******
                 라일락  35  100  100   78  3    재시험  *******
                 ---------------------------------------------------
 */
package o304;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class Test06_sungjuk {
public static void main(String[] args){
 // file 읽어오기
	String inName  = "C:/temp/sungjuk.txt";	// file 이름 가져오기
	String outName = "C:/temp/result.txt"; // file 내보내기
	
	try {
// sungjuk 파일 저장하기
		FileWriter fw1 = new FileWriter(inName);	  	// FileWriter 형식으로 fw 변수
														// autoFlush : true -> 버퍼 클리어 
		PrintWriter out = new PrintWriter(fw1, true); 	// PrintWriter(File, ture(append) or false(overwriter)
			out.println("무궁화,45,60,100");
			out.println("개나리,95,50,90");
			out.println("진달래,34,25,70");
			out.println("최성식,100,100,100");
			out.println("라일락,25,20,20");
		System.out.println("sunjuk.txt데이터 파일 완성!!");
		
//1) 데이터를 저장할 배열 변수와, 등수 변수, ★표시를 위한 정수형 변수
				String name[] = new String[5];	
				int[] kor = new int[5];	int[] eng = new int[5];	int[] mat = new int[5];	int[] avg = new int[5];
				int[] rank = {1,1,1,1,1};	
				int size = name.length;	

// 2) sungjuk.txt 파일 Read			
				FileReader in = new FileReader(inName);		// FileReader 클래스의 (fr 변수 <- sungjuk.txt 파일)
				BufferedReader br = new BufferedReader(in); // txt파일에서 cursor역할, 내용 읽기
				
// 3) readLine()함수를 이용해 sungjuk.txt 자르기
//    ',' 기준 잘라서 1)번의 배열 변수에 저장
				int i =0; 			// 1행 기준
				String line = "";  // line 변수 초기호
					
// 4) readLine()
				while(true){				
					line = br.readLine();	// readLine()으로 읽고
					if(line==null) break;	// line이 끝나면 loop 종료
						
// 5) StringTokenizer class를 이용해 line에서 ',' 분리
				StringTokenizer st = new StringTokenizer(line,",");
					
// 6) hasMoreElements()를 이용해 
					while(st.hasMoreElements()){
					// 행 단위로 반복
						name[i] = st.nextToken();
						kor[i] = Integer.parseInt(st.nextToken());
						eng[i] = Integer.parseInt(st.nextToken());
						mat[i] = Integer.parseInt(st.nextToken());					
					}
					i++; // 다음 행
					}
				
// 7) avg 구하고 -> rank에 적용
// int size = name.length;	
				for(int idx=0; idx<size; idx++){
					avg[idx]=(kor[idx]+eng[idx]+mat[idx])/3;
				}					
					
				for(int a=0; a<size; a++){
					for(int b=0; b<size; b++){
						if(avg[a] < avg[b]){
							rank[a] = rank[a]+1;
						}
					}
				}
					
// 8) result.txt파일 write
				FileWriter result = new FileWriter(outName); 	
				PrintWriter output = new PrintWriter(result, true); // autoFlush : true 버퍼 클리어
    
				output.println("-------------------------- 성적결과 --------------------------");
				output.println("-----------------------------------------------------------");
				output.println("이름       국어  영어  수학  평균  등수");
				output.println("-----------------------------------------------------------");
					
				for(int idx=0; idx<size; idx++){	
					output.printf("%-6s %5d %5d %5d %5d %3d %s",name[idx],kor[idx],eng[idx],mat[idx],avg[idx],rank[idx],"등 ");	
					if(avg[idx]>=70){	// 결과의 합격, 불합격, 재시험 분류
						if(kor[idx]<40 || eng[idx]<40 || mat[idx]<40 ){
							output.print("재시험 ");		
						} else {
							output.print("합  격 ");
						}
					}else {
						output.print("불합격 ");			
					}
					
					for(int star=1; star<=avg[idx]/10; star++){ // ★표시를 위한 정수형 변수
						output.print("★");}
						
					
					if(avg[idx]>=95){	//장학생여부 avg 변수 기준 
						output.print("장학생");}
						
					output.println();} // 개행
					
// 9) 자원 반납
					in.close(); br.close();	fw1.close();
	
				}catch (Exception e) {
					System.out.println("File Read fail.. : "+e);
				}finally {
					System.out.println("--finally--");
				}System.out.println("Exception end");
	}// main() end
}
