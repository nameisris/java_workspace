package shapes;

import point.Point;

public class Triangle extends Shape {
	
	Point p1 = new Point();
	Point p2 = new Point();
	Point p3 = new Point();
	
	public Triangle() {
		
	}
	
	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		
	}
	
	public Triangle(String color, int a1, int a2, int b1, int b2, int c1, int c2) {
		super(color);
		p1.x = a1;
		p1.y = a2;
		p2.x = b1;
		p2.y = b2;
		p3.x = c1;
		p3.y = c2;
	}
	
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
	@Override
	public void draw() {
		System.out.println(String.format("[삼각형: 색(%s), 점1(%d, %d), 점2(%d, %d), 점3(%d, %d)]", color, p1.x, p1.y, p2.x, p2.y, p3.x, p3.y));
	}
}
