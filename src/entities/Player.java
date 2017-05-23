package entities;

import java.awt.image.BufferedImage;

import input.KeyInput;

public class Player extends Shooter{

	public Player(BufferedImage image, double x, double y) {
		super(image, x, y);
	}
	
	public void update(){
		if(KeyInput.up && !KeyInput.down){
			setVelY(-getMaxVelocity());
		}else if(KeyInput.down && !KeyInput.up){
			setVelY(getMaxVelocity());
		} else {
			setVelY(0);
		}

		if(KeyInput.left && !KeyInput.right){
			setVelX(-getMaxVelocity());
		}else if(KeyInput.right && !KeyInput.left){
			setVelX(getMaxVelocity());
		} else {
			setVelX(0);
		}
		super.update();
	}

}
