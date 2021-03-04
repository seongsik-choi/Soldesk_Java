/*
Test05_입력과 출력(FileInputStream  FileOutputStream)
 1. 입/출력 : 다른 곳의 데이터를 가져오는것(입력) / 다른 곳으로 내보내기(출력)
   - 스트림(stream) : 입/출력 연결
   - 입/출력 기본 클래스 : 1byte 단위로 데이터를 전송하는 InputStream,OutputStream
  InputStream <-> OutputStream
   - FileInputStream : read();  // 1byte 씩 읽고
                       read(byte[]); // []의 크기만큼 한번에 읽기
     FileOutputStream : write(byte[] b);  // 전체 쓰기
                        write(write(byte[], inf off, int len);  // off(시작점), len(길이)
 */
package o304;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class Test06_FileInOutClass2 {
	public static void main(String[] args) throws Exception {
		// read(); 1byte 단위로 읽는 경우
        InputStream inputStream = null;
        try {   // 네트워크 관련(I/O) 파일은 예외처리 꼭 해주기
            inputStream = new FileInputStream("C:/Temp/hello1.java");
            // hello.txt 내 Hello JAVA write -> 아스키코드로 출력
            int data = 0;
            while (true){
                try {
                    data = inputStream.read(); // 1byte 씩 읽고
                } catch (IOException e){
                    e.printStackTrace();
                } if(data == -1) break; // 더이상 읽을 데이터가 없는 경우
                System.out.println("data : " + data);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null) inputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        //  read(byte[]); []의 크기만큼 한번에 읽기
        InputStream inputStream1 = null;
        try {   // 네트워크 관련(I/O) 파일은 예외처리 꼭 해주기
            inputStream = new FileInputStream("C:\\Temp\\hello.txt");
            // hello.txt 내 Hello JAVA write -> 아스키코드로 출력
            int data = 0;

            byte[] bs = new byte[3]; // [] 크기 만큼 읽어오기 위해 설정

            while (true){
                try {
                    data = inputStream.read(bs); // 배열 매개변수를 read 함수에 넣기
                } catch (IOException e){
                    e.printStackTrace();
                } if(data == -1) break; // 더이상 읽을 데이터가 없는 경우
                System.out.println("data : " + data);
                for (int i = 0; i<bs.length; i++){
                    System.out.println("bs[" + i + "] : " + bs[i]);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null) inputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        // write() 쓰는 경우
        OutputStream outputStream = null;
        try {   // 네트워크 관련(I/O) 파일은 예외처리 꼭 해주기
            outputStream = new FileOutputStream("C:\\Temp\\helloW.txt");
            String data = "Hello JAVA world!";
            byte[] arr = data.getBytes();

                try {
                    outputStream.write(arr);
                } catch (IOException e){
                    e.printStackTrace();
                }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if(outputStream != null) outputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        // write() 쓰는 경우 배열사용(저장할 문자의 시작점과 끝지점 지정)
        OutputStream outputStream1 = null;
        try {   // 네트워크 관련(I/O) 파일은 예외처리 꼭 해주기
            outputStream1 = new FileOutputStream("C:\\Temp\\helloWa.txt");
            String data = "Hello JAVA world!!!!!";
            byte[] arr = data.getBytes();

            try {
                outputStream1.write(arr, 0, 5); // 배열 정해주기 0부터 5까지만(Hello)
            } catch (IOException e){
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if(outputStream1 != null) outputStream1.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
	}

}
