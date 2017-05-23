package entities;

import java.awt.image.BufferedImage;

public class Shooter extends Entity{
	
	private double maxVelocity = 1;
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

	public double getVelX() {
		return velX;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public double getVelY() {
		return velY;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	
	public double getMaxVelocity() {
		return maxVelocity;
	}

}
