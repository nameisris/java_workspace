package ex6;

public class Ex7 {

	public static void main(String[] args) {
		MyPoint pos1 = new MyPoint();
		pos1.x = 1;
		pos1.y = 1;
		
		System.out.println(pos1.getDistance(2, 2));
		
		MyPoint pos2 = new MyPoint();
		pos2.x = 2;
		pos2.y = 2;
		
		System.out.println(pos1.getDistance(pos2));
		
		// (pos1.x, pos1.y)와 (2, 2) 사이의 거리를 구할 심산

	}

}

class MyPoint {
	int x;
	int y;
	
	double getDistance(int x1, int y1) {
		double result;
		
		result = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
		
		return result;
	}
	
	// Overloading
	double getDistance(MyPoint pos) {
		double result;
		
		result = Math.sqrt(Math.pow(x - pos.x, 2) + Math.pow(y - pos.y, 2));
		
		return result;
	}
}