package ex11;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList();
		ArrayList<Integer> list2 = new ArrayList();
		ArrayList<Integer> kyo = new ArrayList(); // 교집합
		ArrayList<Integer> cha = new ArrayList(); // 차집합
		ArrayList<Integer> hap = new ArrayList(); // 합집합
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		// l1.addAll(l2);
		// l1에 l2를 모두 더해줌 (합집합)
		
		// l1.retainAll(l2);
		// l1에서 l2와 중복되는 값들만 남겨줌 (교집합)
		
		// l1.removeAll(l2);
		// l1에서 l2와 중복되는 모든 값들을 지워줌 (차집합)
		
		kyo.addAll(list1);
		kyo.retainAll(list2);
		
		cha.addAll(list1);
		cha.removeAll(list2);
		
		hap.addAll(cha);
		hap.addAll(list2);
		
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		System.out.println("kyo = " + kyo);
		System.out.println("cha =" + cha);
		System.out.println("hap = " + hap);
	}

}
