package Day7;

public class Task2 {
	public static void main(String[] args) {
		
		// case 1 -> all lower case
		String s1 = "sagar";
		String s2 = "";
		
		for (int i = 0; i < s1.length(); i++) {
			char ch = (char)(s1.charAt(i) - 32);
			s2 = s2 + ch;
		}
		
		System.out.println(s2);
		
		// case 2 -> mixed characters
		String s3 = "sAgAr";
		String s4 = "";
		
		for (int i = 0; i < s3.length(); i++) {
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
				char ch = (char)(s1.charAt(i) - 32);
				s4 = s4 + ch;
			}
		}
		
		System.out.println(s4);
	}
}