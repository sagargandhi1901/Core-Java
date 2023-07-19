package Day14;

/*
class Demo extends Thread {
 
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Child Thread...");
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
*/

/*
class Demo2 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Child Thread...");
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
*/

public class RunMethodWithLambda {
	public static void main(String[] args) {

//		First way
//		Demo demo = new Demo();
//		demo.start();

//		Second way
//		Demo2 demo2 = new Demo2();
//		Thread t = new Thread(demo2);
//		t.start();

//		Third way -> with anonymous class		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 1; i <= 5; i++) {
//					try {
//						System.out.println("Child Thread...");
//						Thread.sleep(1000);
//					} catch (Exception ex) {
//						ex.printStackTrace();
//					}
//				}
//			}
//		});
//		thread.start();

//		Fourth way -> with anonymous but not creating thread referance
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for (int i = 1; i <= 5; i++) {
//					try {
//						System.out.println("Child Thread...");
//						Thread.sleep(1000);
//					} catch (Exception ex) {
//						ex.printStackTrace();
//					}
//				}
//			}
//		}).start();

//		Fifth way -> with lambda
//		Thread thread = new Thread(
//		() -> {
//			for (int i = 1; i <= 5; i++) {
//				try {
//					System.out.println("Child Thread...");
//					Thread.sleep(1000);
//				} catch (Exception ex) {
//					ex.printStackTrace();
//				}
//			}
//		});
//		thread.start();
		
//		Sixth way -> with lambda without referance
		new Thread(
		() -> {
			for (int i = 1; i <= 5; i++) {
				try {
					System.out.println("Child Thread...");
					Thread.sleep(1000);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}).start();

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println("Main Thread...");
				Thread.sleep(1000);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}