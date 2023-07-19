package Day16;

import java.util.ArrayList;

// creating a generic class
class Gen<T> {
	T obj;
	
	public Gen(T obj) {
		this.obj = obj;
	}
	
	public void showType() {
		System.out.println("Type is : " + obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
	}
}

public class GenericsDemo {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sagar");
		al.add("Gandhi");
//		al.add(10);
		
		String firstName = al.get(0);
		String lastName = al.get(1);
		
		System.out.println(firstName + " " + lastName);
		
		// Testing the generic class
		Gen<Integer> gen1 = new Gen<Integer>(10);
		gen1.showType();
		System.out.println(gen1.getObject());
	}
}