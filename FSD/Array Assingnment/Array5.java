// WAP to create an array of 10 int number and print sum of all the number on console

public class Array5
{
	public static void main(String args[])
	{
		int a =0;
		int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < 10; i++)
		{
			a = a + num[i];
		}
		System.out.println("Sum of all numbers : "+a);
	}
}