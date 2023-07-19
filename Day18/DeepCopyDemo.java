package Day18;

class Cat11 {
	int i;

	Cat11(int i) {
		this.i = i;
	}
}

class Dog11 implements Cloneable {
	Cat11 cat;
	int j;

	Dog11(Cat11 cat, int j) {
		this.cat = cat;
		this.j = j;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Cat11 c1 = new Cat11(cat.i);
		Dog11 d1 = new Dog11(c1, j);
		return d1;
	}
}

public class DeepCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Cat11 cat=new Cat11(10);
		Dog11 d1=new Dog11(cat,20);
		System.out.println("Acutal object => "+d1.cat.i+" "+d1.j);
		
		System.out.println("Perfoming cloning");
		
		Dog11 d2=(Dog11)d1.clone();
		d2.cat.i=100;
		d2.j=200;
		System.out.println("Acutal object after cloning => "+d1.cat.i+" "+d1.j);
		System.out.println("Cloned object data => "+d2.cat.i+" "+d2.j);
	}
}