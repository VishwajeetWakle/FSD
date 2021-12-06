public class ConstructorDemo
{
	public static void main(String args[])
	{	
		Student stud1 = new Student();
		System.out.println("Id : " + stud1.id);
		System.out.println("Name : " + stud1.name);
		System.out.println("Age : " + stud1.age);
		
		Student stud2 = new Student(121, "Abcd", 22);
		System.out.println("Id : " + stud2.id);
		System.out.println("Name : " + stud2.name);
		System.out.println("Age : " + stud2.age);
	}
}

class Student
{
	private int id;
	private String name;
	private int age;
	public Student(){  // No Parameterized Constructor
		id=1;
		name = "Default Name";
		age = 1;
	}
	public Student(int i, String n, int a){  // 3 Parameterized Constructor
		id = i;
		name = n;
		age = a;
	}
}