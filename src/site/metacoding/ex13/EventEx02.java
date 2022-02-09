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
		System.out.println("���ϴٽñ׷���");
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
		setLocationRelativeTo(null); // ������ ȭ�� �߾� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� main ����

	}

	@Override
	public void initObject() {
		myPanel = new MyPanel();
		labelText = new JLabel("����");
		btn1 = new JButton("���ں���");
		btn2 = new JButton("�׸�����");
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
				// setText�޼���� �κ� ����!!
				labelText.setText("�ι�°����");// setText�޼���� ���ο� paintComponent�� ȣ���Ѵ�. //��ü�� �ٽ� �׷�����.
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
