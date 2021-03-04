/*
Test03_양방햔 통신
5. 양방향 통신(InputputClientClass, InputputServerClass)
 - client와 Server는 InputStream, outputStream을 이용해서 양방향 통신 가능
 (log Client)                           (log Server)
 서버 연결 완료                            Wait Client
메시지 입력                              Accept Client
-> 안녕하세요                            socket: Socket[addr=/127.0.0.1,port=2962,localport=9000]
inMessage : 메시지 전송 완료            clientMessage : 안녕하세요
메시지 입력
-> 오늘 날씨 좋네요
inMessage : 메시지 전송 완료             clientMessage : 오늘 날씨 좋네요
메시지 입력
-> STOP
inMessage : 메시지 전송 완료              clientMessage : STOP
Process finished with exit code 0 // process EXit
 */
package otherNetworking;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
public class Test03_InOutputClientClass {
    public static void main(String[] args) {
        Socket socket = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;   // outputstream 확장
        InputStream inputStream = null;
        DataInputStream dataInputStream =null;      // inputStream 확장

        Scanner scanner = null;

        try{
            socket = new Socket("localhost", 9000); // 소켓 객체 생성
            System.out.println("서버 연결 완료");

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);  // 문자단위 확장

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);     // 문자단위 확장

            scanner = new Scanner(System.in);   // 데이터 입력
            while (true){   // 무한 loop
                System.out.println("메시지 입력");
                String outMessage = scanner.nextLine(); // 서버쪽으로 메시지 전송
                dataOutputStream.writeUTF(outMessage);  // 전송
                dataOutputStream.flush(); // 완벽하게 비워주기  -> Sever 쪽 Code 확인

                String inMessage = dataInputStream.readUTF();   // Sever쪽 line 42에의해 메시지 받음
                System.out.println("inMessage : " + inMessage); // 메시지 출력

                if(outMessage.equals("STOP")) break;    // 사용자 입력 객체 Stop시 while 종료
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {  // Resource 반환
            try {
                if(dataOutputStream != null) dataOutputStream.close();
                if(outputStream != null) outputStream.close();
                if(dataInputStream != null) dataInputStream.close();
                if(inputStream != null) inputStream.close();
                if(socket != null) socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}