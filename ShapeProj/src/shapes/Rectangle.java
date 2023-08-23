package shapes;

import point.Point;

public class Rectangle extends Shape {
	Point startPos = new Point();
	int width;
	int height;

	public Rectangle() {
		
	}
	
	public Rectangle(String color, int x, int y, int width, int height) {
		super(color);
		startPos.x = x;
		startPos.y = y;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String color, Point startPos, int width, int height) {
		super(color);
		this.startPos = startPos;
		this.width = width;
		this.height = height;
	}
	
	public Point getStartPos() {
		return startPos;
	}

	public void setStartPos(Point startPos) {
		this.startPos = startPos;
	}
	
	@Override
	public void draw() {
		System.out.println(String.format("[사각형: 색(%s), 시작점(%d, %d), 너비(%d), 높이(%d)]", color, startPos.x, startPos.y, width, height));
	}
}
