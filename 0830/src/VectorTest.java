import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		Enumeration<Integer> e = vector.elements(); // vector 제네릭 타입과 맞춰줌
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		// Iterator: 컬렉션 프레임워크에서 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화한 것
		// 인터페이스
//		public interface Iterator {
//			boolean hasNext();
//			Object next();
//			void remove();
//		}
		// hasNext(): 읽어올 요소가 남았는지 확인하는 메서드 (있으면 true, 없으면 false 반환)
		// next(): 읽어올 요소가 남아있는지 확인하는 메서드 (Object 타입이기에, 아무 타입으로 반환 가능)
		// remove(): next()로 읽어온 요소를 삭제 (next()를 호출한 다음 선택적으로 사용)
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {				// 만약 가져올 값이 있다면, true 반환
			System.out.println(it.next());	// 만약 가져올 값이 있다면, 해당 값을 해당 타입으로 반환
		}
		
		System.out.println("===================");;
		ListIterator<Integer> lit = list.listIterator();
		// 맨 앞부터 시작해서 뒤로
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		System.out.println("===================");;
		
		// 맨 뒤부터 시작해서 앞으로
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
