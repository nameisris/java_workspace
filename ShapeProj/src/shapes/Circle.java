package shapes;

import point.Point;

public class Circle extends Shape {
	Point center = new Point();
	int radius;
	
	public Circle() {
		
	}
	
	public Circle(String color, Point center, int radius) {
		super(color);
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(String color, int x, int y, int radius) {
		super(color);
		this.center.x = x;
		this.center.y = y;
		this.radius = radius;
	}
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.println(String.format("[원: 색(%s), 중심점(%d, %d), 반지름(%d)]", color, center.x, center.y, radius));
	}
}
