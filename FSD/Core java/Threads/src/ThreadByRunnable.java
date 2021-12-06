
public class ThreadByRunnable {

	public static void main(String[] args) {
		Printer p = new Printer();
		Thread t = new Thread(p);
		t.start();
	}
}
class Printer implements Runnable {

	@Override
	public void run() {
		System.out.println("Created Thread by using runnable interface");
		System.out.println(Thread.currentThread());
	}
	
}