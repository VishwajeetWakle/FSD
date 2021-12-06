public class StringBuliderDemo
{
	public static void main(String args[])
	{
		StringBuilder sbr = new StringBuilder("Hello");
		System.out.println("Orignal Value is : "+ sbr);
		sbr.append("Program");
		System.out.println("After Append : "+ sbr);
		sbr.insert(5, "Java");
		System.out.println("After Insert : "+ sbr);
		sbr.replace( 6 , 10, "String");
		System.out.println("After Replace : "+ sbr);
		sbr.delete(0,6);
		System.out.println("After Delete : "+ sbr);
		sbr.reverse();
		System.out.println("After Reverse : "+ sbr);
		System.out.println("Lenght of string : "+sbr.length());
		System.out.println("Capacity of string : "+sbr.capacity());
	}
}