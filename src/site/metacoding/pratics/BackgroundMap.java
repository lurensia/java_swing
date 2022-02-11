package site.metacoding.pratics;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BackgroundMap extends JLabel {
	private ImageIcon backgroundMap;

	private BufferedImage image;

	public ImageIcon getBackgroundMap() {
		return backgroundMap;
	}

	public void setBackgroundMap(ImageIcon backgroundMap) {
		this.backgroundMap = backgroundMap;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public BackgroundMap() {
		try {
			// raw 하게 읽는 다는 뜻 : 낡것 그대로 읽는 것
			image = ImageIO.read(new File("image/backgroundMapService.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		backgroundMap = new ImageIcon("image/backgroundMap.png");
		setIcon(backgroundMap);

	}
}
