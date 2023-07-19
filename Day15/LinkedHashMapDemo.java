package Day15;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap map1 = new LinkedHashMap();
		map1.put(10, "Sachin");
		map1.put(7, "Dhoni");
		map1.put(18, "Kohli");
		System.out.println(map1);
		
		System.out.println();
		
		Set set1 = map1.keySet();
		System.out.println(set1.getClass().getName());
		System.out.println(set1);
		
		System.out.println();
		
		Collection col = map1.values();
		System.out.println(col);
		
		System.out.println();
		
		Set set2 = map1.entrySet();
		System.out.println(set2);
		
		System.out.println();

	}

}
