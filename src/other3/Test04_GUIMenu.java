/*
 * Test03_GUI Menu Programming
 * 문) 메뉴 툴바의 이미지 이미지 섞기 선택 시 이미지 랜덤 배열 
 */
package other3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test04_GUIMenu {
	// 관련 배열을 전역변수(클래스 변수)로 지정
	static String[] imageName = { "eclair.jpg", "froyo.jpg", "gingerbread.jpg", "honeycomb.jpg", "icecream.jpg",
			"jellybean.jpg", "kitkat.jpg", "lollipop.jpg", "marshmallow.jpg" };
	static ImageIcon[] img = new ImageIcon[9];
	static JButton[] btn = new JButton[9];

	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("메뉴 처리");

			JMenuBar menuBar = new JMenuBar();
			JMenu myMenu = new JMenu("내 메뉴");	// 메뉴
			JMenuItem mixItem = new JMenuItem("이미지 섞기");	// 메뉴아이템
			JMenuItem closeItem = new JMenuItem("닫기");		// 메뉴아이템

			setJMenuBar(menuBar); // 메뉴바를 JFrame에 부착
			menuBar.add(myMenu);	// 상위 메뉴에 해당하는 메뉴를 메뉴바에 부착

			myMenu.add(mixItem);	// 하위 메뉴에 해당하는 메뉴 아이템(이미지 섞기, 닫기)를 메뉴에 부착
			myMenu.add(closeItem);	// 하위 메뉴에 해당하는 메뉴 아이템(이미지 섞기, 닫기)를 메뉴에 부착

			mixItem.addActionListener(new ActionListener() {	// 이미지 섞기 메뉴 선택 시 리스너 동작
				public void actionPerformed(ActionEvent arg0) {
					try {
						Robot robot = new Robot(); 
						robot.keyPress(KeyEvent.VK_SPACE); // 키보드 누르는 이벤트 발생(=스페이스바 동일)
					} catch (Exception e) {
					}
				}
			});

			closeItem.addActionListener(new ActionListener() {	// 닫기 버튼
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});

			this.setLayout(new GridLayout(3, 3, 10, 10));

			this.addKeyListener(new KeyAdapter() {		// 현재창에서 키보드 누르면 동작(키보드 이벤트)
				public void keyPressed(KeyEvent e) {	// 모든 키 동작
					getContentPane().removeAll();		// 기존 화면에 배치된 버튼을 모두 제거
					int randNum[] = makeRandom();	// random() 메소드
					for (int i = 0; i < 9; i++) {	// 0~8의 서로 다른 숫자가 저장된 배열 변환
						img[i] = new ImageIcon("image/android/" + imageName[randNum[i]]);
						//이름 배열의 첨자로 사용 img[i]
						btn[i] = new JButton(img[i]);
						MyGUI.this.add(btn[i]); // 반복 후 레이아웃에 부착
					}
					validate();	// 새로 고침
				}
			});

			setSize(256, 256);
			setVisible(true);
		}
	}

	public static int[] makeRandom() {	// random() 메소드 구현(중복 no)
		// 섞일 9개 숫자를 구한다.
		int[] rand = { -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int i, k, num;
		char dupl = 'N';
		for (i = 0; i < 9;) {
			num = (int) ((Math.random() * 9));

			for (k = 0; k < 9; k++)
				if (rand[k] == num)
					dupl = 'Y';

			if (dupl == 'N')
				rand[i++] = num;
			else
				dupl = 'N';
		}
		return rand;
	}
	public static void main(String[] args) {
		new MyGUI();
	}
}
