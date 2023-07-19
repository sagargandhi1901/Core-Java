package Day15;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue queue1 = new PriorityQueue();
		queue1.add(10);
		queue1.add(20);
		queue1.add(30);
		queue1.add(50);
		queue1.add(60);
		queue1.add(70);
		queue1.add(80);
		queue1.add(10);
		System.out.println(queue1);
	}
}