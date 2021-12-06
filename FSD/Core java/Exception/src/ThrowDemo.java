import java.util.*;
public class ThrowDemo {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);	
	 
	 System.out.println("Enter name : ");
	 String name = scan.next();
	 
	 System.out.println("Enter Contact No. : ");
	 String contact = scan.next();
	 
	 System.out.println("Enter Age : ");
	 int age = scan.nextInt();
	 
	 try {
		 if(contact.length()!=10) {
			 throw new InvalidDataException();
		 }
	 }catch(InvalidDataException e) {
		 e.displayError("Invalid Contact Number");
	 }
	 finally {
		 scan.close();
	 }
	 System.out.println("Use name : "+name);
	 System.out.println("User Contact : "+ contact);
	 System.out.println("User age : "+ age);
	 
	}

}
