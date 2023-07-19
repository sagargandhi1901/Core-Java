package Day16;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	int age;
	String name;
	String tech;

	public Student(int age, String name, String tech) {
		this.age = age;
		this.name = name;
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "\nStudent [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// will sort based on age, if positive is retured -> means first age is bigger then swapping will happen, but in negative result, it will not swap
		return this.age - o.age; 						// it will sort age in ascending order, if we want in reverse -> return o.age - this.age
		
//		return this.name.compareTo(o.name);				// it will sort name in ascending order(alphabetical)
		
//		return this.tech.length() - o.tech.length();	// it will sort tech in String length order
		
//		return this.name.charAt(1) - o.name.charAt(1);	// it will sort name in ascending order(alphabetical) bases on its second character
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(25, "Sagar", "Java"));
		students.add(new Student(21, "Sparsh", "C"));
		students.add(new Student(27, "Diksha", "Excel"));
		
		Collections.sort(students);
		
		System.out.println(students);
	}
}