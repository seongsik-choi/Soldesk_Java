/*
Test02_네트워킹 : 네트워크에 연결되어 있는 대상 사이에서 데이터를 전송하는 방법
4. Client와 Sever 소켓(SeverSocketClass와 ClientSocketClass 이용해 통신)
  - 서버에 SeverSocket를 준비하고, 클라이언트에서 Socket를 이용해서 접속
  - 클라이언트에서 소켓을 만들어 접속하는 방식
 */
package otherNetworking;
import java.net.*;	// Socket에 대한 import
public class Test02_SeverSocketClass {
	 public static void main(String[] args) {
// 4.  Sever 소켓(SeverSocket)
	   ServerSocket severSocket = null; // Sever Socket 생성
	   Socket socket = null;           // Client Socket 생성

	   try{        // network 관련 I/O는 예외처리 꼭 해주기
	        severSocket = new ServerSocket(9000); // port num 할당
	        System.out.println(" -- Wait Client -- ");

	        socket = severSocket.accept();       // client accept
	        System.out.println(" -- Welcome Client -- "); // client Accept
	        System.out.println("socket : " + socket);
	        }catch (Exception e){
	            e.printStackTrace();
	        } finally {
	            try {   // 자원 반환
	                if(socket != null) socket.close();
	                if(severSocket !=null) severSocket.close();
	            }catch (Exception e){
	                e.printStackTrace();
	            }System.out.println("Exception end"); 
	            // Client 연결시 try~catch 문 종료
	        }
	}
}