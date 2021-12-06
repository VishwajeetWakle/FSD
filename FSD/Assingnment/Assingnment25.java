/*
	25. Write an algorithm to display following pattern
	Note: There are nine * in first line
	*********
	  *******
	    *****
	      ***
	        *
*/

public class Assingnment25
{
	public static void main(String args[])
	{
		for(int r = 1; r <= 9; r++)
		{
			for(int c = 9; c >=r ; c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}