// Write an algoritham to calculate simple intrest. Note : accept requried information from user 
// Simple intrest = Principle amount * Rate of intrest * Time period

public class Assingnment4
{
	public static void main(String args[])
	{
		int P = 5000; // in amount 
		int R = 3; // 3%
		int T = 2; // 2 year
		int SI = (P*R*T)/100;
		System.out.println("Simple Intrest is in Rs. " + SI);
	}
}