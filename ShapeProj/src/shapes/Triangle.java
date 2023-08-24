package shapes;

public class Triangle extends Shape {
	
	private Point p1, p2, p3;
	
	public Triangle() {
//		super("black");
//		p1 = new Point();
//		p2 = new Point();
//		p3 = new Point();
	}
	
	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public Triangle(String color, int a1, int a2, int b1, int b2, int c1, int c2) {
		super(color);
		p1 = new Point(a1, a2);
		p2 = new Point(b1, b2);
		p3 = new Point(c1, c2);
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
		System.out.println(String.format("[삼각형: 색(%s), 점1%s, 점2%s, 점3%s]",
				getColor(), p1.info(), p2.info(), p3.info()));
	}
}
