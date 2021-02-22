package o219;

import java.util.Scanner;

public class Test08_homework {
	public static void main(String[] args) {
		
	//문1) 두 수 사이의 합을 구하시오.(2+3+4+5) =14
	System.out.println("문1) 두 수 사이의 합을 구하시오.(2+3+4+5) =14");
	int start=2;
	int end=5;
	int cnt = 0; 
	for(start=2; start<=end; start++) {
		cnt =cnt+start;
	} System.out.println(cnt);
	
	// 만약 start가 end보다 큰 경우
	// 두개의 변수값을 서로 교환(swap
	// int tmp = start;
	// start = end;
	// end = tmp;
	
	System.out.println();
	
	//문2) 다음식의 결과를 구하시오.(1~100까지 한번은 더하고 한번은 뺴고) 1-2+3-4+5...100
	System.out.println("문2) 다음식의 결과를 구하시오.(1~100까지 한번은 더하고 한번은 뺴고) 1-2+3-4+5...100");
	int i = 0;
	int cnt2 =0;
	for(i=1; i<101; i++) {
		if(i%2==0) {
			cnt2 = cnt2 -i;
		}
		else if (i%2==1){
			cnt2 = cnt2 + i;
		}
	} System.out.println(cnt2);

	System.out.println();
	
	//문3) 어느 달팽이는 낮에는 3cm올라가고, 밤에는 2.5cm 내려온다고 할때
    //    달팽이가 13cm의 나무 꼭대기에 올라가려면 며칠이 걸리는지 구하시오
	System.out.println("문3) 어느 달팽이는 낮에는 3cm올라가고, 밤에는 2.5cm 내려온다고 할때 "
			+ "달팽이가 13cm의 나무 꼭대기에 올라가려면 며칠이 걸리는지 구하시오");
	double up = 3.0;	// 낮
	double down= -2.5;	// 밤
	double cnt3 = 0;	// cm
	int cnt4 = 1; // 일수
	while(true) {
		cnt3 = cnt3 + up;	
		cnt3 = cnt3 + down;
		cnt4++;		// 일수++ 
		if(cnt3==13) {
			break;
		}
	} System.out.println(cnt4 + "일");
	
	System.out.println();
	
	 //문4) 2g, 3g, 5g짜리 추가 각각 5개씩 있을때
    //    세가지의 추의 조합으로 무게가 40~45사이일 때
    //    각 추의 갯수와 무게를 출력하는 프로그램
    /*	// 2+ 15 + 25 + 42
   
          출력결과
          2g  3g  5g   total
          ------------------
          1개   5   5개   42g ( 2+ 15 +25)
          2개   4   5    41g ( 4+ 12 + 25)
          2개   5   5    44g ( 4 +15 + 24)
    */
	  System.out.println("2g | 3g | 5g | total");
	  System.out.println("--------------------");
	   
	    int sum=0;						// total
	    for(int a=1; a<6; a++){			// 2g짜리 추(a) 총 5개까
	      for(int b=1; b<6; b++){		// 3g짜리 추(b) 총 5개까
	        for(int c=1; c<6; c++) {	// 5g짜리 추(c) 총 5개까
	        	sum = (a*2)+(b*3)+(c*5);	// total(50g) = 5개*2g + 5개*3g + 5개*5g 
	          if(sum>=40 && sum<=45){		// if문 출력(40이상 45이하)
	            System.out.println(a+"개 |"+b+"개 | "+c+"개 |  "+sum+"g");
	          }
	        }
	      }
	    }
	    System.out.println();

	  //문5) 누적의 합을 구하시오
        /*
           출력결과
           1+....+10=55
           1+....+20=210
           1+....+30=

           1+....+90=
           1+....+100=5050          
        */
	System.out.println("문5) 누적의 합을 구하시오");
	System.out.println("출력결과\r\n"
			+ "           1+....+10=55\r\n"
			+ "           1+....+20=210\r\n"
			+ "           1+....+30=\r\n"
			+ "\r\n"
			+ "           1+....+90=\r\n"
			+ "           1+....+100=5050  ");
    
	System.out.println("문제5 누적의 합을 구하기");
	int ii=0;
	int sum2 = 0;
	for(ii=1; ii<101; ii++) {
		sum2=sum2+ii;
		switch(ii) {
		case 10 : System.out.println("1+......+10="+sum2); break;
		case 20 : System.out.println("1+......+20="+sum2); break;
		case 30 : System.out.println("1+......+30="+sum2); break;
		case 40 : System.out.println("1+......+40="+sum2); break;
		case 50 : System.out.println("1+......+50="+sum2); break;
		case 60 : System.out.println("1+......+60="+sum2); break;
		case 70 : System.out.println("1+......+70="+sum2); break;
		case 80 : System.out.println("1+......+80="+sum2); break;
		case 90 : System.out.println("1+......+90="+sum2); break;
		case 100 :System.out.println("1+......+100="+sum2); break;
		}
	}
	
	System.out.println();
	/*
	System.out.println("문제 6 교재) 입력한 두수 사이의 합계를 구하시오. 원하는배수를 선택하여\n "
					+ "합계를 구하는프로그램을 작성(100~200 중에서 4의 배수의 합계를 구할 수 있다.");
	Scanner s = new Scanner(System.in);
	int start1, end1;
	int basu, iii;
	int hap = 0;

	System.out.printf("합계의 시작값 ==> ");
	start1 = s.nextInt();
	System.out.printf("합계의 끝값 ==> ");
	end1 = s.nextInt();
	System.out.printf("배수 ==> ");
	basu = s.nextInt();
	
	iii = start;	// 시작 값을 초기화!! 중요
	while (iii <= end1) {
		if (iii % basu == 0)
			hap = hap + iii;

		iii++;
	}
	System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d입니다.\n\n", start1, end1, basu, hap);
	s.close();

	
	System.out.println("문제 7 교재) 입력하 문자열의 대문자와 소문자, 숫자가 각각 몇개인지\n"
			+ "세는 프로그램을 작성. 그 외 특수 기호 등의 문자는 무시");
	Scanner sc = new Scanner(System.in);
	String str;	char ch; // 문자열(str), 문자형(ch) 초기화
	int upper_cnt = 0, lower_cnt = 0, digit_cnt = 0;	// 대 소 숫 초기화
	int iiii=0; // 추출할 문자의 위치를 알려주는 변수

	System.out.printf("문자열을 입력 : ");
	str = sc.nextLine();	// 문자열 입력 받음

	do { 
		ch = str.charAt(iiii); // 문자열에서 한 글자 추출(문자열의 개수만큼 반복)
		if (ch >= 'A' && ch <= 'Z')	// 추출할 문자가 A~Z이면
			upper_cnt++;			// 대문자의 수 1증가
		if (ch >= 'a' && ch <= 'z')	// 소문자
			lower_cnt++;			// 소문자의 수 1증가
		if (ch >= '0' && ch <= '9')	// 숫자
			digit_cnt++;			// 숫자의 수 1증가
		
		iiii++;	// 문자 위치 1증가			
	} while (iiii < str.length()); // 문자열의 개수가보다 1작을때까지 반복
									// ex str="가나 다"인경우 str.length() = 4 
	System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개입니다.\n", upper_cnt, lower_cnt, digit_cnt);
	sc.close();
	*/
	
	System.out.println("0~9중에서 입력한 숫자만큼 별표를 출력하는 프로그램을 작성.예를들어\n"
			+ "5914를 입력하면 각줄에 별을  5개 9개 1개 4개를 출력");
	Scanner s = new Scanner(System.in);
	String str;
	char ch;
	int iiii, k;
	int star;

	System.out.printf("숫자를 여러 개 입력 : ");
	str = s.nextLine();

	iiii = 0;
	ch = str.charAt(iiii);
	while (true) {
		star = (int) ch - 48;

		for (k = 0; k < star; k++)
			System.out.printf("*");
		System.out.printf("\n");

		if (++iiii > str.length() - 1)
			break;
		ch = str.charAt(iiii);
	}
	}
}
