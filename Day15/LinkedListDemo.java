package Day15;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.add(25);
		list1.add("Sagar");
		list1.add("Pune");
		list1.add(5.10);
		System.out.println(list1);
		
		list1.addFirst(123);
		list1.addLast(456);
		System.out.println(list1);
	}
}