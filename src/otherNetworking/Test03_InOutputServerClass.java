/*
Test03_양방햔 통신
5. 양방향 통신(InputputClientClass, InputputServerClass)
 - client와 Server는 InputStream, outputStream을 이용해서 양방향 통신 가능
 */
package otherNetworking;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Test03_InOutputServerClass {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;   // 서버 소켓
        Socket socket = null;               // 소켓

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;     // 확장
        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;   // 확장

        try {
            serverSocket = new ServerSocket(9000);  // 서버소켓 객체 생성
            System.out.println("Wait Client");	// wait

            socket = serverSocket.accept();     // 클라이언트 line40에 의해 메시지 전송시 accept 호출
            System.out.println("Accept Client");    // log on
            System.out.println("socket: " + socket);

            // 파일 입출력 loop
            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream); // receive msg 확장
            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);  // receive msg 확장

            while (true) { // 무한루프
                String clientMessage = dataInputStream.readUTF();   // <-> writeUTF();
                System.out.println("clientMessage : " + clientMessage); // 메시지 출력

                dataOutputStream.writeUTF("메시지 전송 완료");
                dataOutputStream.flush();       // client 쪽으로 "메시지 수신완료"했다고 보냄
                                                // client쪽 line 42로
                if(clientMessage.equals("STOP")) break; // 사용자 입력 객체 Stop시 while 종료
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally { // Resource 반환
            try {
                if(dataInputStream != null) dataInputStream.close();
                if(inputStream != null) inputStream.close();
                if(dataOutputStream != null) dataOutputStream.close();
                if(outputStream != null) outputStream.close();
                if(socket != null) socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}