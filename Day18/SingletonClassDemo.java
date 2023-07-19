package Day18;

class Singleton {
	
	private Singleton() {
		
	}
	
	private static Singleton obj = null;
	
	public static Singleton getInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
}
public class SingletonClassDemo {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}

}
