package Day14;

class Soldier implements Runnable {

	String resourse1 = new String("Guns");
	String resourse2 = new String("Tanks");
	String resourse3 = new String("Granade");

	@Override
	public void run() {
		try {
			String str1 = Thread.currentThread().getName();
			if (str1.equals("Soldier1")) {
				soldier1AcquiredResurces();
			} else {
				soldier2AcquiredResurces();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void soldier1AcquiredResurces() {
		try {
			Thread.sleep(4000);

			synchronized (resourse1) {
				System.out.println("Soldier 1 has acquired " + resourse1);
				Thread.sleep(4000);
				synchronized (resourse2) {
					System.out.println("Soldier 1 has acquired " + resourse2);
					Thread.sleep(4000);
					synchronized (resourse3) {
						System.out.println("Soldier 1 has acquired " + resourse3);
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void soldier2AcquiredResurces() {
		try {
			Thread.sleep(4000);

			synchronized (resourse1) {
				System.out.println("Soldier 2 has acquired " + resourse1);
				Thread.sleep(4000);
				synchronized (resourse2) {
					System.out.println("Soldier 2 has acquired " + resourse2);
					Thread.sleep(4000);
					synchronized (resourse3) {
						System.out.println("Soldier 2 has acquired " + resourse3);
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class ThreadStates {
	public static void main(String[] args) {
		Soldier soldier = new Soldier();

		Thread thread1 = new Thread(soldier);
		Thread thread2 = new Thread(soldier);

		thread1.setName("Soldier1");
		thread2.setName("Soldier2");

		thread1.start();
		thread2.start();
	}
}