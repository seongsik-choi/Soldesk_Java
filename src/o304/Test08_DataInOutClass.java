/*
 Test08_
 DataInputStream, DataOutputStream
 - byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룸.
 */
package o304;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class Test08_DataInOutClass {
	public static void main(String[] args) {
        String str = "Hello JAVA DataOutPutStream"; // 출력할 문자
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;   // 문자열 단위로

        try{
            outputStream = new FileOutputStream("C:\\Temp\\helloWorld.txt");
            dataOutputStream = new DataOutputStream(outputStream);
            // 생성자 매개변수로 사용해 확장

            dataOutputStream.writeUTF(str); // Encoding
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
            if(dataOutputStream != null) dataOutputStream.close();
        } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if(outputStream != null ) outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
