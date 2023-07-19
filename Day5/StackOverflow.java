package Day5;

public class StackOverflow {
	
	// this infinite recursive call will cause java.lang.StackOverflowError
	static void add () {
		add();
	}
	
	public static void main(String[] args) {
		add();
	}

}
