public class SynchronizationDemo {
	public static void main(String[] args) {
		ZeroxMech zerox = new ZeroxMech();
		Customer1 c1 = new Customer1(zerox);
		c1.setName("Customer1");
		Customer2 c2 = new Customer2(zerox);
		c2.setName("Customer2");
		
		c1.start();
		c2.start();
		
	}
}
class Customer1 extends Thread {
	private ZeroxMech zerox;
	public Customer1(ZeroxMech zerox) {
		this.zerox = zerox;
	}
	public void run() {
		synchronized (zerox) {
			for(int i =1; i<=10 ; i++) {
				zerox.print(getName() + " : " + i);
				try {
					
					if(i==5) {
						zerox.wait(1000);
					}
					
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Customer2 extends Thread {
	private ZeroxMech zerox;
	public Customer2(ZeroxMech zerox) {
		this.zerox = zerox;
	}
	public void run() {
		synchronized (zerox) {
			for(int i =1; i<=10 ; i++) {
				String val = "5 * "+ i + " = "+ (5*i);
				zerox.print(getName() + " : " + val);	
			}
			//zerox.notify(); //to notify single thread
			//zerox.notifyAll(); //to notify multiple thread
		}
	}
}

class ZeroxMech {
	//public synchronized void print(String val) { //syntax for synchronized method
	public void print(String val) {
		System.out.println(val);
	}
}