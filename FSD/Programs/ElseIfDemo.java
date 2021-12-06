/* percent = 30
  destingtion class 75-100
  first class 60-74
  second class 50-59
  pass class 35-49
  fail 0-34
*/
public class ElseIfDemo
{
	public static void main(String args[])
	{
		int percent = 74;
		
		if(percent >= 75 && percent <=100)
		{
			System.out.println("You got Distingtion");
		}
		else if(percent >= 60 && percent <=74)
		{
			System.out.println("You got First Class");
		}
		else if(percent >= 50 && percent <=59)
		{
			System.out.println("You got Second Class");
		}
		else if(percent >= 35 && percent <=49)
		{
			System.out.println("You got Pass Class");
		}
		else
		{
			System.out.println("You are Fail");
		}
	}
}