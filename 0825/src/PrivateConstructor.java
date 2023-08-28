
public class PrivateConstructor {

	public static void main(String[] args) {
		// new 연산자 없이 (생성자 없이) 객체 생성
		// 현재 생성자가 private
		MyArray ma1 = MyArray.getMyArrayReference();
		MyArray ma2 = MyArray.getMyArrayReference();
		
		// ma1 == ma2
		System.out.println(ma1 == ma2);
	
		// 같은 값 출력
		ma1.setData(0, 100);
		System.out.println(ma1.getData(0));
		System.out.println(ma2.getData(0));
	}

}

class MyArray {
	private int[] arr = new int[10];
	private static MyArray myArray;
	
	private MyArray() {
		
	}
	
	public static MyArray getMyArrayReference() {
		if(myArray == null) {
			myArray = new MyArray();
		}
		
		// return new MyArray(); // ma1과 ma2가 서로 다른 객체
		return myArray; // ma1과 ma2가 서로 같은 객체를 가리킴
	}
	
	public void setData(int idx, int data) {
		arr[idx] = data;
	}
	
	public int getData(int idx) {
		return arr[idx];
	}
}