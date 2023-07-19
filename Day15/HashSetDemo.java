package Day15;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashSet1 = new HashSet();
		hashSet1.add(100);
		hashSet1.add(50);
		hashSet1.add(75);
		hashSet1.add(125);
		hashSet1.add(150);
		hashSet1.add(150);				// duplicated are not allowed
		hashSet1.add(150);
		hashSet1.add(150);
		hashSet1.add("Sagar");
		System.out.println(hashSet1);
	}

}
