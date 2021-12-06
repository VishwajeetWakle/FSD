public class ClassMethod
{
	public static void main(String args[])
	{
		System.out.println("This is main method");
		ClassMethod Obj = new ClassMethod();
		Obj.mul();
		Obj.div(12,6);
		int x = Obj.sub();
		System.out.println("sub : "+ x);
		int y = Obj.add(15,10);
		System.out.println("add : "+ y);

	}

	// Method to print the mul(*) of numbers
	public void mul() {
		int num1 = 30;
		int num2 = 12;
		System.out.println("Multification is : " + (num1 * num2));
	}

	// Method to accept the 2 int number and print div(/)
	public void div(int n1, int n2){
	
		System.out.println("Division is : " + (n1/n2));
	}
	// Method to return the sub(-) of 2 number

	public int sub(){
		int n1 = 30;
		int n2 = 12;
		int ans = n1-n2;
		return ans;
	}
	
	// method to accept 2 int number and return sum of number

	public int add(int n1, int n2)
	{
		int ans = n1+n2;
		return ans;
	}
}