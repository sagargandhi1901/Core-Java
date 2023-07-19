package Day14;

class Chatroom implements Runnable {

	@Override
	public synchronized void run() {
		try {
			 System.out.println(Thread.currentThread().getName() + " has entered the chatroom");
			 Thread.sleep(3000);
			 System.out.println(Thread.currentThread().getName() + " is chatting now");
			 Thread.sleep(3000);
			 System.out.println(Thread.currentThread().getName() + " has exited the chatroom");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class MultiThreadingDemo6 {
	public static void main(String[] args) {
		Chatroom chatRoom = new Chatroom();
		
		Thread thread1 = new Thread(chatRoom);
		Thread thread2 = new Thread(chatRoom);
		Thread thread3 = new Thread(chatRoom);
		
		thread1.setName("Person1");
		thread2.setName("Person2");
		thread3.setName("Person3");
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}