/*
	1 1 1 1 1 
	2 2 2 2 2
	3 3 3 3 3 
	4 4 4 4 4
r= 4, c= 5
*/

public class NestedForDemo2
{
	public static void main(String args[])
	{
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=5;c++)
			{
				System.out.print( r +" ");
			}
			System.out.println();
		}
	}
}