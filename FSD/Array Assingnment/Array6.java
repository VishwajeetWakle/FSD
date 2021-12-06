// WAP to create an array of 10 int number and print average of all the number on console

public class Array6
{
	public static void main(String args[])
	{
		int a = 0;
		int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < 10; i++)
		{
			a = a + num[i];
		}
		int b = a/num.length;
		System.out.println("Average of all numbers is : "+b);
	}
}