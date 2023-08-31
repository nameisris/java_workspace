package ex11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); // 중복 허용, 삽입(저장) 순서 유지
		
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);

		// 중복 비허용
		HashSet<Integer> set = new HashSet<>(list);	// 3, 6, 2, 7
		
		// 정렬 (오름차순)
		TreeSet<Integer> tset = new TreeSet<>(set);	// 2, 3, 6, 7
		
		// 꺼낼 때 LIFO (후입선출)
		// 즉, 역순으로 정렬
		Stack<Integer> stack = new Stack<>();			// 7, 3, 6, 2
		stack.addAll(tset);
		
		while (!stack.empty())
			System.out.println(stack.pop());
	}

}

// 7
// 6
// 3
// 2
