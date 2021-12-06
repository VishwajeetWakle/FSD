/*
	1 2 3 4 5
	1 2 3 4 5
	1 2 3 4 5
i. e. r=3, c=5.
*/

public class NestedForDemo
{
	public static void main(String args[])
	{
		for(int r=1;r<=3;r++)
		{
			for(int c=1;c<=5;c++)
			{
			System.out.print(c + " ");
			}
		System.out.println();
		}
	}
}