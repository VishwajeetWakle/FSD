public class Inheritance
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.childclass();
	}
}
class Parent
{
	int a = 10;
	public void print()
	{
		System.out.println("This is parent class");
	}
}
class Child extends Parent
{
	public void childclass()
	{
		System.out.println(a);
		print();
	}
}