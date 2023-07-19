package Day19;

import java.util.Optional;

public class OptionalClassDemo {
	public static void main(String[] args) {
		
//		String str = "Sagar";
		String str = null;
		
//		if (str == null) {
//			System.out.println("This is a null object");
//		} else {
//			System.out.println("Length : " + str.length());
//		}
		
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		System.out.println(optional.isEmpty());
		System.out.println(optional.orElse("No value"));
	}
}