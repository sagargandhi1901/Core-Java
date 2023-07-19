package Day18;

class Cat1 {
	int i;

	Cat1(int i) {
		this.i = i;
	}
}

class Dog1 implements Cloneable {
	Cat1 cat;
	int j;

	Dog1(Cat1 cat, int j) {
		this.cat = cat;
		this.j = j;
	}

	// not changing any implementation logic
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ShallowCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat1 cat = new Cat1(10);
		Dog1 d1 = new Dog1(cat, 20);
		System.out.println("Acutal object => " + d1.cat.i + " " + d1.j);

		System.out.println("Perfoming cloning");
		Dog1 d2 = (Dog1) d1.clone();
		d2.cat.i = 100;
		d2.j = 200;
		System.out.println("Acutal object after cloning => " + d1.cat.i + " " + d1.j);

		System.out.println("Cloned object data => " + d2.cat.i + " " + d2.j);
	}
}