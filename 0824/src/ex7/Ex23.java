package ex7;

public class Ex23 {
	
	public static double sumArea(Shape[] arr) {
		double sum = 0;
		for(int i = 0;i < arr.length;i++) {
			sum += arr[i].calcArea();	
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Shape[] arr = {
				new Circle(5.0), new Rectangle(3, 4), new Circle(1)
		};
		System.out.println("면적의 합: " + sumArea(arr));
	}

}

abstract class Shape {
	Point p;
	
	public Shape() {
		this(new Point(0, 0));
	}
	
	public Shape(Point p) {
		this.p = p;
	}
	
	public abstract double calcArea(); // 도형 면적 계산 메서드
	
	public Point getPosition() {
		return p;
	}
	
	public void setPosition(Point p) {
		this.p = p;
	}
}
	
class Point {
	int x;
	int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}
	
class Circle extends Shape {
	double r; // 반지름
	
	public Circle() {
		super();
	}
	
	public Circle(double r) {
		this.r = r;
	}
	
	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}
	
	public double calcArea() {
		return r * r * Math.PI;
	}
}
	
class Rectangle extends Shape {
	int width; // 폭
	int height; // 넓이
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point p, int width, int height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	public double calcArea() {
		return width * height;
	}
	
	public boolean isSquare() {
		
		if(width == height && (width * height) != 0) {
			return true;
		}
		return false;
	}
	
}