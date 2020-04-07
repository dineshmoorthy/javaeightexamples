package collectionexamples;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {

	public static void main(String[] args) {
		Deque<String> deque  = new ArrayDeque<String>();
		
		/*deque.add("one");
		deque.add("two");
		deque.add("three");
		*/
		// uncomment above set and see the difference in output
		deque.push("one");
		deque.push("two");
		deque.push("three");
		
		int size = deque.size() - 1;
		while(size >= 0){
			System.out.println(deque.pop());
			size--;
		}
		
	}
}
