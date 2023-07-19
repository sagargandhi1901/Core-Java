package Day14;

class Producer2 extends Thread {

	// Producer producing the data in StringBuilder form
	StringBuilder sb;

	public Producer2() {

		// StringBuilder object is initialized with initial capacity of 16
		sb = new StringBuilder();
	}

	@Override
	public void run() {
		synchronized (sb) {
			for (int i = 1; i <= 10; i++) {
				try {
					sb.append(i == 10 ? i : (i + " : "));
					Thread.sleep(100);
					System.out.println("Appending data...");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// send the notification to the waiting thread
			sb.notify();
		}
	}
}

class Consumer2 extends Thread {

	// Creating producer object to get the produced data
	Producer2 producer;
	
	// injecting producer object into consumer
	public Consumer2(Producer2 producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		
		synchronized (producer.sb) {
			try {
				
				// wait till the notification is sent by producer
				producer.sb.wait();
				
				// consumer the data produced by producer
				System.out.println(producer.sb);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerSolution {
	public static void main(String[] args) {
		Producer2 producer = new Producer2();
		Consumer2 consumer = new Consumer2(producer);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t2.start();						// consumer should wait
		t1.start();						// producer should start
	}
}