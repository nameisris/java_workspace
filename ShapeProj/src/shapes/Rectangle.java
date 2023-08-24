package shapes;

public class Rectangle extends Shape {
	private Point startPos;
	private int width;
	private int height;

	public Rectangle() {
//		super("black");
//		startPos = new Point();
	}
	
	public Rectangle(String color, Point startPos, int width, int height) {
		super(color);
		this.startPos = startPos;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String color, int x, int y, int width, int height) {
		super(color);
		startPos = new Point(x, y);
		this.width = width;
		this.height = height;
	}

	public Point getStartPos() {
		return startPos;
	}

	public void setStartPos(Point startPos) {
		this.startPos = startPos;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(String.format("[사각형: 색(%s), 시작점%s, 너비(%d), 높이(%d)]",
				getColor(), startPos.info(), getWidth(), getHeight()));
	}
}
