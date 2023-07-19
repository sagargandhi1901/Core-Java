package Day14;

class ProcessExcecution extends Thread {
	
	@Override
	synchronized public void run() {
		String nameOfThread = Thread.currentThread().getName();
		
		if (nameOfThread.equals("Process1")) {
			doProcess1();
		} else if (nameOfThread.equals("Process2")) {
			doProcess2();
		} else {
			doProcess3();
		}
	}
	
	public void doProcess1() {
		System.out.println("Executing process one");
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Process1 ended");
		System.out.println("************************************");
	}
	
	public void doProcess2() {
		System.out.println("Executing process two");
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Process2 ended");
		System.out.println("************************************");
	}
	
	public void doProcess3() {
		System.out.println("Executing process three");
		for (int i = 0; i < 2; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Process2 ended");
		System.out.println("************************************");
	}
}

public class MultiThreadingDemo5 {
	public static void main(String[] args) {
		ProcessExcecution excecution1 = new ProcessExcecution();
		ProcessExcecution excecution2 = new ProcessExcecution();
		ProcessExcecution excecution3 = new ProcessExcecution();
		
		excecution1.setName("Process1");
		excecution2.setName("Process2");
		excecution3.setName("Process3");
		
		excecution1.start();
		excecution2.start();
		excecution3.start();
	}
}
