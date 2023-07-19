package Day7;

public class Task4 {
	public static void main(String[] args) {
		String s1 = "Sagar Gandhi";
		String s2 = "";
		
		String []str = s1.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			s2 = s2 + str[i] + " ";
		}
		System.out.println(s2);
	}
}
