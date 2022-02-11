package site.metacoding.bubble.ex06;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

//서비스
//백그라운드 서비스(독립적인 스피드로 돌려야 한다.)
public class BackgroundMapService implements Runnable {

	// 컴포지션
	private Player player;
	private BufferedImage image;

	// 컴포지션을 위한 기술 => 의존성 주입: 생산자를 통한 주입 =DI(Dependency Injection)
	public BackgroundMapService(Player player) {
		this.player = player;

		try {
			image = ImageIO.read(new File("image/backgroundServiceMap.png"));
			System.out.println("플레이어위치 X =" + player.getX());
			System.out.println("플레이어위치 Y =" + player.getY());

			// System.out.println(image);
			// System.out.println(image.getRGB(10, 10));
			// 색상계산 while

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