package Day14;

class Process11 extends Thread {
	
	@Override
    public void run() {
		System.out.println("Executing process one");
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Process1 ended");
		System.out.println("************************************");
	}		
}

class Process22 extends Thread {
	@Override
    public void run() {
		System.out.println("Executing process two");
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Process2 ended");
		System.out.println("************************************");
	}	
}

class Process33 extends Thread {
	@Override
    public void run() {
		System.out.println("Executing process three");
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Process3 ended");
		System.out.println("************************************");
	}	
}

public class MultiThreadingDemo3 {

	public static void main(String[] args) {
		Process11 process1 = new Process11();
		Process22 process2 = new Process22();
		Process33 process3 = new Process33();
		
		process1.start();
		process2.start();
		process3.start();
	}
}
