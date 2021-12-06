import java.util.*;  
public class SnakesAndLadders
{
	public static void main(String args[])
	{

		
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome The Game Enter Your Name : ");
		String name = s.nextLine();
		
		
		for(int a = 0; a < 100; )
		{
				int b;
				System.out.println(name+" you are at : "+ a);
				Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
				System.out.print("Enter The diase value : ");  
				b= sc.nextInt();
			
				if(b>0 && b<7)
			{
				 a = a + b;
				switch(a)
				{
				case 1 : a = a + 37;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 4 : a = a + 10;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 9 : a = a + 22;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 21 : a = a + 21;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 28 : a = a + 56;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 51 : a = a + 16;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 72 : a = a + 19;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 80: a = a + 19;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				
				case 17 : a = a - 10;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 54 : a = a - 20;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 62 : a = a - 43;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 64 : a = a - 4;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 87 : a = a - 51;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 93 : a = a - 20;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 95 : a = a - 20;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 98 : a = a - 19;
				System.out.println("You got a Snake-------------------------------");
				break;
				
				case 100 :
				System.out.println("You are win !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				
				}
			
			
			}
				else
			{
				System.out.println();
				System.out.println("The value is not accepted");
				System.out.println();
		
			
				
			}
			
			for(int c = 0; c < 100; )
		{
				int d;
				System.out.println(name+" you are at : "+ c);
				Scanner scn= new Scanner(System.in);    //System.in is a standard input stream  
				System.out.print("Enter The diase value : ");  
				d= scn.nextInt();
			
				if(d>0 && d<7)
			{
				 c = c + d;
				switch(c)
				{
				case 1 : c = c + 37;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 4 : c = c + 10;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 9 : c = c + 22;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 21 : c = c + 21;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 28 : c = c + 56;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 51 : c = c + 16;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 72 : c = c + 19;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				case 80: c = c + 19;
				System.out.println("You got a ladder++++++++++++++++++++++++++++++");
				break;
				
				case 17 : c = c - 10;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 54 : c = c - 20;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 62 : c = c - 43;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 64 : c = c - 4;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 87 : c = c - 51;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 93 : c = c - 20;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 95 : c = c - 20;
				System.out.println("You got a Snake-------------------------------");
				break;
				case 98 : c = c - 19;
				System.out.println("You got a Snake-------------------------------");
				break;
				
				case 100 :
				System.out.println("You are win !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				
				}
			
			
			}
				else
			{
				System.out.println();
				System.out.println("The value is not accepted");
				System.out.println();
		
			
				
			}
			
		}
	}
}}
