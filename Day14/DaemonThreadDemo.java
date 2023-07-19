package Day14;

class Process101 implements Runnable {
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("Doing something...");
				Thread.sleep(3000);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.isDaemon());

		Process101 process101 = new Process101();
		
		Thread thread2 = new Thread(process101);
		System.out.println(thread2.isDaemon());
		thread2.setDaemon(true);						// after sleeping one time it will not execute further
		thread2.start();

//		thread2.setDaemon(true);
//		System.out.println(thread2.isDaemon());

//		thread1.setDaemon(true);
//		System.out.println(thread1.isDaemon());
	}
}