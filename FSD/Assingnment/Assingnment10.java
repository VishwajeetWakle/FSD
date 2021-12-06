// write an algorithm to acept 4 digit year and display wheather it is leap year

public class Assingnment10
{
	public static void main(String args[])
	{
		int year = 1996;
		if( year % 4 ==0 && year % 100 != 0 || year % 400 == 0)
		{
			System.out.println("The leap year is "+ year);
		}
		else 
		{
			System.out.println("This year is not leap year "+ year);
		}
	}
} 