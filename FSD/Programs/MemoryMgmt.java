public class MemoryMgmt
{
	public static void main(String args[])
	{
		EmployeeData e1 = new EmployeeData();
		EmployeeData e2 = new EmployeeData();
		e1.setEmployeeData(121, 23423.45, 'M');
		e2.printEmployeeData();
		e1.printEmployeeData();
	}
}
class EmployeeData
{
	int id;
	double salary;
	char gender;

	public void setEmployeeData( int i, double s, char g)
	{
		id = i;
		salary = s;
		gender = g;
	}

	public void printEmployeeData()
	{
		System.out.println("Id : "+ id);
		System.out.println("Salary : "+ salary);
		System.out.println("Gender : "+ gender);
	}
}