import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		System.out.println(stack.pop());	// 500
		System.out.println(stack.pop());	// 400
		System.out.println(stack.pop());	// 300
		System.out.println(stack.pop());	// 200
		System.out.println(stack.pop());	// 100
		
			
	}

}
