package Day10;

// dependent object
class Course {
	private String courseId;
	private String courseName;
	private Integer courseCost;
	
	// constructor injection
	public Course(String courseId, String courseName, Integer courseCost) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseCost = courseCost;
	}

	// getters to get the values 
	public String getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public Integer getCourseCost() {
		return courseCost;
	}
}

class Studentt {
	private Integer studentId;
	private String name;
	private Integer age;
	
	// Has-A variable
	private Course[] courses;

	// constructor injection
	public Studentt(Integer studentId, String name, Integer age, Course[] courses) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.courses = courses;
	}
	
	// displaying the student details
	public void getStudetDetils() {
		System.out.println("*******************Student Details*******************");
		System.out.println("Id : " + studentId);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("-----------------------");
		System.out.println("Courses details :: ");
		for (Course course :  courses) {
			System.out.println("Course id : " + course.getCourseId());
			System.out.println("Course name : " + course.getCourseName());
			System.out.println("Course cost : " + course.getCourseCost());
			System.out.println();
		}
	}
}

public class ManyToManyAssociation {
	public static void main(String[] args) {
		// creating the dependent objects
		Course course1 = new Course("Java101", "Java", 1000);
		Course course2 = new Course("JS101", "Javascript", 1100);
		Course course3 = new Course("Py101", "Python", 800);
		
		// creating an array to perform many to many association
		Course[] coursesForStudent1 = new Course[2];
		coursesForStudent1[0] = course1;
		coursesForStudent1[1] = course3;
		
		Course[] coursesForStudent2 = new Course[2];
		coursesForStudent2[0] = course2;
		coursesForStudent2[1] = course3;
		
		Course[] coursesForStudent3 = new Course[3];
		coursesForStudent3[0] = course1;
		coursesForStudent3[1] = course2;
		coursesForStudent3[2] = course3;	
		
		// creating target objects
		Studentt student1 = new Studentt(123, "Sagar", 25, coursesForStudent1);
		Studentt student2 = new Studentt(101, "Diksha", 27, coursesForStudent2);
		Studentt student3 = new Studentt(1011, "Sparsh", 22, coursesForStudent3);
		
		student1.getStudetDetils();
		System.out.println();
		
		student2.getStudetDetils();
		System.out.println();
		
		student3.getStudetDetils();
		System.out.println();
	}
}
