import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddel extends Rectangle{

	int id;
	int yVelocity;
	int speed = 10;
	
	Paddel(int x, int y, int PADDEL_WIDTH, int PADDEL_HEIGHT, int id){
		super(x, y, PADDEL_WIDTH, PADDEL_HEIGHT);
		this.id = id;
	}
	
	public void keyPressed(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_Q) {
				setYDirection(-speed);
				move();
			}
			
			if(e.getKeyCode() == KeyEvent.VK_A) {
				setYDirection(speed);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_P) {
				setYDirection(-speed);
				move();
			}
			
			if(e.getKeyCode() == KeyEvent.VK_L) {
				setYDirection(speed);
				move();
			}
			break;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode() == KeyEvent.VK_Q) {
				setYDirection(0);
				move();
			}
			
			if(e.getKeyCode() == KeyEvent.VK_A) {
				setYDirection(0);
				move();
			}
			break;
		case 2:
			if(e.getKeyCode() == KeyEvent.VK_P) {
				setYDirection(0);
				move();
			}
			
			if(e.getKeyCode() == KeyEvent.VK_L) {
				setYDirection(0);
				move();
			}
			break;
		}
	}
	
	public void setYDirection(int yDirection) {
		yVelocity = yDirection;
	}
	
	public void move() {
		y = y + yVelocity;
	}
	
	public void draw(Graphics g) {
		if(id == 1)
			g.setColor(Color.blue);
		else
			g.setColor(Color.red);
		g.fillRect(x,y, width, height);
	}
}
