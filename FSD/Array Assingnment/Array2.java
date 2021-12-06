// WAP to create an array of 10 int number and print square of all the number on console

public class Array2
{
	public static void main(String args[])
	{
		int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for(int i = 0; i < 10; i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Square Of All Numbers");
		for(int i = 0; i < 10; i++)
		{
			System.out.println(num[i]*num[i]);
		}
	}
}