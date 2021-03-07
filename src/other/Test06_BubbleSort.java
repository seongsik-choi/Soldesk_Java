/*
 * Test06_버블 정렬
 */
package other;
public class Test06_BubbleSort {
public static void main(String[] args) {
	Integer s[] = { 4, 3, 1, 7, 9 };  // 정수형 배열 5새 선언
	Integer maxVal, minVal;				// 최대값, 최소값을 저장할 변수
	int i, k;							// 반복문 변수
	int count = 0;						// 정렬 횟수 변수
	boolean changeYN = false;			// 값의 교환 횟수 변수

	System.out.print("정렬 전 ==> ");		// 정렬 전의 값 출력
	for (i = 0; i < 5; i++)
		System.out.print(s[i] + "  ");

	for (i = 0; i < 4; i++) {
		count++;						// 정렬 횟수 count
		for (k = 0; k < 4 - i; k++) {
			if (s[k] > s[k + 1]) {		// 정렬로 인해 값의 변경 시
				changeYN = true;		// 값의 교환 횟수 변수 = true로 변경
				maxVal = Math.max(s[k], s[k + 1]);	// 수행(비교)
				minVal = Math.min(s[k], s[k + 1]);	// 수행(비교)
				s[k] = minVal;
				s[k + 1] = maxVal;
				// System.out.print("\n정렬 중 ==> "+s[k] +" "+ s[k+1]+" "+ s[k+2]+" "+ s[k+3]+" "+s[k+4]);			
			}// end if
		}// end for2
		if (changeYN)				// 값의 교환 횟수가 = 0
			changeYN = false;
		else
			break;					// break
	}// end for1

	System.out.print("\n총 회전수 : " + count);	// 총 회전수 출력
	System.out.print("\n정렬 후 ==> ");
	for (i = 0; i < 5; i++)
		System.out.print(s[i] + "  ");
	}
}
