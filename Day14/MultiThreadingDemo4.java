package Day14;

class Process111 implements Runnable {
	
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

class Process222 implements Runnable {
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

class Process333 implements Runnable {
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

public class MultiThreadingDemo4 {
	public static void main(String[] args) {
		Process111 process1 = new Process111();
		Process222 process2 = new Process222();
		Process333 process3 = new Process333();
		
		Thread thread1 = new Thread(process1);
		Thread thread2 = new Thread(process2);
		Thread thread3 = new Thread(process3);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}