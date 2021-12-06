public class StudentDetails
{
	public static void main(String args[])
	{
		Student stud = new Student();
		stud.setId(12);
		stud.setName("Sagar");
		stud.setCon("7709951701");

		System.out.println("Id : "+ stud.getId());

		StudentDetails details = new StudentDetails();
		details.displayStudData(stud);	
	}

	public void displayStudData(Student st){
		System.out.println("Id : "+ st.getId());
		System.out.println("name : "+ st.getName());
		System.out.println("Contact : "+ st.getCon());
	}
}

class Student
{
	private int studId;
	private String name;
	private String contact;

	public void setId(int i){
		if(i>=1 && i<=1000){
			studId = i;
		}else{
			System.out.println("Invalid Student Id....");
			System.exit(0);
		}
	}
	public int getId(){
		return studId;
	}

	public void setName(String s){
		name = s;
	}

	public String getName(){
		return name;
	}

	public void setCon(String s){
		contact = s;
	}	

	public String getCon(){
		return contact;
	}
}