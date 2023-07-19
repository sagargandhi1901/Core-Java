package Day15;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add("Sagar");
		list1.add('S');
		list1.add(123);
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		System.out.println(list2);
		
		list2.addAll(list1);
		System.out.println(list2);
		
		System.out.println(list2.contains(123));
		System.out.println(list2.contains(1234));
		System.out.println("value at index 3 : " + list2.get(3));
		System.out.println("Is list2 empty : " + list2.isEmpty());
		System.out.println("number of elements in list1 : " + list1.size());
		System.out.println(list2.getClass());
		
		ArrayList list3 = new ArrayList();
		list3.add(12);
		list3.add("Pune");
		list3.add("India");
		list3.add(90.45);
		list3.add(12);
		System.out.println(list3);
		
//		list3.remove(0);				using index
		System.out.println(list3);
		
		list3.add(2, 101);
		System.out.println(list3);
		
		ArrayList list4 = new ArrayList();
		list4.add(1000);
		list4.add(2000);
		System.out.println(list4);
		
		list4.addAll(1, list3);
		System.out.println(list4);
	}
}