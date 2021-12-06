package abc;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(23);
		list.add(54.44);
		list.add("String");
		list.add('C');
		list.add(23);
		list.add("xyz");
		
		System.out.println("List is "+list);
		
		list.remove("String");
		
		System.out.println("After Remove : "+list);
		
		System.out.println("is list contain xyz : "+list.contains("xyz"));
		
		System.out.println("NO. of values in list : "+list.size());
		
		System.out.println("is list empty : "+list.isEmpty());
		
		list.clear();
		
		System.out.println("is list empty after clear : "+list.isEmpty());
		
		ArrayList list1 = new ArrayList();
		list1.add(34);
		list1.add("abcd");
		list1.add(34.44);
		list1.add(55);
		
		list.addAll(list1);
		
		System.out.println("After addAll : "+list);
		
		ArrayList list2 = new ArrayList();
		list2.add(34);
		list2.add(55);
		list2.add("Xyz");
		
		System.out.println("Conatains All : "+list.containsAll(list2));

		list.removeAll(list2);
		
		System.out.println("After remove all : "+ list);
	}
}
