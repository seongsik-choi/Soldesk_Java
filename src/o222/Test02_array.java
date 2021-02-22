/*
  0222 Test02_ 2차원 배열
  - Array 2차원 배열 : 
  1) [행][열]
 */
package o222;
import java.util.Arrays;
public class Test02_array {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50, 60};
        int[] arr2 = null;  
        int[] arr3 = null;

        System.out.println("arr1.length : " + arr1.length);
        System.out.println("arrays.toString(arr1) : " + Arrays.toString(arr1)); // [10, 20, 30, 40, 50, 60]

        // 배열 요소 복사(주소가 아닌 값만 복사)
        arr3= Arrays.copyOf(arr1, arr1.length); // arr3에 arr의 길이 할당
                                                // 값을 복사하지만 arr1의 메모리 주소와는 다름
        System.out.println("arr3 : " + Arrays.toString(arr3)); // [10, 20, 30, 40, 50, 60]

        // 배열 래퍼런스, 래퍼런스 = 주소 -> 주소를 대입하는것
        arr2 = arr1;
        System.out.println("arr1 : " + arr1); // [I@4e50df2e
        System.out.println("arr2 : " + arr2); // [I@4e50df2e
        System.out.println("arr3 : " + arr3); // [I@1d81eb93

        // 다차원 배열
        int[][] darr1 = new int[2][3];  // 2행 3열 배열 선언
        								// 메모리 24byte(4byte * 6) 
        darr1[0][0] = 10; // 초기화, 나머지 행도[0][0]까지
        darr1[0][1] = 20; // 초기화, 나머지 행도[0][1]까지
        darr1[0][2] = 30; // 초기화, 나머지 행도[0][2]까지
        darr1[1][0] = 40; // 초기화, 나머지 행도[1][1]까지
        darr1[1][1] = 50; // 초기화, 나머지 행도[1][1]까지
        darr1[1][2] = 60; // 초기화, 나머지 행도[1][1]까지]
        System.out.println("darr1.length : " + darr1.length);		// 다차원 배열 길이는 행길이 2
        System.out.println("darr1[0] : " + Arrays.toString(darr1[0])); // darr1[0] : [10, 20, 30]	
        System.out.println("darr1[1] : " + Arrays.toString(darr1[1])); // darr1[0] : [40, 50, 60]
        
        // 반복문을 이용한 일괄처리
        for(int r =0; r<=1; r++) {	// row 부분
        	for(int c=0; c<=2; c++) {
        		System.out.println(darr1[r][c]);	// 배열 요소 출력
        	}	// column end
        }	// row end
        System.out.println();
        
       // 선안과 동시에 초기화 방법 = {{요소값, 요소값} {요소값, 요소값}}
       String[][] str = { {"가","나"},{"다","라"}};	// 2행 2열 
       int[][] darr2 = { {1,2,3},{4,5,6}};	 // 2행 3열
       
       // 2차원 배열에서 각행의 열의 갯수는 달라도 가능
       int [][] mat = {{10, 20}, {20, 30, 40, 50}, {20, 30, 30}}; // 행별로 열의 갯수를 다르게
       for(int r=0; r<mat.length; r++) {	// 행<2차원배열의 길이만큼(3)
    	   for(int c=0; c<mat[r].length; c++) { // 열은<행의 길이 만큼
    		   System.out.println(mat[r][c]);
    	   }
       }
       
	}
}
