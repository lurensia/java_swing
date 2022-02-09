package site.metacoding.bubble.ex02;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author Administrator 좌,우 / 상,하 이동이 가능해야 한다. 점프가 가능하다. 방울을 발사해야 한다.-나중에 생각하자.
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