package site.metacoding.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Administrator ����: ���ȭ�� ����, ĳ���� �߰�
 */
public class BubbleFrame extends JFrame {

	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initObject();
		initSetting();
		setVisible(true);// ���ο� paintconpornent ȣ�� �ڵ尡 �ִ�.
	}

//new �ϴ°�
	private void initObject() {
		backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
		setContentPane(backgroundMap);

		player = new Player();
		add(player);
		// backgroundMap.setSize(100, 100);
		// backgroundMap.setLocation(300, 300);
		// backgroundMap.setSize(1000,600);
		// add(backgroundMap); // JFrame�� JLabel�� �׷�����.
	}

	// ���� ��� ����
	private void initSetting() {
		setSize(1000, 640);
		// setLayout(null); // absoulte ���̾ƿ� (�����Ӱ� �׸��� �׸� �� �ִ�)
		// getContentPane().setLayout(null);
		setLocationRelativeTo(null); // JFrame ��� ��ġ�ϱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư���� â�� �� �� JVM ���� �����ϱ�
	}

	public static void main(String[] args) {
		new BubbleFrame();
	}
}
