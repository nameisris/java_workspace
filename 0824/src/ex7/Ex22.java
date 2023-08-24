package ex7;

public class Ex22 {

	public static void main(String[] args) {

	}

}
//
//abstract class Shape {
//	Point p;
//	
//	Shape() {
//		this(new Point(0, 0));
//	}
//	
//	Shape(Point p) {
//		this.p = p;
//	}
//	
//	abstract double calcArea(); // 도형 면적 계산 메서드
//	
//	Point getPosition() {
//		return p;
//	}
//	
//	void setPosition(Point p) {
//		this.p = p;
//	}
//}
//
//class Point {
//	int x;
//	int y;
//	
//	Point() {
//		this(0, 0);
//	}
//	
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	public String toString() {
//		return "[" + x + ", " + y + "]";
//	}
//}
//
//class Circle extends Shape {
//	double r; // 반지름
//	
//	Circle() {
//		super();
//	}
//	
//	Circle(Point p, double r) {
//		super(p);
//		this.r = r;
//	}
//	
//	double calcArea() {
//		
//		return r * r * Math.PI;
//	}
//}
//
//class Rectangle extends Shape {
//	int width; // 폭
//	int height; // 넓이
//	
//	Rectangle() {
//		super();
//	}
//	
//	Rectangle(Point p, int width, int height) {
//		super(p);
//		this.width = width;
//		this.height = height;
//	}
//	
//	double calcArea() {
//		
//		return width * height;
//	}
//	
//	boolean isSquare() {
//		if(width == height && (width * height) != 0) {
//			return true;
//		}
//		
//		return false;
//	}
//}