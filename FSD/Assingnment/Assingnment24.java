/** Write an algoritham to display following pattern
*
	**
	***
	****
	*****
	******
	*******
	********
	*********

	r = 9

*/

public class Assingnment24
{
	public static void main(String args[])
	{
		for(int r = 1; r <= 9; r++)
		{
			for( int c = 1; c <= r; c++)
			{
				System.out.print("*");
			}
		 System.out.println();
		}
	}
}