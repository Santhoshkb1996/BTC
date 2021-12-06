package multithreading;

class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println("From Thread 1 - i = "+i);
		}
	}
	
}


class Thread2 extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println("From Thread 2 - i = "+i);
		}
	}
	
}

public class ThreadsDemo {

	public static void main(String[] args) {

		Thread thread1= new Thread1();
		Thread thread2= new Thread2();
		
		thread1.start();
		thread2.start();
		System.out.println("Hello");
		
	}

}