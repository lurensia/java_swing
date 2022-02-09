package site.metacoding.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author Administrator ��,�� / ��,�� �̵��� �����ؾ� �Ѵ�. ������ �����ϴ�. ����� �߻��ؾ� �Ѵ�.-���߿� ��������.
 * 
 */
public class Player extends JLabel {
	private int x;
	private int y;

	private ImageIcon playerR;
	private ImageIcon playerL;

	public Player() {
		initObject();
		initSetting();
	}

	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
	}

	private void initSetting() {
		x = 70;
		y = 530;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}
}