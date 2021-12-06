package Set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(11);
		set.add(12);
		set.add(20);
		set.add(18);
		set.add(6);
		set.add(98);
		System.out.println(set);
		
		System.out.println("Higher : "+ set.higher(15));
		System.out.println("Lower"+ set.lower(15));
		
		System.out.println("Ceiling : "+ set.ceiling(14));
		System.out.println("Floor : "+ set.floor(14));
		
		System.out.println(set.descendingSet());
		
		System.out.println("First : "+ set.first());
		System.out.println("Last : "+ set.last());
	}

}
