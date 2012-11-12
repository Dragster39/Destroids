package MovableObject;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

// SVN Test trial
public abstract class MovableObject {
	public void paint() {

	}

	private static BufferedImage rotateImage(BufferedImage src, double degrees) {
		AffineTransform affineTransform = AffineTransform.getRotateInstance(
				Math.toRadians(degrees), src.getWidth() / 2,
				src.getHeight() / 2);
		BufferedImage rotatedImage = new BufferedImage(src.getWidth(), src
				.getHeight(), src.getType());
		Graphics2D g = (Graphics2D) rotatedImage.getGraphics();
		g.setTransform(affineTransform);
		g.drawImage(src, 0, 0, null);
		return rotatedImage;
	}
}
