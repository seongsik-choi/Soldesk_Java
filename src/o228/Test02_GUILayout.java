/*
 * Test02_GUI Programming
 */
package o228;
import java.awt.*;
import javax.swing.*;
public class Test02_GUILayout {

// 1. GUI Programming Base
static class MyGUI extends JFrame {	// JFram을 extends하는 GUI Class
		MyGUI() {	// Constructor
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// Windows X 버튼 클릭시 종료
			setTitle("GUI 연습");			// Title

			// 버튼, 레이블, 체크박스 등 UI Programming
			
			setSize(500, 500);	// Windosw 창 크기 px단위
			setVisible(true);	// 가시성 
		}
}

// 2. FlowLayout 예제
static class MyGUI1 extends JFrame {
	MyGUI1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("FlowLayout 연습");

		// this.setLayout(new FlowLayout()); // Windows를 FlowLayout으로 설정(기본 정렬)
										  // this는 현재 JFrame
		this.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
									// 정렬방식, 수평간격, 수직간격)
		JButton btn1 = new JButton("버튼1");
			this.add(btn1);
		JButton btn2 = new JButton("버튼2");
			this.add(btn2);
		JButton btn3 = new JButton("버튼3");
			this.add(btn3);
		JButton btn4 = new JButton("버튼4");
			this.add(btn4);
		JButton btn5 = new JButton("버튼5");
			this.add(btn5);
		setSize(300, 300);
		setVisible(true);
	}
}

// 3. BorderLayout(버튼의 위치 : NORTH, WEST, CENTER, EAST, SOUTH 5종류)
static class MyGUI2 extends JFrame {
	MyGUI2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("BorderLayout 연습");
		this.setLayout(new BorderLayout(10, 10));	// 수평과 수직간격
		
		// 버튼의 위치 : NORTH, WEST, CENTER, EAST, SOUTH
		JButton btn1 = new JButton("버튼1");
			this.add(btn1, BorderLayout.NORTH);	
		JButton btn2 = new JButton("버튼2");
			this.add(btn2, BorderLayout.WEST);
		JButton btn3 = new JButton("버튼3");
			this.add(btn3, BorderLayout.CENTER);
		JButton btn4 = new JButton("버튼4");
			this.add(btn4, BorderLayout.EAST);
		JButton btn5 = new JButton("버튼5");
			this.add(btn5, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
}

//4. GridLayout
static class MyGUI3 extends JFrame {
	MyGUI3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GridLayout 연습");

		this.setLayout(new GridLayout(3, 3, 10, 10));	// 3행, 3열, 수평간격, 수직간격
		// this.setLayout(new GridLayout(3, 3));	// 수평 수직 간격 없이도 가능
		JButton[] btn = new JButton[9];	// 9개짜리 btn 배열

		for (int i = 0; i < 9; i++) {
			btn[i] = new JButton("버튼" + (i + 1));	// 버튼의 이름[i]++
			this.add(btn[i]);
		}
		setSize(300, 300);
		setVisible(true);
	}
}

// 5. Layout이 없는 Windows(절대 위치 지정 필요)
static class MyGUI4 extends JFrame {
	MyGUI4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("레이아웃이 없는 창 연습");
		this.setLayout(null);	// Layout이 없음을 의미

		JButton btn1 = new JButton("버튼1");
			btn1.setBounds(50, 50, 70, 60);	// 버튼 각각에 대한 절대 위치 지정
			this.add(btn1);
		JButton btn2 = new JButton("버튼2");
			btn2.setBounds(80, 80, 70, 60);
			this.add(btn2);
		JButton btn3 = new JButton("버튼3");
			btn3.setBounds(110, 110, 70, 60);
			this.add(btn3);
		setSize(300, 300);
		setVisible(true);
	}
}

	public static void main(String[] args) {
		/// new MyGUI();	// MyGUI Class 생성
		// new MyGUI1();	// MyGUI1 FlowLayout Class 생성
		// new MyGUI2();	// MyGUI2 BorderLayout Class 생성
		// new MyGUI3();	// MyGUI3 GridLayout Class 생성
		new MyGUI4();	// MyGUI4 NullLayout Class 생성
	}
}
