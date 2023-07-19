package Day2;

public class TypeCasting {
	public static void main(String[] args) {
		
		byte a = 10;
		double b;
		b = a;						// implicit
		System.out.println(a);
		System.out.println(b);
		
		double c = 10.5;
		byte d;
		d = (byte) c;				// explicit
		System.out.println(c);
		System.out.println(d);
		
		int e = 45;
		float f;
		f = e;						// implicit
		System.out.println(e);
		System.out.println(f);
		
		float g = 45.67F;
		int h;
		h = (int) g;				// explicit
		System.out.println(g);
		System.out.println(h);
	}
}
