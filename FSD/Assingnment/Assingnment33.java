/*
	33. Write an algorithm to accept 10 numbers and display in ascending order. Also display the same
	numbers in descending order
*/

public class Assingnment33
{
	public static void main(String args[])
	{
		int temp, i, j;
		int array[] = new int[]{ 1, 2, 4, 8, 5, 9, 7, 6, 10, 3};
		int num = array.length;
		 for (i = 0; i < ( num - 1 ); i++) 
		{
     			 for (j = 0; j < num - i - 1; j++) 
			{
   			     if (array[j] < array[j+1]) 
     			   {
          			 temp = array[j];
         			  array[j] = array[j+1];
          			 array[j+1] = temp;
       			   }	
     			 }
		 }
	}
}