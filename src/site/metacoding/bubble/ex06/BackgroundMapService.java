package site.metacoding.bubble.ex06;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

//����
//��׶��� ����(�������� ���ǵ�� ������ �Ѵ�.)
public class BackgroundMapService implements Runnable {

	// ��������
	private Player player;
	private BufferedImage image;

	// ���������� ���� ��� => ������ ����: �����ڸ� ���� ���� =DI(Dependency Injection)
	public BackgroundMapService(Player player) {
		this.player = player;

		try {
			image = ImageIO.read(new File("image/backgroundServiceMap.png"));
			System.out.println("�÷��̾���ġ X =" + player.getX());
			System.out.println("�÷��̾���ġ Y =" + player.getY());

			// System.out.println(image);
			// System.out.println(image.getRGB(10, 10));
			// ������ while

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				Color color = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
				System.out.println("==================");
				System.out.println(color.getRed());
				System.out.println(color.getGreen());
				System.out.println(color.getBlue());
				System.out.println("==================");
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}