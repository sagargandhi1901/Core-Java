package Day16;

import java.util.ArrayList;
import java.util.Collections;

class Student2 {
	int age;
	String name;
	String tech;

	public Student2(int age, String name, String tech) {
		this.age = age;
		this.name = name;
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "\nStudent [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}
}

// 1st implementation
//class ComparatorImpl implements Comparator<Student2> {
//	
//	@Override
//	public int compare(Student2 o1, Student2 o2) {
//		return o1.age - o2.age;
//	}
//}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Student2> students = new ArrayList<Student2>();
		students.add(new Student2(25, "Sagar", "Java"));
		students.add(new Student2(21, "Sparsh", "C"));
		students.add(new Student2(27, "Diksha", "Excel"));

//		Comparator<Student2> comparator = new ComparatorImpl();
//		Collections.sort(students, comparator);

		// 2nd implementation
//		Comparator<Student2> comparator = new Comparator<Student2>() {
//			
//			@Override
//			public int compare(Student2 o1, Student2 o2) {
//				return o1.age - o2.age;
//			}
//		};
//		Collections.sort(students, comparator);

		// 3rd implementation
//		Comparator<Student2> comparator = (s1, s2) -> {
//			return s1.age - s2.age;
//		};
//		Collections.sort(students, comparator);
		
		// 4th implementation
		Collections.sort(students, (s1, s2) -> s1.age - s2.age);

		System.out.println(students);
	}
}