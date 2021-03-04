/*
Test02_네트워킹 : 네트워크에 연결되어 있는 대상 사이에서 데이터를 전송하는 방법
4. Client와 Sever 소켓(SeverSocketClass와 ClientSocketClass 이용해 통신)
  - 서버에 SeverSocket를 준비하고, 클라이언트에서 Socket를 이용해서 접속
  - 클라이언트에서 소켓을 만들어 접속하는 방식
 */
package otherNetworking;
import java.net.*;	// Socket에 대한 import
public class Test02_ClientSocketClass {
	public static void main(String[] args) {
        // 4.  Client 소켓(ClientSocket)
        Socket socket = null;           // Client 쪽 process는 Socket만 생성
        try{        // network 관련 I/O는 예외처리 꼭 해주기
            socket = new Socket("localhost", 9000); // 127.0.0.1 : localhost
            System.out.println(" -- Accept Server -- ");
            System.out.println("socket : " + socket);   // SeverSocketClass SeverScoekt으로
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {   // 자원 반환
                if(socket != null) socket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
