/* 
Create a class product with product id-int, product name-string, product price-double
create array with neme "cart" of product class print the cart bill as follow

1	p1	102
2	p2	98
3 	p3 	500
=================
total amount 700
*/

public class Task2
{
	public static void main(String args[])
	{
		Product cart[] = new Product[4];
		Product p1 = new Product();
		p1.id = 121;
		p1.name = "Vivo y51";
		p1.price = 19999.00;
		p1.qty = 2;
		Product p2 = new Product();
		p2.id = 122;
		p2.name = "Dell-MQ16";
		p2.price = 39499.00;
		p2.qty = 1;
		Product p3 = new Product();
		p3.id = 123;
		p3.name = "Sound-S3";
		p3.price = 4598.00;
		p3.qty = 4;
		Product p4 = new Product();
		p4.id = 124;
		p4.name = "Dairy Milk";
		p4.price = 100.00;
		p4.qty = 5;
		cart[0] = p1;
		cart[1] = p2;
		cart[2] = p3;
		cart[3] = p4;
		double total=0.0;
		for(int i =0; i<cart.length; i++)
		{
			Product p = cart[i];
			System.out.println(p.id+"\t"+p.name+"\t"+p.price+"\t"+p.qty+"\t"+"Total Price : "+(p.qty*p.price));
			total = total + (p.price*p.qty);
		} 
		System.out.println("==============================================================");
		System.out.println("Total Amount : "+total);
	}
}
class Product
{
	int id;
	String name;
	double price;
	int qty;
}