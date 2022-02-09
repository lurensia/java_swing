package site.metacoding.ex13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventEx01 extends JFrame {

	JPanel myPanel;
	JButton btn1;// "ctrl + shift + o"
	JButton btn2;// "ctrl + shift + o"
	JCheckBox checkbox1;
	JLabel labelText, labelImg;// 글자와 이미지를 넣을 수 있다. div

	public EventEx01() {
		initSetting();
		initObject();
		initAsign();
		initListener();

		setVisible(true);// 까먹지 말고 쓰자.
	}

	private void initSetting() {
		setSize(300, 300);
		setLocationRelativeTo(null); // 프레임 화면 중앙 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main 종료
	}

	private void initObject() {
		myPanel = new JPanel();
		checkbox1 = new JCheckBox();
		btn1 = new JButton("btn1");
		btn2 = new JButton("btn2");
		labelText = new JLabel("레이블");
		labelImg = new JLabel(new ImageIcon("image/pokem.png"));
	}

	private void initAsign() {
		add(myPanel);
		myPanel.add(checkbox1);
		myPanel.add(btn1);
		myPanel.add(btn2);
		myPanel.add(labelText);
		myPanel.add(labelImg);
	}

	private void initListener() {
		// 윈도우야 지켜봐줘!! 이 버튼을!
		btn1.addActionListener(new ActionListener() {
			// 버튼이 클릭되면 윈도우가 해당 메서드를 콜백해준다.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1이 클릭되었습니다.");
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2가 클릭되었습니다.");
			}
		});

		checkbox1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.toString());
				System.out.println(e.getStateChange());
//				System.out.println("체크박스 온오프중");

			}

		});

	}

	public static void main(String[] args) {
		new EventEx01();
	}
}
