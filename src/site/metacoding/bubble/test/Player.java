package site.metacoding.bubble.test;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private int x, y;
	private ImageIcon playerR, playerL;
	private boolean isRight, isLeft, isJump;
	private static final int JSPEED = 2;
	private static final int SPEED = 4;

	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public boolean isLeft() {
		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}

	public boolean isJump() {
		return isJump;
	}

	public void setJump(boolean isJump) {
		this.isJump = isJump;
	}

	public Player() {
		initObject();
		initSetting();
	}

	private void initSetting() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
	}

	private void initObject() {
		x = 70;
		y = 535;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);

		isRight = false;
		isLeft = false;
		isJump = false;
	}

	public void left() {
		isLeft = true;
		setIcon(playerL);
		System.out.println("LEFT");
		new Thread(() -> {
			while (isLeft() == true) {
				x = x - SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void right() {
		isRight = true;
		setIcon(playerL);
		System.out.println("RIGHT");
		new Thread(() -> {
			while (isRight() == true) {
				x = x + SPEED;
				setLocation(x, y);

				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void jump() {
		isJump = true;
		System.out.println("JUMP");
		new Thread(() -> {
			for (int i = 0; i < 75; i++) {
				y = y - JSPEED;
				setLocation(x, y);

				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			for (int j = 0; j < 75; j++) {
				y = y + JSPEED;
				setLocation(x, y);

				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			isJump = false;
		}).start();
	}
}
