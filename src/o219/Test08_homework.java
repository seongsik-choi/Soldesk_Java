package o219;
public class Test08_homework {
	public static void main(String[] args) {

	//문) 두 수 사이의 합을 구하시오.(2+3+4+5) =14
	System.out.println("문1) 두 수 사이의 합을 구하시오.(2+3+4+5) =14");
	int start=2;
	int end=5;
	int cnt = 0; 
	for(start=2; start<=end; start++) {
		cnt =cnt+start;
	} System.out.println(cnt);
	
	System.out.println();
	
	//문) 다음식의 결과를 구하시오.(1~100까지 한번은 더하고 한번은 뺴고) 1-2+3-4+5...100
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
	System.out.println("문3) 어느 달팽이는 낮에는 3cm올라가고, 밤에는 2.5cm 내려온다고 할때");
	System.out.println("달팽이가 13cm의 나무 꼭대기에 올라가려면 며칠이 걸리는지 구하시오");
	double up = 3.0;
	double down= -2.5;
	double cnt3 = 0;	// 길이
	int cnt4 = 1; // 횟수
	while(true) {
		cnt3 = cnt3 + up;
		cnt3 = cnt3 + down;
		cnt4++;
		if(cnt3>12) {
			
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
	          if(sum>=40 && sum<=45){		// if문 출력
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
	
	
	
	
	}
}
