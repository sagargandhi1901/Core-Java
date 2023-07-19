package Day14;


class Process1 {
	public void doSomething() throws InterruptedException {
		System.out.println("Executing process one");
		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000);
		}
		System.out.println("Process1 ended");
		System.out.println("************************************");
	}
}

class Process2 {
	public void doSomething() throws InterruptedException {
		System.out.println("Executing process two");
		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000);
		}
		System.out.println("Process2 ended");
		System.out.println("************************************");
	}
}

class Process3 {
	public void doSomething() throws InterruptedException {
		System.out.println("Executing process three");
		for (int i = 0; i < 2; i++) {
			Thread.sleep(2000);
		}
		System.out.println("Process2 ended");
		System.out.println("************************************");
	}
}

public class MultiThreadingDemo2 {
	public static void main(String[] args) throws InterruptedException {
		Process1 process1 = new Process1();
		Process2 process2 = new Process2();
		Process3 process3 = new Process3();
		
		process1.doSomething();
		process2.doSomething();
		process3.doSomething();
	}
}