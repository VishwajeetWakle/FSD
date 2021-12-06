package abc;
import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList studId = new ArrayList();
		studId.add(45);
		studId.add(34);
		studId.add(56);
		studId.add(12);
		studId.add(65);
		studId.add(33);
		
		System.out.println(studId);
		
		System.out.println("At 2nd index : "+studId.get(2));;
		studId.add(2, 10);
		System.out.println(studId);
		studId.remove(4);
		System.out.println(studId);
		studId.set(3, 60);
		System.out.println(studId);
	}

}
