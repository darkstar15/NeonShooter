package entities;

import java.awt.image.BufferedImage;

public class Entity implements Renderable {
	
	private double x;
	private double y;
	private BufferedImage image;
	
	public Entity(BufferedImage image, double x, double y){
		this.image = image;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public BufferedImage getImage() {
		return this.image;
	}

	@Override
	public int getRenderX() {
		return (int) Math.round(x);
	}

	@Override
	public int getRenderY() {
		return (int) Math.round(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void update(){};

}
