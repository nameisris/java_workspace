import shapes.Shape;

public class ShapeSet {
	static Shape[] shps = new Shape[100];
	static int cnt = 0;
	
	public void add(Shape shp) {
		shps[cnt++] = shp;
	}
	
	public void allShapeDraw() {
		for(int i = 0;i< cnt;i++) {
			shps[i].draw();
		}
	}

}
