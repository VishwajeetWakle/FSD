package Set;

import java.util.LinkedHashSet;

public class LinkedHashDemo {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(11);
		set.add(12);
		set.add("Abc");
		set.add('A');
		set.add("Abc");
		set.add(98.45);
		System.out.println(set);
	}

}
