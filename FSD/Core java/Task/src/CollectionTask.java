import java.util.LinkedList;
import java.util.List;

public class CollectionTask {

	public static void main(String[] args) {
		Product p1 = new Product(111, "SmartTv", 34000, 1);
		Product p2 = new Product(222, "PowerBackup", 3000, 2);
		Product p3 = new Product(333, "BlutoothSpeaker", 3500, 2);
		LinkedList<Product> cart = new LinkedList<Product>();
		cart.add(p1);
		cart.add(p2);
		cart.add(p3);
		printDetails(cart);

	}
	public static void printDetails(List<Product> cart) {
		double a = 0;
		for(Product c:  cart) {
		System.out.println( c.getId()+"\t"+c.getName()+"\t"+c.getPrice()+"\t"+c.getQty());
		a = a +(c.getPrice()*c.getQty());
		}
		System.out.println("============================");
		System.out.println("Total Amount : "+a);
	}
}
class Product {
	private int id;
	private String name;
	private double price;
	private int qty;
	public Product(int id, String name, double price, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.qty = qty;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getQty() {
		return qty;
	} 
}