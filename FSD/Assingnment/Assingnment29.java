/**
	Write an algorithm to accept number and display its table.
	output :
		7*1=7
		7*2=14
		.
		.	
		.
		7*10=70
*/

public class Assingnment29
{
	public static void main(String args[])
	{
		int num = 7;
		int i = 1;
		while(i<=10)
		{
			int table = num*i;
			System.out.println("7 * " + i +" = "+ table);
			i++;
		}
	}
}