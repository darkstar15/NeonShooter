package input;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyInput implements KeyListener{

	public boolean[] keys;
	public static boolean up, down, left, right;
	
	
	public KeyInput(){
		keys = new boolean[256];
	}
	
	public void tick(){
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
	}

	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		System.out.println("pressed: " + e.getKeyCode());
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	public void keyTyped(KeyEvent e) {
		
	}
	
	
}
