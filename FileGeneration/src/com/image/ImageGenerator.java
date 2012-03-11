package com.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int width  = 400;   // width of image
			int height = 200;   // height of image
			BufferedImage image = new BufferedImage(500, 500,BufferedImage.TYPE_INT_RGB);
			File outputfile = new File("saved.png");
			Graphics2D g = image.createGraphics();    // Get graphics context
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);     // Anti-alias the painting
			// First set background color to white by painting a filled rectangle
			g.setPaint(Color.white);
			Rectangle2D rectangle = new Rectangle2D.Double(0, 0, width, height);
			g.fill(rectangle);
			GradientPaint gp = new GradientPaint(
					0, 0, Color.lightGray,
					400, 100, Color.black);  // Create a gradient fill from lightgray to black
			g.setPaint(gp); // Use gradient fill to draw text
			Font font = new Font("Serif", Font.BOLD, 40);
			g.setFont(font);
			g.drawString("Hello Pratap!", 0, 30);  // Paint the text "Hello UK BUG!" 
			ImageIO.write(image, "png", outputfile);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
