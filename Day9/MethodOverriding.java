package Day9;

class Animal {
	
}

class Dog extends Animal {
	
}

class A {
	
	public void doSomething() {
		System.out.println("doing something");
	}
	
	public Animal isAnimal() {
		return new Animal();
	}
	
	public void display(int i) {
		System.out.println("displaying value : " + i);
	}
}

class B extends A {
	
	@Override
	public void doSomething() {
		System.out.println("doing something else");
	}
	
	@Override
	public Dog isAnimal() {
		return new Dog();
	}
	
	@Override
	public void display(int i) {
		System.out.println("displaying value square : " + i * i);
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		
	}
}
