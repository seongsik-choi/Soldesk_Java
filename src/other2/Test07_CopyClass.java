/*
 Test08_CopyClass
 2. 파일복사 : 파일 입/출력 클래스를 이용해서 파일 복사 가능
 */
package other2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
public class Test07_CopyClass {
	public static void main(String[] args) {
		 InputStream inputStream = null;
	        OutputStream outputStream = null;
	        try {   // 네트워크 관련(I/O) 파일은 예외처리 꼭 해주기
	            inputStream = new FileInputStream("C:\\Temp\\hello.txt");
	            outputStream = new FileOutputStream("C:\\Temp\\helloCopy.txt");
	            // hello.txt 파일을 읽고, output을 통해 hellocopy로 복사

	            byte[] arr = new byte[3];   // 3개씩
	            while (true) {       // while문으로 파일 계속 읽어오기
	                int len = inputStream.read(arr);
	                if (len == -1) break;   // 읽을 데이터가 없을때까지
	                outputStream.write(arr, 0, len); // 0부터 문자 전부
	            }
	        }catch (Exception e){
	            e.printStackTrace();
	        }finally {
	            if(inputStream != null){
	                try {
	                    inputStream.close();
	                }catch (Exception e){e.printStackTrace();}
	            }
	            if (outputStream != null){
	                try{
	                    outputStream.close();
	                }catch (Exception e) { e.printStackTrace();}
	            }
	        }
	}
}
