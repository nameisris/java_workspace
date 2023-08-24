package shapes;

public class Circle extends Shape {
	private Point center;
	private int radius;
	
	// 기본 생성자?
	public Circle() {
//		super("black");
//		center = new Point();
	}
	
	public Circle(String color, Point center, int radius) {
		super(color);
		this.center = center; // 매개변수 center는 new 연산자로 넘어온 Point 타입의 인스턴수이기에, 현재 행에서 new 연산자로 생성할 필요 X
		this.radius = radius;
	}
	
	public Circle(String color, int x, int y, int radius) {
		super(color);
		center = new Point(x, y);
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
		System.out.println(String.format("[원: 색(%s), 중심점%s, 반지름(%d)]",
				getColor(), center.info(), getRadius()));
	}
}
