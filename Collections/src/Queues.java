import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class Queues {

	public static void main(String[] args) {
		ArrayBlockingQueue queue = new ArrayBlockingQueue(5);
		queue.offer("Five");
		queue.offer("Two");
		queue.offer("Three");
		queue.offer("One");
		queue.offer("Four");
		queue.offer("Six"); //will not get added
		System.out.println(queue);
		String ah = (String) queue.poll();
		String gh = (String) queue.peek();
		System.out.println(ah+"\n"+gh);
	}

}
