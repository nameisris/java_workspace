
public class CloneTest {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		Object obj = p.clone(); // Object obj = p; 와 달리, 복제하는 것 (레퍼런스 값이 다름)
		Point cp = (Point) obj; // clone() 메서드를 오버라이딩 했기에, return 값이 Object이므로 downcasting
		
		System.out.println(p);
		System.out.println(cp);

	}

}

class Point implements Cloneable {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x + ", " + y;
	}
	
	// clone() 오버라이딩 시,
	// 해당 클래스에서 implements Cloneable 해주어야 함
	@Override
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		return obj;
	}
}