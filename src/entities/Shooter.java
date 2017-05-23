package entities;

import java.awt.image.BufferedImage;

public class Shooter extends Entity{
	
	private double velX = 0;
	private double velY = 0;
	private double health;
	private double rotation = 0;
	
	public Shooter(BufferedImage image, double x, double y) {
		super(image, x, y);
	}
	
	public void update(){
		setX(getX() + velX);
		setY(getY() + velY);
	}

}
