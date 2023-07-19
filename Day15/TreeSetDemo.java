package Day15;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet set1 = new TreeSet();
		set1.add(100);
		set1.add(50);
		set1.add(150);
		set1.add(25);
		set1.add(75);
		set1.add(125);
		set1.add(175);				// dulicate will not be stored
		System.out.println(set1);
		
		System.out.println(set1.higher(25));
		System.out.println(set1.ceiling(25));
		
		TreeSet set2 = new TreeSet();
		set2.add(35);
		set2.add(40);
		set2.add(42);
		set2.add(20);
		set2.add(15);
		set2.add(75);
		System.out.println(set2);
	}
}