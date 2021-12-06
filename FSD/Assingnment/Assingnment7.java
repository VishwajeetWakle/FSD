// Write an algoritham to accept four numbers and display smallest and largest number

public class Assingnment7
{
	public static void main(String args[]) 
	{
		int num1 = 5;
		int num2 = 18;
 		int num3 = 11;
		int num4 = 15;
		
		if(num1>num2 && num1>num3 && num1>num4)
		{
			System.out.println("Greater number is " + num1);
		}
		else if(num2>num1 && num2>num3 && num2>num4)
		{
			System.out.println("Greater number is " + num2);
		}
		else if(num3>num1 && num3>num2 && num3>num4)
		{
			System.out.println("Greater number is " + num3);
		}
		else if(num4>num1 && num4>num2 && num4>num3)
		{
			System.out.println("Greater number is " + num4);
		}
	}
}