package Day4;

class Demo {
	// instance variable : age
	int age = 10;;
	
	void show() {
		// local variable : newAge
		int age = 45;						// local and instance variables can have same name, while accessing we have to check to access which one
		int newAge = 24;
		System.out.println("age : " + age);
		System.out.println("new age : " + newAge);
	}
	
	void display() {
		// cannot access local variable : newAge as it's scope ended earlier
//		System.out.println(newAge);
		System.out.println(age);
	}
}
public class InstanceLocalVariables {
	public static void main(String[] args) {
		Demo obj= new Demo();
		obj.show();
	}
}
