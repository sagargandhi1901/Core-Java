package Day16;

enum Status {
	SUCCESS, 
	FAILED, 
	PENDING;
}

enum Result {
	PASS,
	FAIL, 
	NORESULT;
	
	int marks;

	Result() {
		System.out.println("Result.Result()");
	}
	
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class EnumsDemo {
	public static void main(String[] args) {
		
		enum Gender {
			MALE, 
			FEMALE, 
			OTHERS;
		}
		
		Status st = Status.SUCCESS;
		System.out.println(st);
		
		Gender g = Gender.MALE;
		System.out.println(g);
		System.out.println(g.ordinal());								// return the index at which the enum is placed
		
		Result.PASS.setMarks(50);
		int marks = Result.PASS.getMarks();
		System.out.println(marks);
	}
}