/* Write an algorithm to display following pattern

	111111111
	22222222
	3333333
	444444
	55555
	6666
	777
	88
	9
	88
	777
	6666
	55555
	444444
	3333333
	22222222
	111111111
*/

public class Assingnment22
{
	public static void main(String args[])
	{
		for( int r = 1; r <= 9; r++)
		{
			for( int c = 9; c >= r; c--)
			{
				System.out.print(r);
			}
		
		 System.out.println();
		}

		for( int r = 8; r >= 1; r--)
		{	
			int a=2;
			while(a>=9) 
			{
			for( int c = 1; c <= a; c++)
			{
				System.out.print(r);
			}
			a++;
			}
		 System.out.println();
		} 
	}
}

	
