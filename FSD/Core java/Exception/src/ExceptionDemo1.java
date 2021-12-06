import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo1 {

	public static void main(String[] args) {
		int nums[] = {34, 56, 78, 0, 64, 7, 4, 55};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = scan.nextInt();
		try {
			System.out.println("Div : "+ (10/n));
		 try {
			System.out.println("Square of number is : "+nums[n]*nums[n]);
		 
		 	}
		 	catch (InputMismatchException e) {
		 		System.out.println("Invalid input, Please provide numeric value only...");
		 	}
		 	catch(IndexOutOfBoundsException e) {
		 		System.out.println("Invaid index provided, only 0-7");
		 	}
		
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println("Invalid input");
		}
		finally {
			scan.close();
		}
	}

}
