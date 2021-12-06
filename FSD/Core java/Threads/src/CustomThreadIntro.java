
public class CustomThreadIntro {

	public static void main(String[] args) {
		System.out.println("====main thread statred====");
		Thread main =Thread.currentThread();
		main.setPriority(1);
		CustomThread custom = new CustomThread();
		custom.setPriority(10);
		custom.setName("New Thread");
		custom.start();
		System.out.println(Thread.currentThread());
		System.out.println("====main thread end====");
	}

}
class CustomThread extends Thread {
	public void run() {
		System.out.println("Custom thread started===========");
		//System.out.println(10/0);
		System.out.println("This is my first custom thread");
		System.out.println(Thread.currentThread());
		System.out.println("===========Custom thread ended");
	}
}