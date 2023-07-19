package Day9;

class P {
	public static void display() {
		System.out.println("P is parent");
	}
}

class Q extends P {
	
	public static void display() {
		System.out.println("Q is P");
	}
}

public class MethodHiding {
	public static void main(String[] args) {
		Q q = new Q();
		q.display();
		
		P p = new Q();
		p.display();
	}
}
