package Day14;

public class MultiThreadingDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Hello");
		
		Thread.sleep(3000);
		
		System.out.println("Hi");
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setName("Main thread");
		t.setPriority(4);
		System.out.println(t);
		
		String name = Thread.currentThread().getName();
		System.out.println(name);
	}
}