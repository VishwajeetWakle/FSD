public class ArrayM
{
	public static void main(String args[])
	{
		int marks[][]={
						{40, 73, 38, 84, 57},
						{86, 56, 45, 52, 34},
						{74, 55, 23, 43, 34},
						{91, 90, 92, 89, 88}
					  };
		for(int r = 0; r < marks.length; r++)
		{
			for(int c = 0; c < marks[r].length; c++)
			{
				System.out.print(marks[r][c]+"\t");
			}
			System.out.println();
		}
		System.out.println("==========================================================================================");
		int marks2[][]={
						{40, 73, 38, 84, 57},
						{86, 56, 45},
						{74, 55, 23, 34},
						{89, 88}
					  };
		for(int r = 0; r < marks2.length; r++)
		{
			for(int c = 0; c < marks2[r].length; c++)
			{
				System.out.print(marks2[r][c]+"\t");
			}
			System.out.println();
		}
	}
}