package Day7;

public class MutableStrings {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Sagar");
		System.out.println(sb);
 		sb.append(" Gandhi");
		System.out.println(sb);
		
		StringBuffer s1 = new StringBuffer("Gandhi");
		StringBuffer s2 = new StringBuffer("Gandhi");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));					// here it will check for reference, not the value
		
		StringBuilder s3 = new StringBuilder("Sagar");
		StringBuilder s4 = new StringBuilder("Sagar");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		// final vs immutability
		final StringBuffer s5 = new StringBuffer("Sachin");
		s5.append(" Tendulkar");
		System.out.println(s5);
//		s5 = new StringBuffer(" India");					// this will give error as sb is made final and we cannot change its reference
		
		// capacity
		StringBuffer s6 = new StringBuffer();
		System.out.println(s6.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(s6.capacity());
		s6.append("qrstuvugdowuigfdwtedwyeqry");
		System.out.println(s6.capacity());
		
		StringBuffer s7 = new StringBuffer(20);
		System.out.println(s7.capacity());
		
		StringBuffer s8 = new StringBuffer("Sagar");
		System.out.println(s8.capacity());
		System.out.println(s8.length());
		
		StringBuffer s9 = new StringBuffer();
		s9.append("The value of PI is : ");
		s9.append(3.14);
		System.out.println(s9);
		System.out.println(s9.length());
		System.out.println(s9.capacity());
		
		StringBuffer s10 = new StringBuffer("abcdef");
		s10.insert(3, "xyz");
		System.out.println(s10);
		s10.insert(3, 9);
		System.out.println(s10);
		
		s10.delete(5, 7);
		System.out.println(s10);
		
		s10.deleteCharAt(3);
		System.out.println(s10);
		
		s10.reverse();
		System.out.println(s10);
		
		StringBuffer s11 = new StringBuffer(1000);
		System.out.println(s11.capacity());
		s11.append("Sagar");
		System.out.println(s11.capacity());
		s11.trimToSize();
		System.out.println(s11.capacity());
	}
}