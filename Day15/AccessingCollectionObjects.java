package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AccessingCollectionObjects {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(10);
		l.add(70);
		l.add(80);
		l.add(40);
		l.add(90);
		l.add(20);
		l.add(50);
		l.add(30);
		l.add(110);

		// for loop
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}

		System.out.println();

		// for-each loop
		for (Object obj : l) {
			System.out.print(obj + " ");
		}

		System.out.println();

		// Iterator
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		// List iterator
		ListIterator LItr = l.listIterator(l.size());
		while (LItr.hasPrevious()) {
			System.out.print(LItr.previous() + " ");
		}
		
		System.out.println();
		System.out.println();

		LinkedList l2 = new LinkedList();
		l2.add(10);
		l2.add(70);
		l2.add(80);
		l2.add(40);
		l2.add(90);
		l2.add(20);
		l2.add(50);
		l2.add(30);
		l2.add(110);

		// Iterator
		Iterator itr2 = l2.iterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}

		System.out.println();
		
		// descending iterator
		Iterator itr3 = l2.descendingIterator();
		while (itr3.hasNext()) {
			System.out.print(itr3.next() + " ");
		}
	}
}