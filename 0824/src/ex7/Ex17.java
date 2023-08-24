package ex7;

public class Ex17 {

	public static void main(String[] args) {
	}

}

abstract class Unit {
	private int x, y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public abstract void move(int x, int y);

	public void stop() {
		
	}
}

class Marine extends Unit {
	public void stimPack() {
		
	}
	
	public void move(int x, int y) {
		
	}
}

class Tank extends Unit {
	public void changeMode() {
		
	}
	
	public void move(int x, int y) {
		
	}
}

class Dropship extends Unit {
	public void unload() {
		
	}
	
	public void move(int x, int y) {
		
	}
}