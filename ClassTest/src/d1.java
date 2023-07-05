//2)Create 2 threads both threads will display odd numbers between “1 to 30”. As soon as number 15
//is encountered, first thread should release the lock and when the number is 11, second thread
//should release the lock. Once acquired the lock, first thread will resume from 15 and second thread
//will resume from 11. [ object lock, thread communication ]
class Thread1 implements Runnable {

	@Override
	synchronized public void run() {
		for (int i = 1; i < 31; i++) {
			if (Thread.currentThread().getName().equals("first")) {
				if (i==16) {
					try {
						wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				if (i%2!=0)
					System.out.print(+ i + " ");

			} else if (Thread.currentThread().getName().equals("second")) {
				if (i == 12) {
					try {
						wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				if (i % 2 != 0)
					System.out.print(+ i + " ");

			}
			notifyAll();

		}

	}

}

public class d1 {
	public static void main(String[] args) {
		Thread1 ob = new Thread1();
		Thread t1 = new Thread(ob, "first");
		Thread t2 = new Thread(ob, "second");
		t1.start();

		t2.start();

	}

}