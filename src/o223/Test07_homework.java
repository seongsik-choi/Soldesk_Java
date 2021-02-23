/*
	 * 1) aver의 평균(87.2) 구하기
	 *    85-87.2  = -2.2
	 *    90-87.2  = 2.8
	 *    93-87.2  = 5.8
	 *    86-87.2 = -1.2
	 *    82-87.2  =  -5.2
	 *    
	 * 2) 평균(87.2)과 차이값을 전부 양수로 바꾼다 -> 편차
	 *  2.2 	2.8		5.8		1.2		5.2
	 *  
	 * 3) 표준편차 : 편차의 평균(편차/5)
	 */   
package o223;
public class Test07_homework {
	// 과제) 표준편차 구하기
	public static void sd(int[] a) {
		double[] sum = new double[5];		// 각 배열값 -87.2를 저장할 sum[] 배열 생성
		for(int i=0; i<a.length; i++) {
			sum[i] = sum[i] + Math.abs(a[i] - 87.2);	// sum[i] 배열에 a[i]배열-87.2 계산 후 절대값 취한 값을 저장 
			System.out.printf(a[i]+"-87.2 = Math.abs(%.1f) \n", sum[i]); 
		} System.out.println(); 	// 한칸
		
		double sum1 = 0; 					// 배열 자료들의 덧셈   
		for (int i = 0; i < sum.length; i++) {
            //System.out.println(sum[i]);
            sum1 += sum[i];					// 배열자료들의 값들을 sum1 변수에 저장
        } System.out.printf("편차들의 합은 : %.1f \n", sum1);	// 편차들의 합 출력
        double sum2 = sum1/5;								// 편차를 5로 /
        System.out.printf("표준편차 : %.1f / 5 = %.1f", sum1, sum2);	// 출력
	}	
	
	public static void main(String[] args) {
	int[] aver = {85, 90, 93, 86, 82};
	sd(aver);

}
}
