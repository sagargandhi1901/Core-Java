package Day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {

	private static final long serialVersionUID = -4878862069590330750L;

	int i = 10;
	int j = 20;
	transient int k = 30;

	Dog() {
		System.out.println("Dog class Constructor called");
	}
}

class Cat implements Serializable {
	
	private static final long serialVersionUID = 4413280471705620831L;
	
	int i = 30;
	int j = 40;

	Cat() {
		System.out.println("Cat class Constructor called");
	}
}

public class SerializationDeserializationDemo {
	public static void main(String[] args) throws Exception {

		Dog dog = new Dog();
//		Cat cat = new Cat();
		System.out.println("Serialization started...");

		FileOutputStream fos = new FileOutputStream("test.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);
//		oos.writeObject(cat);

		System.out.println("Serialization ended...");
		System.out.println();

		System.out.println("Deserialization started...");
		FileInputStream fis = new FileInputStream("test.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog newDog = (Dog) ois.readObject();
//		Cat newCat = (Cat) ois.readObject();

		System.out.println("Deserialization ended...");
		System.out.println(newDog.i + " " + newDog.j + " " + newDog.k);
//		System.out.println(newCat.i + " " + newCat.j);
	}
}