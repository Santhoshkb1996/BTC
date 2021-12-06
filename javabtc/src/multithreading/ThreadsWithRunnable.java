package multithreading;

class MyThread implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println("From Thread "+Thread.currentThread().getName()+" i = "+i);
		}
	}
}


public class ThreadsWithRunnable {

	public static void main(String[] args) {
		
		Runnable myRunnable=new MyThread();
		
		
		Thread myThread1=new Thread(myRunnable);
		
		Thread myThread2=new Thread(myRunnable);
		
		myThread1.setName("Thread A");
		myThread2.setName("Thread B");
		
		myThread1.start();
		myThread2.start();

	}

}