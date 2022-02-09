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
	JLabel labelText, labelImg;// ���ڿ� �̹����� ���� �� �ִ�. div

	public EventEx01() {
		initSetting();
		initObject();
		initAsign();
		initListener();

		setVisible(true);// ����� ���� ����.
	}

	private void initSetting() {
		setSize(300, 300);
		setLocationRelativeTo(null); // ������ ȭ�� �߾� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� main ����
	}

	private void initObject() {
		myPanel = new JPanel();
		checkbox1 = new JCheckBox();
		btn1 = new JButton("btn1");
		btn2 = new JButton("btn2");
		labelText = new JLabel("���̺�");
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
		// ������� ���Ѻ���!! �� ��ư��!
		btn1.addActionListener(new ActionListener() {
			// ��ư�� Ŭ���Ǹ� �����찡 �ش� �޼��带 �ݹ����ش�.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư1�� Ŭ���Ǿ����ϴ�.");
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư2�� Ŭ���Ǿ����ϴ�.");
			}
		});

		checkbox1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.toString());
				System.out.println(e.getStateChange());
//				System.out.println("üũ�ڽ� �¿�����");

			}

		});

	}

	public static void main(String[] args) {
		new EventEx01();
	}
}
