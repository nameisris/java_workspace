
public class GenericTest {

	public static void main(String[] args) {
		Data<String> d = new Data<>();
		
		d.setData("hong");
		String s = d.getData();
		System.out.println(s);
		
		Data<Integer> d2 = new Data<>();
		
		d2.setData(200);
		int i = d2.getData();
		System.out.println(i);
		
		Data<Person> d3 = new Data<>();
		d3.setData(new Person("james", 30));
		Person p = d3.getData();
		System.out.println(p);

		// d2 = d; // 에러
		// 다른 타입으로 생성된 제너릭 객체는 동일한 클래스가 아님 (상속관계도 아님)
		
		Data<Person> d4 = new Data<>();
		d4 = d3;
		// 단, 같은 타입으로 생성된 제너릭 객체는 동일한 클래스
	}

}

class Data<T> {
	T data;
	
	void setData(T data) {
		this.data = data;
	}
	
	T getData() {
		return data;
	}
}