package site.metacoding.bubble.ex01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 1. ������ â�� �Ǿ���
// 2. ������ â�� ���ο� �г��� �ϳ� ������ �ִ�
public class BubbleFrame extends JFrame {
	private JTextField textField;

	public BubbleFrame() {
		setSize(1000, 640);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(96, 96, 85, 21);
		getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setText("11111");
		textField.setBounds(376, 251, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		setVisible(true); // �׸��� �׷���
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
