/*
Test01_네트워킹 : 네트워크에 연결되어 있는 대상 사이에서 데이터를 전송하는 방법
 1. 네트워크 데이터 입력 및 출력
  - 네트워크 객체(대상) 사이에 입/출력(InputStream, OutputStream)을 이용해 데이터를 입/출력
 2. 소켓(Socket) :네트워크 상에서 데이터를 주고 받기 위한 장치
  - 대상 A - 대상 B 연결 시, 장치 역할
 3. 소켓 Class : 서버는 클라이언트를 맞을 준비를 하고 있다가 클라이언의 요청에 반응.
  - Client(http://localhost:9000)   /  Sever(Sever Socket 생성)
  - Sever는 port Num을 제공하여 多 클라이언트 수용
 */
package otherNetworking;
import java.net.*;	// Socket에 대한 import
public class Test01_NetworkClass {
	public static void main(String[] args) {
		//  3. 소켓 Class
        ServerSocket severSocket = null; // Sever Socket 생성
        Socket socket = null;           // Client Socket 생성

        try{        // network 관련 I/O는 예외처리 꼭 해주기
            severSocket = new ServerSocket(9000); // port num 할당
            System.out.println(" -- Wait Client -- ");      // 실행 시 23번 line에서 process 실행중
            // web browser(http://localhost:9000) 접속시 Log 상 연결 확인
            socket = severSocket.accept();       // client accept
            System.out.println(" -- Welcome Client -- "); // client Accept
            System.out.println("socket : " + socket);
            //  -- Welcome Client -- 
            // socket : Socket[addr=/0:0:0:0:0:0:0:1,port=3753,localport=9000]
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {   // 자원 반환
                if(socket != null) socket.close();
                if(severSocket !=null) severSocket.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
