package Day15;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet hashSet1 = new LinkedHashSet();
		hashSet1.add(100);
		hashSet1.add(50);
		hashSet1.add(75);
		hashSet1.add(125);
		hashSet1.add(150);
		hashSet1.add(150);
		hashSet1.add(125);
		hashSet1.add(125);
		hashSet1.add("Sagar");
		System.out.println(hashSet1);
	}
}