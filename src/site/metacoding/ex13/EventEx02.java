package site.metacoding.ex13;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyPanel extends JPanel {

	int x = 100;
	int y = 200;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("패턴다시그려짐");
		g.drawLine(10, 20, x, y);
	}
}

public class EventEx02 extends JFrame implements UserInterface {

	JLabel labelText;
	MyPanel myPanel;
	JButton btn1, btn2;

	public EventEx02() {
		initSetting();
		initObject();
		initAsign();
		initListener();

		setVisible(true);
	}

	@Override
	public void initSetting() {
		setSize(500, 500);
		setLocationRelativeTo(null); // 프레임 화면 중앙 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main 종료

	}

	@Override
	public void initObject() {
		myPanel = new MyPanel();
		labelText = new JLabel("글자");
		btn1 = new JButton("글자변경");
		btn2 = new JButton("그림변경");
	}

	@Override
	public void initAsign() {
		add(myPanel);
		myPanel.add(labelText);
		myPanel.add(btn1);
		myPanel.add(btn2);
	}

	@Override
	public void initListener() {
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// setText메서드는 부분 변경!!
				labelText.setText("두번째글자");// setText메서드는 내부에 paintComponent를 호출한다. //전체가 다시 그려진다.
				myPanel.x = 200;
				myPanel.y = 300;

				repaint();
			}

		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.x = myPanel.x + 20;
				myPanel.y = myPanel.y + 30;

				System.out.println(myPanel.x);
				System.out.println(myPanel.y);

				repaint();
			}

		});
	}

	public static void main(String[] args) {
		new EventEx02();
	}
}
