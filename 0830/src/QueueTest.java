import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		// FIFO 구조
		queue.add(100);		// enqueue
		queue.offer(200);	// enqueue
		queue.offer(300);	// enqueue
		System.out.println(queue.poll());	// dequeue
		System.out.println(queue.poll());	// dequeue
		System.out.println(queue.remove());	// dequeue
		
		queue.clear();	// 초기화
		
	}

}
