package Day2;

public class IncrementDecrementOperator {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int c = 5;
		int d = 0;
		d = ++c;
		System.out.println(c);
		System.out.println(d);
		
		int e = 5;
		int f = 0;
		f = e++ + e++ + ++e + ++e;
		System.out.println(e);
		System.out.println(f);
		
		int g = 5;
		int h = 0;
		h = g++ + ++g + --g + g-- + g++;
		System.out.println(g);
		System.out.println(h);
	}
}
