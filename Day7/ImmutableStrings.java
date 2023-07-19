package Day7;

public class ImmutableStrings {
	public static void main(String[] args) {
		
		String str = "Sagar";
		System.out.println(str);
		
		String str2 = new String("Sagar");
		System.out.println(str2);
		
		// == and equals() method
		String s1 = "Sagar";
		String s2 = "Sagar";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Sagar");
		String s4 = new String("Sagar");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		// equalsIgnoreCase() method
		String s5 = "SAGAR";
		String s6 = "sagar";
		System.out.println(s5.equals(s6));
		System.out.println(s5.equalsIgnoreCase(s6));
		
		// compareTo() method
		String s7 = "Gandhi";
		String s8 = "GandhiSagar";
		System.out.println(s7.compareTo(s8));
		
		String s9 = "SagarGandhi";
		String s10 = "Sagar";
		System.out.println(s9.compareTo(s10));
		
		// concat() method
		String s11 = "Sagar";
		System.out.println(s11);
		s11 = s11.concat(" Gandhi");
		System.out.println(s11);
		
		String s12 = "Sagar";
		String s13 = " Gandhi";
		String s14 = s12 + s13;
		String s15 = "Sagar" + " Gandhi";
		String s16 = "Sagar Gandhi";
		System.out.println(s14);
		System.out.println(s15);
		System.out.println(s14 == s15);
		System.out.println(s15 == s16);
		
		// String concatenation with numbers
		String s17 = "Sagar" + 10;
		System.out.println(s17);
		
		String s18 = "Sagar" + 10 + 23;
		System.out.println(s18);
		
		String s19 = 10 + "Sagar";
		System.out.println(s19);
		
		String s20 = 10 + 23 + "Sagar";
		System.out.println(s20);
		
		String s21 = "Sagar" + (10 + 23);
		System.out.println(s21);
	}
}
