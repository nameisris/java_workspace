package ex11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Ex2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 중복 허용, 삽입(저장) 순서 유지
		
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list);	// 중복 비허용
		TreeSet tset = new TreeSet(set);	// 오름차순 정렬
		Stack stack = new Stack();			// 꺼낼 때 후입선출 (LIFO)
		
		stack.addAll(tset);
		
		while (!stack.empty())
			System.out.println(stack.pop());
	}

}

// 7
// 6
// 3
// 2
