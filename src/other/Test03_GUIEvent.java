/*
 * Test03_GUI Event Programming
 */
package other;
import java.awt.*;
import java.awt.event.*;	// Awt Event Class
import javax.swing.*;

public class Test03_GUIEvent {
// 1. GUI Programming EventBase(버튼을 누르면 버튼 색이 변경되는 예제, ActionListener)
static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("이벤트 처리 1");
			this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
			JButton btn1 = new JButton("버튼1");	// 버튼 생성
			
			// ActionListener는 interface 구조. 구현하여 동작
			btn1.addActionListener(new ActionListener() {	// 버튼name.Eventname
				public void actionPerformed(ActionEvent arg0) {	// actionPerformed 동작
					btn1.setBackground(Color.RED);	// Color 변경
					setTitle("색상이 변경되었습니다.");	// Title 변경
				}
			});
			this.add(btn1);
			setSize(300, 300);
			setVisible(true);
		}
	}
//2. GUI Programming Event(마우스 클릭시 좌표가 표시되는 예제, MouseEvent)
static class MyGUI2 extends JFrame {
	MyGUI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 처리 2");
		this.setLayout(new FlowLayout());
		JTextField txtX = new JTextField(10);	// TextEvent의 JTextField 생성
		JTextField txtY = new JTextField(10);
		this.add(txtX);			
		this.add(txtY);

		this.addMouseListener(new MouseListener() {	// 마우스 이벤트의 리스너를 JFrame(this)에 부착
			public void mouseClicked(MouseEvent e) {	// 5개의 추상메서드
				txtX.setText(Integer.toString(e.getX()));	// getX() 메소드로 x 좌표값 반환
				txtY.setText(Integer.toString(e.getY()));	// getㅛ() 메소드로 y 좌표값 반환
			}
			public void mouseEntered(MouseEvent e) {}	// MouseEvent의 추상메소드
			public void mouseExited(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
		});

		setSize(500	, 200);
		setVisible(true);
	}
}
//3. GUI Programming Event(키보드로 텍스트 입력후 Enter 클릭 시 숫자가 기록 예제, KeyEvents)
static class MyGUI3 extends JFrame {
	MyGUI3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 처리 3");
		this.setLayout(new FlowLayout());
		JTextField txt = new JTextField(10);	// TextEvent의 JTextField 생성
		JTextArea area = new JTextArea(10, 10); // TextEvent의 JTextArea 생성
		this.add(txt);
		this.add(area);

		txt.addKeyListener(new KeyAdapter() { // JTextField에서 키보드를 누르면 작동(KeyAdapter)
			public void keyReleased(KeyEvent e) {	// 키를 떼면 동작keyReleased() 메소드 Override
				int key = e.getKeyCode();	// 눌린 키의 정수 값을 key 변수에 저장

				if (key == KeyEvent.VK_ENTER) { // key = Enter인 경우
					String str = txt.getText();	// JTextField영역 -> 텍스트 영역
					area.setText(area.getText() + str + '\n'); // 줄바꿈
					txt.setText("");	// 텍스트 필드 초기화
				}
				if (!(key >= KeyEvent.VK_0 && key <= KeyEvent.VK_9)) { // 눌린 숫자가 0~9아닌경우
					String str = txt.getText();
					int strlen = str.length();
					if (strlen != 0)	
						txt.setText(str.substring(0, strlen - 1));	// 글자 개수 하나 줄여서 다시씀
				}
			}
		});
		setSize(230, 400);
		setVisible(true);
	}
}

	public static void main(String[] args) {
		// new MyGUI();
		//new MyGUI2();
		new MyGUI3();
	}
}
