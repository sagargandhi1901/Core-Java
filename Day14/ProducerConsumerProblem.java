package Day14;

class Producer extends Thread {

	// Producer producing the data in StringBuilder form
	StringBuilder sb;

	// variable used by thread for communication
	boolean dataProvider = false;

	public Producer() {

		// StringBuilder object is initialized with initial capacity of 16
		sb = new StringBuilder();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				sb.append(i == 10 ? i : (i + " : "));
				Thread.sleep(100);
				System.out.println("Appending data...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// informing the consumer that data is produced
		dataProvider = true;
	}
}

class Consumer extends Thread {

	// Creating producer object to get the produced data
	Producer producer;
	
	// injecting producer object into consumer
	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		
		// if data is not available yet, keep waiting
		while(producer.dataProvider == false) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// consumer the data produced by producer
		System.out.println(producer.sb);
	}
}

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t2.start();						// consumer should wait
		t1.start();						// producer should start
	}
}