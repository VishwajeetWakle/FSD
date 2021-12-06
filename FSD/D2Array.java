public class D2Array
{
	public static void main(String args[])
	{
		int marks[][] = {
					{78, 87, 67, 91},
					{98, 78, 34, 87},
					{66, 66, 66, 66},
					{77, 77, 77, 77}
				};
		double percentage=0.0;
		double a[]={0.0, 0.0, 0.0, 0.0};
		for(int r = 0; r < marks.length; r++)
		{
		int total = 0;
		System.out.println();
		System.out.println();
			for(int c = 0; c < marks[r].length; c++)
			{	
				System.out.print(marks[r][c]+"\t");
				total=total + marks[r][c];
			}
				
		System.out.println("Toatal Marks of student "+(r+1)+" : " +total);
		percentage = ((double)(total) / 400) * 100;
		System.out.println();
		System.out.println();
		System.out.println("Percentage of student "+(r+1)+" : "+percentage);
		
		a[r] = percentage;
		}
		System.out.println();
		

		System.out.println();
		System.out.println();
		System.out.println();
		
  		if (a[0] > a[1])
   			if (a[0] > a[2])
				if (a[0] > a[3])
    					System.out.println("The greatest percentage is : " + a[0]);
   
  		if (a[1] > a[0])
   			if (a[1] > a[2])
				if (a[1] > a[3])
    					System.out.println("The greatest percentage is : " + a[1]);
   
  		if (a[2] > a[0])
   			if (a[2] > a[1])
				if (a[2] > a[3])
    					System.out.println("The greatest percentage is : " + a[2]);

		else
					System.out.println("The greatest percentage is : "+ a[3]);
		
	}
}