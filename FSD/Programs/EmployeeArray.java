public class EmployeeArray
{
	public static void main(String []args)
	{
	EmpInfo employee[] = new EmpInfo[3];
	EmpInfo emp1 = new EmpInfo();
	emp1.id =121;
	emp1.name ="abc";
	emp1.salary = 34565.45;
	EmpInfo emp2 = new EmpInfo();
	emp2.id = 122;
	emp2.name = "Xyz";
	emp2.salary = 45765.87;
	EmpInfo emp3 = new EmpInfo();
	emp3.id = 123;
	emp3.name = "PQR";
	emp3.salary = 55767.32;
	
	employee[0] = emp1;
	employee[1] = emp2;
	employee[2] = emp3;
	
	for(int i = 0; i < employee.length; i++)
	{
		//System.out.println(employee[i]);
		EmpInfo e = employee[i];
		e.printInfo();
		System.out.println(e.id+"\t"+e.name+"\t"+e.salary);
		
	}
	System.out.println("====================");
	
	public void printInfo();
	{
		System.out.println("Employee Id : "+ id);
		System.out.println("Employee Name : "+ name);
		System.out.println("Employee Salary : "+ salary);
	}
	
	}
}

class EmpInfo
{
	int id;
	String name;
	double salary;
}