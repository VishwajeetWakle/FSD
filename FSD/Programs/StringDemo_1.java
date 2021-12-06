public class StringDemo_1
{
	public static void main(String args[])
	{
		String studName = new String("Amit");
		String empName = "Raj";

		System.out.println(studName);
		System.out.println(empName);
		System.out.println(studName == empName);

		String s1 = new String("Hello");	
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = "Hello";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s4);
	

	}
}