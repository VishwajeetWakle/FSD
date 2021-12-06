public class MemoryMgmtRev
{
	public static void main(String args[])
	{
		Product p1 = new Product();
		Product p2 = new Product();
		p1.setMyProduct(110, 3 ,60);
		p2.id = 131;
		p2.qty = 5;
		p2.price = 22;
		p1.price = 50;
		p1.printTotalPrice();
		p2.printTotalPrice();
	
	}
}
class Product
{
	int id;
 	int qty;
	double price;
	public void printTotalPrice()
	{
		double total = qty * price;
		System.out.println("Total price is : "+ total);
	}

	public void setMyProduct(int i, int q ,double p)
	{
		id = i;
		qty = q;
		price = p;
	}
}