
public class ThreadSleepJoin {

	public static void main(String[] args) {
		PrintPattern t2 = new PrintPattern();
		PrintTable t1 = new PrintTable(t2);
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main thread end.........");
	}
}
class PrintTable extends Thread {
	PrintPattern p;
	public PrintTable(PrintPattern t2){
		this.p =t2;
	}
	public void run() {
		try {
			p.join(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 1; i<=10; i++) {
			System.out.println("5 * "+i+" = "+(5*i));
		} 
	}
}
class PrintPattern extends Thread{
	public void run() {
		for(int i = 1;i<=5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int j = 1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}