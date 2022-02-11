package site.metacoding.pratics;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class BubbleApp extends JFrame implements initable {

	private static final String TAG = "BubbleApp";

	private BubbleApp mContext = this;

	private BackgroundMap backgroundMap;
	private Player player;

	public BubbleApp() {
		// System.out.println(TAG + "������");
		initObject();
		initSetting();
		initListener();

		setVisible(true);
	}

	public static void main(String[] args) {
		new BubbleApp();
	}

	@Override
	public void initObject() {
		backgroundMap = new BackgroundMap();
		player = new Player(backgroundMap);
		setContentPane(backgroundMap);
		player = new Player(backgroundMap);
		add(player);

	}

	@Override
	public void initSetting() {
		setSize(1000, 640);
		getContentPane().setLayout(null); // JFrame�� �⺻ JPanel�� ���̾ƿ� ����
		setLocationRelativeTo(null); // ��� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� JVM ���� �����ϱ�
	}

	@Override
	public void initListener() {
		mContext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_RIGHT:
					// ����
					if (player.isRight() == false) {
						player.right();
					}
					break;
				case KeyEvent.VK_LEFT:
					// ����
					if (player.isLeft() == false) {
						player.left();
					}
					break;
				case KeyEvent.VK_UP:
					// ����
					player.up();
					break;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_RIGHT:
					// ����
					player.setRight(false);
					break;
				case KeyEvent.VK_LEFT:
					// ����
					player.setLeft(false);
					break;

				}
			}

		});
	}
}
