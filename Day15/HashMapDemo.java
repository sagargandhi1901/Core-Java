package Day15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap map1 = new HashMap();
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

		Iterator itr = set2.iterator();
		while (itr.hasNext()) {
			Map.Entry data = (Map.Entry) itr.next();
			System.out.println(data.getKey() + " : " + data.getValue());
		}
		
		System.out.println();
		
		Iterator itr2 = set2.iterator();
		while (itr2.hasNext()) {
			Map.Entry data = (Map.Entry) itr2.next();
			
			if (data.getKey().equals(18)) {
				data.setValue("Virat");
			}
			System.out.println(data.getKey() + " : " + data.getValue());
		}
		
		System.out.println();
		
		HashMap map2 = new HashMap();
		map2.put(null, 10);
		map2.put(null, null);
		System.out.println(map2);
	}
}
