package Day15;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		
		ArrayDeque deque1 = new ArrayDeque();
		deque1.add(12);
		deque1.add(24);
		deque1.add("Sagar");
		deque1.add("Gandhi");
		System.out.println(deque1);
		
		deque1.addLast("Sagar");
		System.out.println(deque1);
		
		deque1.addFirst("ABC");
		deque1.addLast("XYZ");
		System.out.println(deque1);
	}
}