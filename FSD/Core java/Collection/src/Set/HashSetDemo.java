package Set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(11);
		set.add(12);
		set.add("abc");
		set.add("xyz");
		set.add(10.32);
		set.add(11);
		set.add("end");
		
		System.out.println("Set is : "+set);
		
		set.remove(11);
		
		System.out.println("After remove 11 : "+set);
		
		
	}

}
