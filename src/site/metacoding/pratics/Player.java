package site.metacoding.pratics;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {
	private static final String TAG = "Player";

	// ��������
	private BackgroundMap backgroundMap;

	private ImageIcon playerR, playerL;
	private int x, y;
	private boolean isLeft, isRight, isUp, isDown; // is���⼺
	private boolean leftWallCrash, rightWallCrash;

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isLeft() {
		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}

	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public boolean isUp() {
		return isUp;
	}

	public void setUp(boolean isUp) {
		this.isUp = isUp;
	}

	public boolean isDown() {
		return isDown;
	}

	public void setDown(boolean isDown) {
		this.isDown = isDown;
	}

	public Player(BackgroundMap backgroundMap) {
		this.backgroundMap = backgroundMap;

		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
		x = 70;
		y = 180;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);

		isDown = false;
		isLeft = false;
		isRight = false;
		isUp = false;

		leftWallCrash = false;
		rightWallCrash = false;
	}

	public void �ٴ��浹����() {
		System.out.println(TAG + "�ٴ��浹������");
		int bottomColor = backgroundMap.getImage().getRGB(getX() + 10, getY() + 50 + 5) // -1
				+ backgroundMap.getImage().getRGB(getX() + 50 - 10, getY() + 50 + 5); // -1

		if (bottomColor != -2) { // ���� �浹 ����
			setDown(false);
		} else if (bottomColor == -2) { // ������ ����̸� down ȣ��
			System.out.println("�ٴ��� ����̿���");
			down();
			if (isDown() == false && isUp() == false) {
				isDown = false;
				System.out.println("�ٴڿ� ��ֹ��� �����մϴ�..");
			}
		}
	}

	public void ���ʺ��浹����() {
		// System.out.println("�����浹�����");
		Color leftColor = new Color(backgroundMap.getImage().getRGB(getX() - 10, getY() + 25));

		if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
			System.out.println("���� ���� �浹��");
			setLeftWallCrash(true);
			isLeft = false;
		}
	}

	public void �����ʺ��浹����() {
		// System.out.println("�������浹�����");
		Color rightColor = new Color(backgroundMap.getImage().getRGB(getX() + 50 + 10, getY() + 25));

		if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
			System.out.println("������ ���� �浹��");
			setRightWallCrash(true);
			isRight = false;
		}

	}

	@Override
	public void left() {
		System.out.println(TAG + ": left()");
		isLeft = true;

		new Thread(() -> {
			while (isLeft()) {
				x = x - 4;
				setLocation(x, y);
				try {
					Thread.sleep(10);

					���ʺ��浹����();
					�ٴ��浹����();
				} catch (Exception e) {
					e.printStackTrace();
				}
				setIcon(playerL);

			}

		}).start();

	}

	@Override
	public void right() {
		System.out.println(TAG + ": right()");
		isRight = true;

		new Thread(() -> {
			while (isRight()) {
				x = x + 4;
				setLocation(x, y);
				try {
					Thread.sleep(10);

					�����ʺ��浹����();
					�ٴ��浹����();
				} catch (Exception e) {
					e.printStackTrace();
				}
				setIcon(playerR);

			}

		}).start();

	}

	@Override
	public void up() {
		System.out.println(TAG + ": up()");

	}

	@Override
	public void down() {
		// �ٴ��浹����();while
		System.out.println(TAG + ": down()");
	}
}
